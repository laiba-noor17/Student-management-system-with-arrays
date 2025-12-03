public class student {
    private String name;
    private String fatherName;
    private int age;
    private String className;
    private String rollNo;
    
    // Constructor
    public student(String name, String fatherName, int age, String className, String rollNo) {
        this.name = name;
        this.fatherName = fatherName;
        this.age = age;
        this.className = className;
        this.rollNo = rollNo;
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getFatherName() {
        return fatherName;
    }
    
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getClassName() {
        return className;
    }
    
    public void setClassName(String className) {
        this.className = className;
    }
    
    public String getRollNo() {
        return rollNo;
    }
    
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + 
               ", Father: " + fatherName + 
               ", Age: " + age + 
               ", Class: " + className + 
               ", Roll No: " + rollNo;
    }
}