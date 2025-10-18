public class view {

    String studentname;
    String fathername;
    int age;

    public void display(student s){
         System.out.println("" );
        System.out.println("------------------------- " );
        System.out.println("Student Details");
        System.out.println("------------------------- ");
        System.out.println("" );
        System.out.println("    Student name: "+ s.studentname );
        System.out.println("    Father name: "+ s.fathername );
        System.out.println("    Age: " + s.age );
         System.out.println("" );

    }
}
