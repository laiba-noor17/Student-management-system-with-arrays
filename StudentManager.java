import java.util.ArrayList;

public class StudentManager {
    private ArrayList<student> students;
    private int maxCapacity;
    private int currentCount;
    
    // Constructor with default capacity
    public StudentManager() {
        this.maxCapacity = 50; // Maximum students can be increased
        this.students = new ArrayList<>(maxCapacity);
        this.currentCount = 0;
        initializeDefaultStudents();
    }
    
    private void initializeDefaultStudents() {
        // Adding default students
        addStudent(new student("Laiba Noor", "Ghulam Noor", 19, "BSCS", "101"));
        addStudent(new student("Mehreen Tahir", "Tahir Mehmood", 21, "BSCS", "102"));
        addStudent(new student("Maheen Umar", "Umar Farooq", 20, "BSCS", "103"));
        addStudent(new student("Ifrah Abid", "Abid Hussain", 19, "BSCS", "104"));
        addStudent(new student("Khadija Yousuf", "Yousuf Habib", 19, "BSCS", "105"));
    }
    
    // Add student to array
    public boolean addStudent(student student) {
        if (currentCount < maxCapacity) {
            students.add(student);
            currentCount++;
            return true;
        }
        return false;
    }
    
    // Remove student by name
    public boolean removeStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            student s = students.get(i);
            if (s.getName().equalsIgnoreCase(name)) {
                students.remove(i);
                currentCount--;
                return true;
            }
        }
        return false;
    }
    
    // Get all students
    public ArrayList<student> getAllStudents() {
        return students;
    }
    
    // Search student by name
    public student searchStudent(String name) {
        for (student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }
    
    // Search students by partial name match
    public ArrayList<student> searchStudents(String keyword) {
        ArrayList<student> results = new ArrayList<>();
        for (student student : students) {
            if (student.getName().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(student);
            }
        }
        return results;
    }
    
    // Get current count of students
    public int getCurrentCount() {
        return currentCount;
    }
    
    // Check if there's capacity to add more students
    public boolean hasCapacity() {
        return currentCount < maxCapacity;
    }
}