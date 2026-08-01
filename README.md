<p align="center">
  <img src="assets/banner/banner.png" width="100%" alt="ATM Simulation System Banner">
</p>

<h1 align="center">🏧 ATM Simulation System</h1>

<p align="center">
A feature-rich desktop banking application developed using <b>Java Swing</b>, <b>JDBC</b>, and <b>MySQL</b> that simulates the functionality of a real-world Automated Teller Machine (ATM). The application offers secure authentication, account management, and essential banking services through an intuitive graphical user interface.
</p>

<p align="center">
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white">
<img src="https://img.shields.io/badge/Java%20Swing-GUI-success?style=for-the-badge">
<img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
<img src="https://img.shields.io/badge/JDBC-Database-blue?style=for-the-badge">
<img src="https://img.shields.io/badge/Desktop%20Application-Java-success?style=for-the-badge">
</p>

---

# 📖 About The Project

The **ATM Simulation System** is a desktop-based banking application designed to simulate the core functionality of a real-world Automated Teller Machine (ATM). Built using **Java Swing**, **JDBC**, and **MySQL**, the project provides users with a secure and interactive environment to perform day-to-day banking operations.

Users can create a new account, authenticate using their **Card Number** and **PIN**, and perform various banking services including deposits, withdrawals, balance enquiry, fast cash transactions, PIN changes, and viewing mini statements. Every transaction is securely stored in a MySQL database, ensuring persistent record management and transaction history.

This project demonstrates practical implementation of:

- Object-Oriented Programming (OOP)
- Java Swing GUI Development
- JDBC Database Connectivity
- MySQL Database Management
- Authentication & Authorization
- Transaction Processing
- Event-Driven Programming
- CRUD Operations

The application is designed with an ATM-inspired graphical interface to provide a realistic user experience while showcasing core Java development concepts.

---

# ✨ Features

## 🔐 Secure Authentication

- Secure Login using Card Number & PIN
- New Customer Registration
- Multi-step Account Creation
- Card Number Verification
- PIN Authentication

---

## 💳 Banking Services

- Deposit Money
- Withdraw Money
- Fast Cash
- Balance Enquiry
- PIN Change
- Mini Statement Generation

---

## 🗄 Database Management

- MySQL Database Integration
- JDBC Connectivity
- Persistent Transaction Storage
- Customer Information Management
- Login Credential Storage
- Banking Transaction Records

---

## 🖥 User Experience

- ATM-inspired Graphical Interface
- Interactive Navigation
- Simple & User-Friendly Design
- Real-Time Transaction Updates
- Smooth Banking Workflow

---

# 📸 Screenshots

## 🔑 Login Screen

<p align="center">
<img src="assets/screenshots/login.png" width="80%">
</p>

---

## 🏧 ATM Dashboard

<p align="center">
<img src="assets/screenshots/atm_interface.png" width="80%">
</p>

---

## 💵 Deposit Money

<p align="center">
<img src="assets/screenshots/deposit.png" width="80%">
</p>

---

## 💸 Withdraw Money

<p align="center">
<img src="assets/screenshots/withdraw.png" width="80%">
</p>

---

## ⚡ Fast Cash

<p align="center">
<img src="assets/screenshots/fastcash.png" width="80%">
</p>

---

## 📄 Mini Statement

<p align="center">
<img src="assets/screenshots/mini_statement.png" width="70%">
</p>

---

# 🛠 Tech Stack

| Category | Technology |
|-----------|------------|
| Programming Language | Java |
| GUI Framework | Java Swing |
| Database | MySQL |
| Database Connectivity | JDBC |
| External Library | JCalendar |
| Development Environment | Eclipse / IntelliJ IDEA / VS Code |
| Version Control | Git & GitHub |
| Operating System | Windows |

---

# 🏗 System Architecture

The application follows a layered architecture where the graphical user interface interacts with the business logic, which communicates with the MySQL database through JDBC.

```text
                        ATM Simulation System

        ┌──────────────────────────────────────────────┐
        │              Java Swing GUI                  │
        │   (Login, Signup, ATM Dashboard, Forms)      │
        └──────────────────────────────────────────────┘
                            │
            ┌───────────────┼────────────────┐
            │               │                │
            ▼               ▼                ▼
     Authentication    Banking Services   Account Management
      Login/Signup   Deposit • Withdraw   PIN Change • Balance
                            │
                            ▼
                  Transaction Processing
                            │
                            ▼
                    JDBC Connectivity Layer
                            │
                            ▼
                      MySQL Database
```

---

# ⚙️ Application Workflow

The following workflow illustrates how a typical banking transaction is processed.

```text
              User Launches Application
                         │
                         ▼
                 Login / Registration
                         │
                         ▼
           Authenticate Card Number & PIN
                         │
               ┌─────────┴─────────┐
               │                   │
         Authentication        Authentication
             Success              Failed
               │                   │
               ▼                   ▼
      Display ATM Dashboard   Show Error Message
               │
               ▼
      Select Banking Operation
               │
               ▼
      Execute Requested Operation
               │
               ▼
      Update MySQL Database
               │
               ▼
 Display Updated Information to User
               │
               ▼
          Exit / Logout
```

---

# 🗄 Database Schema

The application uses **MySQL** as the backend database to securely store customer information, login credentials, account details, and banking transactions.

## Database Tables

