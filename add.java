import java.util.Scanner;;
public class add {
   String name, fname, cname, rno;
   int age;
  
     public void display(student s){
        boolean slotAvailable = false;

        if (s.studentname == null || s.studentname1 == null || s.studentname2 == null || s.studentname3 == null || s.studentname4 == null) {
            slotAvailable = true;
        }
        if (!slotAvailable) {
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("No slot available to add a new student!");
            System.out.println("---------------------------");
            System.out.println();
            return; 
        }
           Scanner s1 = new Scanner(System.in);
            System.out.print("Enter student name: " );
            name = s1.nextLine();
            System.out.print("Enter father name: ");
            fname = s1.nextLine();
            System.out.print("Enter age: " );
            age = s1.nextInt();
            System.out.print("Enter roll no: " );
            rno = s1.nextLine();
            System.out.print("Enter class name: ");
            cname = s1.nextLine();

            if (s.studentname==null)
            {
                s.studentname=name;
                s.fathername=fname;
                s.age=age;
                s.rollno=rno;
                s.classname=cname;
                System.out.println("" );
                System.out.println("--------------------------- " );
                System.out.println("Student added successfully! " );
                System.out.println("--------------------------- " );
                System.out.println("" );
            }
            else if (s.studentname1==null ) {
                s.studentname1=name;
                s.fathername1=fname;
                s.age1=age;
                s.rollno1=rno;
                s.classname1=cname;
                System.out.println("" );
                System.out.println("--------------------------- " );
                System.out.println("Student added successfully! " );
                System.out.println("--------------------------- " );
                System.out.println("" );
            } else if(s.studentname2==null){
                s.studentname2=name;
                s.fathername2=fname;
                s.age2=age;
                s.rollno2=rno;
                s.classname2=cname;
                System.out.println("" );
                System.out.println("--------------------------- " );
                System.out.println("Student added successfully! " );
                System.out.println("--------------------------- " );
                System.out.println("" );
            }
            else if (s.studentname3==null) {
                s.studentname3=name;
                s.fathername3=fname;
                s.age3=age;
                s.rollno3=rno;
                s.classname3=cname;
                System.out.println("" );
                System.out.println("--------------------------- " );
                System.out.println("Student added successfully! " );
                System.out.println("--------------------------- " );
                System.out.println("" );
            } else if(s.studentname4==null){
                s.studentname4=name;
                s.fathername4=fname;
                s.age4=age;
                s.rollno4=rno;
                s.classname4=cname;
                System.out.println("" );
                System.out.println("--------------------------- " );
                System.out.println("Student added successfully! " );
                System.out.println("--------------------------- " );
                System.out.println("" );
            }
            else {
                System.out.println("" );
                System.out.println("--------------------------- " );
                System.out.println("No slot available! " );
                System.out.println("--------------------------- " );
                System.out.println("" );
            }
            
        }
}
