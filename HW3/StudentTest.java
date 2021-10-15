/**
 * Run test on the classes Student and Course to
 * make sure that these classes are cloneable
 */
public class StudentTest {

    public static void main(String[] args) {

        // create the cs151 course
        Course cs151 = new Course(
            "CS 151", "Object Oriented Design and Programming", 
            "CS", "6:00pm", "Tuesday"
        );


        // create a new student
        Student student = new Student(
            "John", "Smith", 20, 3.6f, "Computer Science", 
            "School of Computer Science", cs151
        );


        // perform deep copy on the student instance created above
        // then print the information of the cloned student
        try {
            Student clonedStudent = (Student)student.clone();
            clonedStudent.printInfo();
        } 
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    
}
