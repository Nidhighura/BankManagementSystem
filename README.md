# 🏦 Bank Management System


The Bank Management System is a Java Swing-based desktop application that simulates basic banking operations. Users can create accounts, deposit and withdraw money, perform fast cash transactions, check balances, and view mini statements. It uses MySQL for backend data storage.

Click here to see screenshots/demo: (Add GitHub Pages link or GIF here)

# 🌟 Features

- Secure Login: Access using card number and PIN.

- Multi-step Account Signup: Collects detailed user information.

- Deposit: Add money to account with validation.

- Withdraw: Withdraw money with balance check.

- Fast Cash: Predefined withdrawal amounts for convenience.

- Check Balance: Real-time account balance display.

- Mini Statement: Shows recent transactions.

- PIN Change: Users can safely update their PIN.

- Responsive & Intuitive GUI: Clean interface built with Java Swing.

# 🛠️ Technologies Used

- Java (JDK 8+) – Core application logic.

- Java Swing – Graphical User Interface.

- MySQL – Database for account & transaction storage.

- JDBC – Java Database Connectivity for database operations.

- NetBeans / IntelliJ IDEA – IDE for development.

#🚀 How to Use

Follow these steps to set up and run the Bank Management System:

1. Clone the Repository

Clone the project to your local machine:

    git clone https://github.com/your-username/Bank-Management-System.git

2. Set Up the Database

Open your MySQL client (e.g., MySQL Workbench).

Create a new database named bankmanagementsystem.

The project requires three main tables:

login → stores card numbers and PINs

signup3 → stores user account details and selected services

bank → stores all transactions

(You can find the SQL scripts to create these tables in the project folder.)

3. Update Database Credentials

Open conn.java and update your MySQL username and password:

    c = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/bankmanagementsystem",
    "root",
    "your_password_here"
    );

4. Run the Application

Open the project in NetBeans or IntelliJ IDEA.

Run Login.java to start the application.

5. Contribute

Create a new branch for your changes.

Test your feature or fix.

Submit a pull request to the main repository.

<img width="916" height="690" alt="image" src="https://github.com/user-attachments/assets/cd022856-35be-4cfd-91af-4af4d208dd06" />

