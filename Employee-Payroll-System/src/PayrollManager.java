import java.util.ArrayList;

public class PayrollManager
{
    public static void main(String[] args)
    {
        ArrayList<Employee> staff = new ArrayList<>();

        // Adding professional sample data
        staff.add(new SalariedEmployee("John Wick", 101, 3500.00));
        staff.add(new HourlyEmployee("Marcus Wright", 102, 25.0, 160));

        System.out.println("--- Monthly Payroll Report ---");
        for (Employee e : staff)
        {
            System.out.println("Employee: " + e.name + " (ID: " + e.id + ")");
            System.out.println("Net Salary: " + e.calculateSalary() + "€");
            System.out.println("-----------------------------");
        }
    }
}