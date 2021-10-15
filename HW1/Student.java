/**
 * Student class
 * 
 * contains the student's first name, last name, age,
 * gpa, major, departmet, and class schedule.
 * 
 */
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private float gpa;
    private String major;
    private String department;
    private String schedule;


    public Student(String firstName, String lastName, int age,
                   float gpa, String major, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
    }

    /**
     * print the student's class schedule on the terminal
     */
    public void printSchedule() {
        System.out.println("**************************");
        System.out.println(firstName + "'s schedule:\n");
        System.out.println(schedule);
    }
    
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String newSchedule) {
        schedule = newSchedule;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
