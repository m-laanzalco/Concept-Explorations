# 🎓 Academic Student Registry

This module implements a university grading management system using **Object-Oriented Programming (OOP)** principles in Java. It specifically focuses on how different academic standards can be applied to different types of students using a single interface.

## 🧠 Key Features & Concepts

* **Polymorphism in Action**: The system manages both Undergraduate and Graduate students within a single `Student` array, dynamically calling the correct grading logic for each.
* **Abstract Foundation**: A base abstract class `Student` defines the essential structure, while hiding the complexity of specific grading rules.
* **Encapsulation**: Student data and test scores are protected, ensuring that they can only be modified through controlled methods.
* **Custom Business Logic**:
    * **Undergraduates**: Need an average of **70%** to pass.
    * **Graduates**: Require a more rigorous average of **80%** to pass.

## 🛠️ Project Structure

* `AcademicRegistry.java`: The main execution class that simulates a registry, assigns scores, and generates the final report.
* `Student.java`: The abstract parent class holding shared attributes like `fullName` and `testScores`.
* `UndergraduateStudent.java`: Subclass implementing standard passing criteria.
* `GraduateStudent.java`: Subclass implementing advanced academic standards.

## 📊 Sample Output
The system generates a report like the following:
```text
--- University Grading Report ---
Student: Mario Rossi | Status: PASS (Undergrad)
Student: Luigi Bianchi | Status: FAIL
