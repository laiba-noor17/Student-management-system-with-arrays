import java.util.Scanner;
public class search {
    
    public void display(student s) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the student name you want to search: ");
        String search = s1.nextLine();

        if (search.equals(s.studentname)) {
            System.out.println("---------------" );
            System.out.println("Student Found!");
            System.out.println("---------------" );
            System.out.println("" );
            System.out.println("    Student name: " + s.studentname);
            System.out.println("    Father name: " + s.fathername);
            System.out.println("    Age: " + s.age);
            System.out.println("    Class name: " + s.classname );
            System.out.println("    Roll no: " + s.rollno );
            System.out.println("" );
        } 
        else if (search.equalsIgnoreCase(s.studentname1)) {
            System.out.println("---------------" );
            System.out.println("Student Found!");
            System.out.println("---------------" );
            System.out.println("" );
            System.out.println("    Student name: " + s.studentname1);
            System.out.println("    Father name: " + s.fathername1);
            System.out.println("    Age: " + s.age1);
            System.out.println("    Class name: " + s.classname1 );
            System.out.println("    Roll no: " + s.rollno1 );
            System.out.println("" );
        } else if (search.equalsIgnoreCase(s.studentname2)) {
            System.out.println("---------------" );
            System.out.println("Student Found!");
            System.out.println("---------------" );
            System.out.println("" );
            System.out.println("    Student name: " + s.studentname2);
            System.out.println("    Father name: " + s.fathername2);
            System.out.println("    Age: " + s.age2);
            System.out.println("    Class name: " + s.classname2 );
            System.out.println("    Roll no: " + s.rollno2 );
            System.out.println("" );
        } else if (search.equalsIgnoreCase(s.studentname3)) {
            System.out.println("---------------" );
            System.out.println("Student Found!");
            System.out.println("---------------" );
            System.out.println("" );
            System.out.println("    Student name: " + s.studentname3);
            System.out.println("    Father name: " + s.fathername3);
            System.out.println("    Age: " + s.age3);
            System.out.println("    Class name: " + s.classname3 );
            System.out.println("    Roll no: " + s.rollno3 );
            System.out.println("" );
        } else if (search.equalsIgnoreCase(s.studentname4)) {
            System.out.println("---------------" );
            System.out.println("Student Found!");
            System.out.println("---------------" );
            System.out.println("" );
            System.out.println("    Student name: " + s.studentname4);
            System.out.println("    Father name: " + s.fathername4);
            System.out.println("    Age: " + s.age4);
            System.out.println("    Class name: " + s.classname4 );
            System.out.println("    Roll no: " + s.rollno4 );
            System.out.println("" );
        } 
        
        else {
            System.out.println("" );
            System.out.println("---------------" );
            System.out.println("Incorrect name ");
            System.out.println("---------------" );
            System.out.println("" );
        }

  
    }
}
