public class HourlyEmployee extends Employee
{
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, double rate, int hours)
    {
        super(name, id);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    @Override
    public double calculateSalary()
    {
        return hourlyRate * hoursWorked;
    }
}