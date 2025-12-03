import java.util.Scanner;

public class remove {
    public void display(StudentManager manager) {
        Scanner scanner = new Scanner(System.in);
        
        if (manager.getCurrentCount() == 0) {
            System.out.println("\nNo students to remove!");
            return;
        }
        
        System.out.println("\n===== Remove Student =====");
        System.out.print("Enter student name to remove: ");
        String name = scanner.nextLine().trim();
        
        if (manager.removeStudent(name)) {
            System.out.println("\n✓ Student removed successfully!");
            System.out.println("Remaining students: " + manager.getCurrentCount());
        } else {
            System.out.println("\n✗ Student not found!");
        }
    }
}