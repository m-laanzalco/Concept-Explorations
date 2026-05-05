# 📦 Advanced Warehouse Management System

An enterprise-grade inventory simulation focused on robust **Exception Handling**, **Data Persistence**, and **Business Logic Validation**.

## 🚀 Technical Highlights

### 1. Custom Exception Architecture
Unlike basic applications that crash on errors, this system implements a dedicated `OutOfStockException`. This allows the software to:
* Intercept business rule violations (e.g., selling more units than available).
* Provide meaningful feedback to the user/logs without terminating the process.
* Maintain system stability during high-load transaction simulations.

### 2. Data Persistence (File I/O)
The system features an automated reporting engine. Regardless of transaction outcomes, it generates a physical `inventory_report.txt` file.
* Uses **Try-with-resources** to ensure safe stream handling and prevent memory leaks.
* Demonstrates the ability to interface with the local file system for logging and auditing.

### 3. Graceful Error Recovery
The `WarehouseController` demonstrates a "fail-safe" approach. Even when a specific transaction fails (triggering a logged error message), the application completes its lifecycle and secures the final state of the inventory in the report.

## 🛠️ Class Structure
* `WarehouseItem`: The core data model managing stock levels and validation logic.
* `OutOfStockException`: Specialized error class for inventory-specific failures.
* `WarehouseController`: The main execution engine managing the workflow and File I/O.

---
*Professional Portfolio - Demonstrating Advanced Java Logic & System Reliability.*
