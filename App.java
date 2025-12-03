import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        
        add add = new add();
        remove remove = new remove();
        view view = new view();
        search search = new search();
        
        int choice;
        
        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View All Students");
            System.out.println("4. Search Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    add.display(studentManager);
                    break;
                case 2:
                    remove.display(studentManager);
                    break;
                case 3:
                    view.display(studentManager);
                    break;
                case 4:
                    search.display(studentManager);
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}