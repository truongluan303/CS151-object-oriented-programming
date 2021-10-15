/**
 * StudentTest class
 * 
 * This class is used to test the Student class
 * 
 * An instance of Student will be created.
 * We then set the schedule for the student. 
 * And finally print out the student's schedule.
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student(
            "John", "Smith", 20, 3.6f,
            "Computer Science", "Computer Science"
        );
        student.setSchedule(
            "CS147 Mon/Wed 07:15am-08:30pm \n" +
            "CS144 Mon/Wed 07:30pm-08:30pm \n" +
            "CS151 Tue/Thu 06:00pm-07:15pm \n" +
            "CS146 Tue/Thu 09:00pm-10:15pm \n"
        );
        student.printSchedule();
    }
}


/*
SAMPLE OUTPUT

**************************
John's schedule:

CS147 Mon/Wed 07:15am-08:30pm
CS144 Mon/Wed 07:30pm-08:30pm
CS151 Tue/Thu 06:00pm-07:15pm
CS146 Tue/Thu 09:00pm-10:15pm
*/ 