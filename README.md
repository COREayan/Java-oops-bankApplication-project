# 💳 Java OOP Bank Application

This repository showcases a Java-based bank application that leverages Object-Oriented Programming (OOP) principles. The application reads customer data from a CSV file and creates a list of account objects, demonstrating concepts like encapsulation, inheritance, and polymorphism.


Java-oops-bankApplication-project/
├── src/
│   ├── BankAccount.java
│   ├── CheckingAccount.java
│   ├── SavingsAccount.java
│   ├── Account.java
│   └── BankApp.java
├── NewBankAccounts.csv
├── .gitignore
└── README.md

🧰 Features
- CSV Data Import: Reads customer information from a CSV file to initialize accounts.
- Account Types: Supports both Savings and Checking accounts with distinct features.
- Unique Account Numbers: Generates unique account numbers based on specific criteria.
- Interest Rates: Applies different interest rates for each account type.
- Transaction Operations: Allows deposits, withdrawals, and transfers between accounts.
- OOP Principles: Demonstrates encapsulation, inheritance, and polymorphism.

🚀 Getting Started
Prerequisites
- Java Development Kit (JDK) 8 or higher.
- An IDE like IntelliJ IDEA or Eclipse (optional).

  📄 CSV File Format
The NewBankAccounts.csv file should be formatted as follows:

Name,SSN,AccountType,InitialDeposit
John Doe,123456789,Savings,1000
Jane Smith,987654321,Checking,1500

- Name: Full name of the account holder.
- SSN: Social Security Number (used for account number generation).
- AccountType: Type of account (Savings or Checking).
- InitialDeposit: Initial deposit amount.
