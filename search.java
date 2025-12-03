import java.util.Scanner;
import java.util.ArrayList;

public class search {
    public void display(StudentManager manager) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n===== Search Student =====");
        System.out.print("Enter student name to search: ");
        String searchName = scanner.nextLine().trim();
        
        ArrayList<student> results = manager.searchStudents(searchName);
        
        if (results.isEmpty()) {
            System.out.println("\n✗ No students found with name containing: " + searchName);
        } else {
            System.out.println("\n✓ Found " + results.size() + " student(s):");
            System.out.println("-------------------------");
            for (student student : results) {
                System.out.println(student.toString());
            }
            System.out.println("-------------------------");
        }
    }
}