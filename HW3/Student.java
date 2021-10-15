/**
 * Student class - represents a student that contains the following fields:
 * first name, last name, age, gpa, major, department
 * 
 * This class supports deep copy. Therefore, it inherits from Cloneable class
 */
public class Student implements Cloneable {

    private String fname;
    private String lname;
    private int age;
    private float gpa;
    private String major;
    private String department;
    private Course course;


    /**
     * Default Constructor - initialize all string fields with "N/A," all
     * numeric fields with 0, and all object fields with null
     */
    public Student() {
        this("N/A", "N/A", 0, 0, "N/A", "N/A", null);
    }


    /**
     * Overloaded Constructor
     * @param fname student's first name
     * @param lname student's last name
     * @param age student's age
     * @param gpa student's GPA
     * @param major student's major
     * @param department student's department
     * @param course student's course being taken
     */
    public Student(String fname, String lname, int age, float gpa,
                   String major, String department, Course course) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        this.course = course;
    }



    /**
     * Display all the information of the student on the terminal
     */
    public void printInfo() {
        System.out.println(this.toString());
    }



    @Override
    public Object clone() throws CloneNotSupportedException {
        // create a cloned student instance
        Student student = (Student)super.clone();
        // create a cloned course based on the current student's course
        // then set the cloned student's course to be the cloned course created
        Course clonedCourse = (Course)this.course.clone();
        student.setCourse(clonedCourse);
        
        return student;
    }



    @Override
    public String toString() {
        return (
            "\nFirst Name: " + fname + 
            "\nLast Name: " + lname +
            "\nAge: " + age +
            "\nGPA: " + gpa +
            "\nMajor: " + major + 
            "\nDepartment: " + department +
            "\nCourse: " + course.getName() + "\n"
        );
    }



    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGpa() {
        return this.gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
}
