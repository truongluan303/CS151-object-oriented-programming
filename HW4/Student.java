import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;



/**
 * Represents a student with important fields
 * including first name, last name, age, gpa,
 * major, department, and courses list
 */
public class Student {
    
    private String fname;
    private String lname;
    private int age;
    private float gpa;
    private String major;
    private String department;
    private LinkedList<Course> courses;




    /** Default Constructor */
    public Student() {
        this("N/A", "N/A", 0, 0, "N/A", "N/A", new LinkedList<Course>());
    }




    /** Overloaded Constructor */
    public Student(String fname, String lname, int age, float gpa, String major, 
                   String department, LinkedList<Course> courses) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        this.courses = courses;
    }





    /**
     * Add a course to the list of courses
     * 
     * @param newCourse the new course to be added 
     */
    public void addCourse(Course newCourse) {
        courses.add(newCourse);
    }





    /**
     * Remove the specified course from the list
     * 
     * @param toBeRemoved the course to be removed
     */
    public void removeCourse(Course toBeRemoved) {
        courses.remove(toBeRemoved);
    }





    /**
     * Remove the course at the given index
     * 
     * @param idx the index of the course to be removed
     */
    public void removeCourse(int idx) {
        courses.remove(idx);
    }





    /**
     * Sort the courses in the student's list of courses based on the
     * chosen order.
     * 
     * @param ascending sort in ascending or descending order
     * @param attribute the number of attribute to sort the list.
     */
    public void sortCourse(boolean ascending, int attribute) {
        Comparator<Course> nameComparator = new Comparator<Course>(){
            @Override
            public int compare(Course c1, Course c2) {
                return c1.getName().compareTo(c2.getName());
            }
        };

        Comparator<Course> descriptionComparator = new Comparator<Course>(){
            @Override
            public int compare(Course c1, Course c2) {
                return c1.getDescription().compareTo(c2.getDescription());
            }
        };

        Comparator<Course> departmentComparator = new Comparator<Course>(){
            @Override
            public int compare(Course c1, Course c2) {
                return c1.getDepartment().compareTo(c2.getDepartment());
            }
        };

        Comparator<Course> startTimeComparator = new Comparator<Course>(){
            @Override
            public int compare(Course c1, Course c2) {
                return c1.getStartTime().compareTo(c2.getStartTime());
            }
        };

        Comparator<Course> weekdayComparator = new Comparator<Course>(){
            @Override
            public int compare(Course c1, Course c2) {
                return c1.getWeekdays().compareTo(c2.getWeekdays());
            }
        };

        Comparator<Course> comparator = null;
        switch(attribute) {
            case 1:
                comparator = nameComparator;
                break;
            case 2:
                comparator = descriptionComparator;
                break;
            case 3:
                comparator = departmentComparator;
                break;
            case 4:
                comparator = startTimeComparator;
                break;
            case 5:
                comparator = weekdayComparator;
                break;
            default:
                throw new IllegalArgumentException("Illegal attribute number option!");
        }

        if (!ascending) {
            comparator = Collections.reverseOrder(comparator);
        }

        Collections.sort(courses, comparator);
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

    public LinkedList<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(LinkedList<Course> courses) {
        this.courses = courses;
    }
}
