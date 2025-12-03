import java.util.ArrayList;

public class view {
    public void display(StudentManager manager) {
        System.out.println("\n===== All Students =====");
        System.out.println("Total Students: " + manager.getCurrentCount());
        System.out.println("-------------------------");
        
        ArrayList<student> allStudents = manager.getAllStudents();
        
        if (allStudents.isEmpty()) {
            System.out.println("No students found!");
        } else {
            for (int i = 0; i < allStudents.size(); i++) {
                student s = allStudents.get(i);
                System.out.println("Student #" + (i + 1));
                System.out.println("  Name: " + s.getName());
                System.out.println("  Father: " + s.getFatherName());
                System.out.println("  Age: " + s.getAge());
                System.out.println("  Class: " + s.getClassName());
                System.out.println("  Roll No: " + s.getRollNo());
                System.out.println();
            }
        }
        System.out.println("-------------------------");
    }
}