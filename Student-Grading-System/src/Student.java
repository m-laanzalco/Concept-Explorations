/**
 * Abstract class representing a generic University Student.
 * Serves as the foundation for specific student categories.
 */
public abstract class Student
{
    protected final static int TEST_LIMIT = 3;

    protected String fullName;
    protected int[] scores;
    protected String status;

    public Student(String name)
    {
        this.fullName = name;
        this.scores = new int[TEST_LIMIT];
        this.status = "In Progress";
    }

    public abstract void processGrade();

    public void setScore(int index, int value)
    {
        if (index >= 0 && index < TEST_LIMIT)
        {
            scores[index] = value;
        }
    }

    public String getInfo()
    {
        return "Student: " + fullName + " | Status: " + status;
    }
}