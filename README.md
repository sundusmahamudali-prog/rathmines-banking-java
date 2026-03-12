# 🏦 Rathmines Banking System (Java)

A professional Java application demonstrating **Object-Oriented Analysis and Design (OOAD)**. This system manages multiple user profiles with independent balances and secure authentication.

## 🏗️ Architecture
The project is split into three distinct layers:
* **`Profile.java`**: The Data Model. Represents an individual customer with a username, password, and balance.
* **`Bank.java`**: The Controller. Manages the collection of all profiles and handles the login validation logic.
* **`Application.java`**: The Interface. Provides the console-based menu for users to create accounts, deposit, and withdraw funds.

## 🌟 Advanced Java Concepts
* **Composition**: The `Bank` class contains an `ArrayList` of `Profile` objects, showing how objects interact within a system.
* **Encapsulation**: All sensitive data like balances and passwords are marked `private` to ensure data integrity.
* **User Sessions**: Features a `while` loop that keeps a user logged in until they explicitly choose to logout.

## 🛠️ How to Run
1. Open your terminal or command prompt.
2. Compile all files:
   ```bash
   javac SA1Sundus/*.java
