/**
 * Course class - represents an academic course.
 * 
 * Contain the fields for a standard academic course including course name,
 * course description, department, time the course starts, weekday the course is held on 
 * (forsimplicity, let us assume the course only meets once a week).
 * 
 * This class supports deep copy. Therefore, it inherits from Cloneable class
 */
public class Course implements Cloneable {

    private String name;
    private String description;
    private String department;
    private String startTime;
    private String weekdays;



    /**
     * Default Constructor - initialize all string fields with "N/A"
     */
    public Course() {
        this("N/A", "N/A", "N/A", "N/A", "N/A");
    }



    /**
     * Overloaded Constructor
     * @param name course's name
     * @param description course's description
     * @param department department of the course
     * @param startTime course's start time
     * @param weekdays days of week that the course's meeting is held
     */
    public Course(String name, String description, String department,
                  String startTime, String weekdays) {
        this.name = name;
        this.description = description;
        this.department = department;
        this.startTime = startTime;
        this.weekdays = weekdays;
    }



    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getWeekdays() {
        return this.weekdays;
    }

    public void setWeekdays(String weekdays) {
        this.weekdays = weekdays;
    }
}