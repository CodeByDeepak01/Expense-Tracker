package com.deepcode.expensetracker.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class GeminiService {

    @Value("${gemini.api.key}")
    private String apiKey;

    public String askGemini(String prompt) {

        try {

            URL url = new URL(
                    "https://generativelanguage.googleapis.com/v1beta/models/gemini-flash-latest:generateContent"
            );

            HttpURLConnection conn =
                    (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("POST");

            conn.setRequestProperty(
                    "Content-Type",
                    "application/json"
            );

            conn.setRequestProperty(
                    "X-goog-api-key",
                    apiKey
            );

            conn.setDoOutput(true);

            String body = """
            {
              "contents": [
                {
                  "parts": [
                    {
                      "text": "%s"
                    }
                  ]
                }
              ]
            }
            """.formatted(prompt);

            try (OutputStream os =
                         conn.getOutputStream()) {

                os.write(body.getBytes());
            }

            InputStream stream;

            if (conn.getResponseCode() >= 400) {
                stream = conn.getErrorStream();
            } else {
                stream = conn.getInputStream();
            }

            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(stream)
                    );

            StringBuilder response =
                    new StringBuilder();

            String line;

            while ((line = br.readLine()) != null) {
                response.append(line);
            }

            System.out.println(response);

            JsonObject json =
                    JsonParser.parseString(
                            response.toString()
                    ).getAsJsonObject();

            System.out.println("FULL RESPONSE:");
            System.out.println(response.toString());
            System.out.println("HTTP CODE = " + conn.getResponseCode());
            return json
                    .getAsJsonArray("candidates")
                    .get(0)
                    .getAsJsonObject()
                    .getAsJsonObject("content")
                    .getAsJsonArray("parts")
                    .get(0)
                    .getAsJsonObject()
                    .get("text")
                    .getAsString();

        } catch (Exception e) {

            e.printStackTrace();

            return e.getMessage();
        }
    }
}