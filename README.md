# 💰 Expense Tracker with AI Assistant

An AI-powered Expense Tracker built using **Java, Spring Boot, MySQL, HTML, CSS, JavaScript, Chart.js, and Gemini AI**.

This application allows users to manage expenses, visualize spending patterns, and receive AI-powered financial insights based on their expense data.

---

## 🚀 Features

### Expense Management

* Add Expenses
* Update Expenses
* Delete Expenses
* View All Expenses
* Store Category, Amount, Description, and Date

### Dashboard

* Total Expense Calculation
* Balance Overview
* Expense Summary Cards

### Expense Analysis

* Category-wise Expense Analysis
* Pie Chart Visualization
* Interactive Reports

### AI Financial Assistant 🤖

The Gemini AI assistant can:

* Analyze spending habits
* Identify high-expense categories
* Suggest ways to save money
* Summarize expense records
* Answer questions based on stored expense data

### User Experience

* Responsive Design
* Interactive UI
* Modern Dashboard
* Real-Time Updates

---

## 🛠️ Tech Stack

### Backend

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* REST APIs

### Database

* MySQL

### Frontend

* HTML
* CSS
* JavaScript

### Charts

* Chart.js

### AI Integration

* Gemini AI API

---

## 📂 Project Structure

```text
src
├── main
│   ├── java
│   │   └── com.deepcode.expensetracker
│   │       ├── controller
│   │       ├── service
│   │       ├── repository
│   │       ├── entity
│   │       ├── dto
│   │       └── ExpenseTrackerApplication.java
│   │
│   └── resources
│       └── application.properties
```

---

## ⚙️ Installation

### Clone Repository

```bash
git clone https://github.com/CodeByDeepak01/Expense-Tracker.git
cd Expense-Tracker
```

### Create Database

```sql
CREATE DATABASE expense_tracker;
```

### Configure Database

Update `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
```

### Configure Gemini API

```properties
gemini.api.key=YOUR_GEMINI_API_KEY
```

⚠️ Never commit real passwords or API keys to GitHub.

### Run Application

```bash
mvn spring-boot:run
```

Application runs at:

```text
http://localhost:8080
```

---

## 📊 AI Assistant Examples

Try asking:

```text
How much did I spend on Food?
```

```text
Which category has the highest expense?
```

```text
Analyze my spending habits.
```

```text
Give me suggestions to save money.
```

---

## 🔮 Future Enhancements

* User Authentication
* Budget Management
* Monthly Reports
* Expense Prediction
* PDF/Excel Export
* Multi-User Support
* Cloud Deployment

---

## 📚 What I Learned

* Spring Boot Development
* REST API Design
* JPA & Hibernate
* MySQL Integration
* Frontend & Backend Communication
* Gemini AI Integration
* Data Visualization with Chart.js
* Full Stack Development

---

## 👨‍💻 Author

**Deepak**

GitHub: https://github.com/CodeByDeepak01

---

⭐ If you found this project useful, consider giving it a star!
