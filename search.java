import java.util.Scanner;
public class search {
    
    public void display(student s) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the student name you want to search: ");
        String search = s1.nextLine();

        if (search.equalsIgnoreCase(s.studentname)) {
            System.out.println("---------------" );
            System.out.println("Student Found!");
            System.out.println("---------------" );
            System.out.println("" );
            System.out.println("    Student name: " + s.studentname);
            System.out.println("    Father name: " + s.fathername);
            System.out.println("    Age: " + s.age);
        } else {
            System.out.println("" );
            System.out.println("---------------" );
            System.out.println("Incorrect name ");
            System.out.println("---------------" );
        }

   s1.close();
    }
}
