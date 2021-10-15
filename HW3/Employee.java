/**
 * Employee class - contains the fields needed for an employee 
 * including firstname, last name, employee id, hourly pay.
 */
public class Employee {

    private String fname;
    private String lname;
    private long employeeID;
    private float wage;



    /**
     * Default Constructor - initialize all string fields with "N/A" and
     * all numeric fields with 0
     */
    public Employee() {
        this("N/A", "N/A", 0, 0);
    }




    /**
     * Overloaded Constructor
     * @param fname employee's first name
     * @param lname employee's last name
     * @param id employee's ID
     * @param wage employee's wage
     */
    public Employee(String fname, String lname, long id, float wage) {
        this.fname = fname;
        this.lname = lname;
        this.employeeID = id;
        this.wage = wage;
    }




    /**
     * Compute the amount of pay the employee gets based on the given hours worked
     * @param hours total number of hours worked (must be in range [0, 40]).
     *              Exception will be thrown if the given number of hours is not in range
     * @return the pay calculated based on the given hours worked
     */
    public float computePay(int hours) throws TooManyHoursWorkedException, NumberFormatException {
        if (hours < 0) {
            throw new NumberFormatException("Number of hours worked cannot be negative!");
        }
        if (hours > 40) {
            throw new TooManyHoursWorkedException("Employee must not work over 40 hours!");
        }
        return (wage * hours);
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

    public long getEmployeeID() {
        return this.employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public float getWage() {
        return this.wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }
}




/**
 * A custom exception that inherits from IllegalArgumentException
 */
class TooManyHoursWorkedException extends IllegalArgumentException {

    public TooManyHoursWorkedException() {
        super();
    }


    public TooManyHoursWorkedException(String msg) {
        super(msg);
    }
}