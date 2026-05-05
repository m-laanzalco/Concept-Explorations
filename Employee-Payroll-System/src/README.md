# 💰 Employee Payroll System

A modular backend solution designed to manage corporate human resources and automate salary processing.

## 🧠 Business Logic Implementation
* **Contractual Abstraction**: Utilizes abstract classes to define a common blueprint for all employees while allowing specific salary logic for different contract types.
* **Salary Models**: 
    * **Salaried**: Fixed monthly compensation model.
    * **Hourly**: Dynamic pay calculation based on recorded work hours and rates.
* **Encapsulation**: Strict use of access modifiers to protect sensitive employee data.

## 🛠️ Architecture
- `Employee`: The abstract base class.
- `SalariedEmployee` & `HourlyEmployee`: Specialized implementations.
- `PayrollManager`: The execution engine that generates monthly reports.

---
*Professional Portfolio - HR & Resource Management Logic.*
