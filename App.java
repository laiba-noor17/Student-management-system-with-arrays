import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        student student = new student();
        Scanner s1 = new Scanner(System.in);

        add add = new add();
        remove remove = new remove();
        view view = new view();
        search search = new search();
        
        int choice;
        while (true) {
             System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View Student");
            System.out.println("4. Search Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = s1.nextInt();

            switch (choice) {
                case 1:
                    add.display(student);
                    break;
                case 2:
                    remove.display(student);
                    break;
                case 3:
                    view.display(student);
                    break;
                case 4:
                    search.display(student);
                    break;
                case 5:
                    System.exit(0);
                    s1.close();
                    break;
            
                default:
                System.out.println("Invalid choice");
                    break;
            }
           
        }
 
    }
}
