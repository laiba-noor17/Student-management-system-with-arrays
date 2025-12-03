import java.util.Scanner;

public class add {
    public void display(StudentManager manager) {
        Scanner scanner = new Scanner(System.in);
        
        if (!manager.hasCapacity()) {
            System.out.println("\nError: Maximum student capacity reached!");
            return;
        }
        
        System.out.println("\n===== Add New Student =====");
        
        System.out.print("Enter student name: ");
        String name = scanner.nextLine().trim();
        
        System.out.print("Enter father's name: ");
        String fatherName = scanner.nextLine().trim();
        
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter class name: ");
        String className = scanner.nextLine().trim();
        
        System.out.print("Enter roll number: ");
        String rollNo = scanner.nextLine().trim();
        
        // Create new student object
        student newStudent = new student(name, fatherName, age, className, rollNo);
        
        // Add to manager
        if (manager.addStudent(newStudent)) {
            System.out.println("\n✓ Student added successfully!");
            System.out.println("Current total students: " + manager.getCurrentCount());
        } else {
            System.out.println("\n✗ Failed to add student!");
        }
    }
}