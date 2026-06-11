package com.deepcode.expensetracker.controller;

import com.deepcode.expensetracker.service.GeminiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
@CrossOrigin(origins = "*")
public class ChatController {

    @Autowired
    private GeminiService geminiService;

    @PostMapping
    public String chat(
            @RequestBody String message
    ) {

        return geminiService.askGemini(message);
    }
}