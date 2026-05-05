# 🏎️ Vehicle Dynamics System

This module demonstrates **Method Overriding** and **Runtime Polymorphism** in Java.

## 🧠 Concept Explained (In Plain English)
In programming, we often want to treat different things (like Cars and Motorcycles) as part of a general category (Vehicles). 

This project shows how Java can decide which "acceleration" logic to use based on the actual object type, even when we refer to them simply as "Vehicles". This makes the code flexible and easy to extend—if we added a "Truck" later, we wouldn't need to change the main testing logic!

## 🛠️ Components
* **Vehicle**: The parent class that sets the general rule: every vehicle can increase speed.
* **Car**: A specialized version that accelerates on four wheels.
* **Motorcycle**: A high-performance version that revs up and goes fast.
* **VehicleTestBench**: Our testing lab where we see polymorphism in action.

---
*University Lab Exercise - Mastering dynamic method dispatch.*
