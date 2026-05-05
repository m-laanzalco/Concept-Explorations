/**
 * Logic for Graduate students.
 * Stricter qualification: Average score >= 80.
 */
public class GraduateStudent extends Student
{

    public GraduateStudent(String name)
    {
        super(name);
    }

    @Override
    public void processGrade()
    {
        int total = 0;
        for (int i = 0; i < TEST_LIMIT; i++)
        {
            total += scores[i];
        }

        status = (total / TEST_LIMIT >= 80) ? "PASS (Graduate)" : "FAIL";
    }
}