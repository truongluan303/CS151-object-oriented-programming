public class Course {

    private String name;
    private String description;
    private String department;
    private String startTime;
    private String weekdays;



    public Course() {
        this("N/A", "N/A", "N/A", "N/A", "N/A");
    }




    public Course(String name, String description, String department, 
                  String startTime, String weekdays) {
        this.name = name;
        this.description = description;
        this.department = department;
        this.startTime = startTime;
        this.weekdays = weekdays;
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
