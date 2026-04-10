# Personal Finance Tracker
## Group Members
Sophia Gabrielle Logarta
Aissha Monceda
Mary Rose Pacina
Iren Nathaleigh Guinita
Chloe Julia Geonzon

## Project Description
The Personal Finance Tracker is a desktop application designed to help users take control of their financial health. Managing daily transactions can be overwhelming; this system solves the problem of "invisible spending" by providing a centralized platform to log income and expenses. It offers users a clear overview of their financial habits through data persistence and visual analytics, enabling better budgeting and fiscal responsibility.

## Proposed Features
User Authentication: Secure Login and Registration system to manage individual user profiles.
Transaction Management: Full CRUD (Create, Read, Update, Delete) functionality for both expenses and income.
Search & Filter: Advanced filtering options to sort transactions by specific categories or date ranges.
Dashboard Analytics: Visual representation of spending habits (e.g., Pie charts for category distribution).
History View: A comprehensive table display of all financial records for easy auditing.

## Planned Technologies
Language: Java
GUI Framework: JavaFX
Database Connectivity: JDBC (Java Database Connectivity)
Database: SQLite (or MySQL)

## Evaluation Criteria Mapping (Initial)
Object-Oriented Programming (OOP): * Planned use of classes such as User, Transaction, Income, and Expense (utilizing inheritance for transaction types).
Encapsulation of data through Private fields and public Getters/Setters.
GUI: * Interactive interface built with JavaFX and FXML views for clean separation of UI and logic.
Scene switching for Login, Dashboard, and Report screens.
UML: * A comprehensive Use Case Diagram and Class Diagram are included in the /docs folder to outline system architecture.
Design Pattern: * Singleton Pattern: Used for the Database Connection manager to ensure a single instance handles all JDBC operations.
MVC (Model-View-Controller): To decouple the data logic from the JavaFX UI.
