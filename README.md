# ✈️ Airline Reservation System  

A **Java Swing-based Airline Reservation System** with **SQL database connectivity (via JDBC)**.  
This project allows users to **book flights, manage passenger details, view booking history, and cancel reservations** through an interactive desktop application.  

---

## 🚀 Features  

- 🔐 **User Authentication** – Login & Signup for customers and admins  
- 🛫 **Flight Booking** – Search flights by source, destination, and date, then book tickets  
- 📜 **Booking History** – View all past and current bookings  
- 💾 **Database Integration** – Persistent data storage using MySQL & JDBC  

---

## ⚙️ Tech Stack  

- **Frontend (UI):** Java Swing  
- **Backend Logic:** Java  
- **Database:** MySQL  
- **Database Connectivity:** JDBC

---

🛠️ Installation & Setup

Clone the repository
git clone https://github.com/your-username/airline-reservation-system.git
cd airline-reservation-system
Set up the database
Install MySQL
Import the sql file into your MySQL server
mysql -u root -p < resources/airline.sql
Configure JDBC
Update database credentials in DBConnection.java:
String url = "jdbc:mysql://localhost:3306/airline_db";
String user = "root";
String password = "yourpassword";
Run the project
Compile and run the main class:
javac src/Main.java
java src/Main

---

📊 Database Schema
✈️ Tables
Users: Stores user login details
Flights: Stores flight details (flight number, source, destination, seats, fare, etc.)
Bookings: Stores booking information (user ID, flight ID, seat, status)

---

📦 Requirements
Java JDK 8+
MySQL 5.7+
JDBC Driver

---

🙌 Acknowledgements
Java Swing – UI framework
JDBC – Database connectivity
MySQL – Database management

---

🔮 Future Enhancements
🧾 Ticket generation as PDF
💳 Online payment integration
🌍 Real-time flight data API integration
📱 Convert into a web-based system using JSP/Servlets
