import java.util.ArrayList;
import java.util.Collections;

class AdvancedListOperations
{
    public static void main(String[] args)
    {
        ArrayList<String> tasks = new ArrayList<>();

        // 1. Dynamic Addition
        tasks.add("Debug Code");
        tasks.add("Write Documentation");
        tasks.add("Team Meeting");
        tasks.add("Deploy App");

        System.out.println("Initial Task List: " + tasks);

        // 2. Removal by object or index
        tasks.remove("Team Meeting");

        // 3. Search (Checking if an element exists)
        if (tasks.contains("Debug Code"))
        {
            System.out.println("Critical task 'Debug Code' found at index: " + tasks.indexOf("Debug Code"));
        }

        // 4. Sorting (Questo alza molto il livello!)
        Collections.sort(tasks);
        System.out.println("Sorted Tasks (A-Z): " + tasks);

        // 5. Size and Clear
        System.out.println("Number of active tasks: " + tasks.size());
    }
}