| Table | Purpose |
|---------|---------|
| **signup** | Stores customer personal information |
| **signupTwo** | Stores additional customer details |
| **signupThree** | Stores account type, card number, PIN, and banking facilities |
| **login** | Stores authentication credentials |
| **bank** | Stores deposits, withdrawals, and transaction history |

---

## Database Script

The SQL script required to set up the database is available inside:

```text
database/
└── bankmanagementsystem.sql
```

---

# 📂 Project Structure

```text
ATM-Simulator-System
│
├── assets
│   ├── banner
│   │   └── banner.png
│   │
│   └── screenshots
│       ├── login.png
│       ├── atm_interface.png
│       ├── deposit.png
│       ├── withdraw.png
│       ├── fastcash.png
│       └── mini_statement.png
│
├── database
│   └── bankmanagementsystem.sql
│
├── lib
│   ├── mysql-connector-java-8.0.28.jar
│   └── jcalendar-tz-1.3.3-4.jar
│
├── src
│   ├── Login.java
│   ├── SignupOne.java
│   ├── SignupTwo.java
│   ├── SignupThree.java
│   ├── Deposit.java
│   ├── Withdraw.java
│   ├── FastCash.java
│   ├── BalanceEnquiry.java
│   ├── MiniStatement.java
│   ├── PinChange.java
│   ├── Transactions.java
│   ├── Conn.java
│   │
│   └── icons
│       ├── atm.jpg
│       ├── logo.jpg
│       └── ...
│
└── README.md
```

---

# 💡 Key Concepts Demonstrated

This project showcases practical implementation of several important Java concepts:

- Object-Oriented Programming (OOP)
- Java Swing GUI Development
- JDBC Database Connectivity
- MySQL Database Management
- Event-Driven Programming
- Authentication & Authorization
- Transaction Processing
- CRUD Operations
- Modular Application Design
- Desktop Application Development

---

# 🚀 Getting Started

Follow these steps to set up and run the project on your local machine.

## 1️⃣ Clone the Repository

```bash
git clone https://github.com/TanmayT134/ATM-Simulation-System-using-Java.git
```

---

## 2️⃣ Open the Project

Import the project into your preferred Java IDE.

Supported IDEs:

- Eclipse IDE
- IntelliJ IDEA
- Visual Studio Code

---

## 3️⃣ Install Required Libraries

Ensure the following libraries are available in your project.

| Library | Purpose |
|----------|----------|
| mysql-connector-java-8.0.28.jar | MySQL JDBC Driver |
| jcalendar-tz-1.3.3-4.jar | Date Picker Component |

These libraries are already included inside the **lib** folder.

---

# ⚙️ Database Setup

### Step 1

Install **MySQL Server** on your system.

---

### Step 2

Create the database.

```sql
CREATE DATABASE bankmanagementsystem;
```

---

### Step 3

Import the SQL script located at:

```text
database/bankmanagementsystem.sql
```

---

### Step 4

Open

```text
src/Conn.java
```

Update your database credentials.

Example:

```java
String url = "jdbc:mysql://localhost:3306/bankmanagementsystem";
String username = "your_username";
String password = "your_password";
```

---

### Step 5

Run

```text
Login.java
```

The ATM application is now ready to use.

---

# ▶️ Usage

### Create a New Account

- Register as a new customer.
- Complete the account creation process.
- Receive your Card Number and PIN.

---

### Login

- Enter your Card Number.
- Enter your PIN.
- Authenticate securely.

---

### Perform Banking Operations

Choose any available banking service:

- Deposit Money
- Withdraw Money
- Fast Cash
- Balance Enquiry
- PIN Change
- Mini Statement

---

### Exit

Close the application once all transactions have been completed.

---

# 🎯 Learning Outcomes

This project helped strengthen practical knowledge of:

- Java Object-Oriented Programming
- Java Swing GUI Development
- JDBC Connectivity
- MySQL Database Integration
- Event-Driven Programming
- CRUD Operations
- Authentication Systems
- Banking Transaction Processing
- Desktop Application Development
- Software Architecture Fundamentals

---

# 🚀 Future Enhancements

The following features can further improve the application:

- 💳 Fund Transfer Between Accounts
- 📄 Printable Transaction Receipts
- 📧 Email Transaction Notifications
- 📱 SMS Alerts
- 🔐 Password Encryption
- 👤 User Profile Management
- 🧾 Detailed Transaction Reports
- 🏦 Admin Dashboard
- 🌍 Multi-language Support
- ☁️ Cloud Database Integration
- 📲 Mobile Banking Companion App
- 📊 Analytics Dashboard

---

# 🤝 Contributing

Contributions are welcome!

If you'd like to improve this project:

1. Fork the repository.
2. Create a new feature branch.

```bash
git checkout -b feature/YourFeature
```

3. Commit your changes.

```bash
git commit -m "Add Your Feature"
```

4. Push the branch.

```bash
git push origin feature/YourFeature
```

5. Open a Pull Request.

---

# 👨‍💻 Author

<div align="center">

## Tanmay Tawade

Java Developer • Web Developer • AI & Machine Learning Enthusiast

</div>

---

<div align="center">

### ⭐ If you found this project helpful, consider giving it a star!

Your support helps motivate continued development and the creation of more open-source projects.

Thank you for visiting this repository!

**Made with ❤️ by Tanmay Tawade**

</div>
