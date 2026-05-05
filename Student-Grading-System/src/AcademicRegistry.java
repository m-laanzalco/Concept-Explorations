/**
 * Main application to manage and test the Student Registry.
 */
public class AcademicRegistry
{
    public static void main(String[] args)
    {
        // Create an array to manage different types of students (Polymorphism)
        Student[] list = new Student[2];

        // 1. Setup Undergraduate
        list[0] = new UndergraduateStudent("Mario Rossi");
        list[0].setScore(0, 75);
        list[0].setScore(1, 70);
        list[0].setScore(2, 80);

        // 2. Setup Graduate
        list[1] = new GraduateStudent("Luigi Bianchi");
        list[1].setScore(0, 75); // Same scores, but higher standard
        list[1].setScore(1, 70);
        list[1].setScore(2, 80);

        // Process and display results
        System.out.println("--- University Grading Report ---");
        for (Student s : list)
        {
            s.processGrade();
            System.out.println(s.getInfo());
        }
    }
}