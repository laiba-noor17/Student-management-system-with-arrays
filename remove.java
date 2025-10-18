import java.util.Scanner;
public class remove {
    public void display(student s){
 Scanner s1 = new Scanner(System.in);
   
    
    System.out.print("Enter the student name you want to remove: ");
    String name = s1.nextLine();

    boolean found = false;

        if (name.equalsIgnoreCase(s.studentname)) {
            s.studentname = null;
            s.fathername = null;
            s.age = 0;
            s.classname=null;
            s.rollno=null;
            found = true;
        } 
        else if (name.equalsIgnoreCase(s.studentname1)) {
            s.studentname1 = null;
            s.fathername1 = null;
            s.age1 = 0;
            s.classname1=null;
            s.rollno1=null;
            found = true;
        } 
        else if (name.equalsIgnoreCase(s.studentname2)) {
            s.studentname2 = null;
            s.fathername2 = null;
            s.age2 = 0;
            s.classname2=null;
            s.rollno2=null;
            found = true;
        } 
        else if (name.equalsIgnoreCase(s.studentname3)) {
            s.studentname3 = null;
            s.fathername3 = null;
            s.age3 = 0;
            s.classname3=null;
            s.rollno3=null;
            found = true;
        } 
        else if (name.equalsIgnoreCase(s.studentname4)) {
            s.studentname4 = null;
            s.fathername4 = null;
            s.age4 = 0;
            s.classname4=null;
            s.rollno4=null;
            found = true;
        }

        if (found) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("Student Removed Successfully!");
            System.out.println("-----------------------------");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("Student Not Found!");
            System.out.println("-----------------------------");
            System.out.println();
           
        }
    }
}