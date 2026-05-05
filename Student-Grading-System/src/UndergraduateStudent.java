/**
 * Logic for Undergraduate students.
 * Qualification: Average score >= 70.
 */
public class UndergraduateStudent extends Student
{

    public UndergraduateStudent(String name)
    {
        super(name);
    }

    @Override
    public void processGrade()
    {
        int total = 0;
        for (int s : scores) total += s;

        status = (total / TEST_LIMIT >= 70) ? "PASS (Undergrad)" : "FAIL";
    }
}