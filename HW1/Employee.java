/**
 * Employee class
 * 
 * Since an employee is a person, this class will
 * inherit from the Person class. Furthermore, the
 * class also contains the basic information of an
 * emplyee including employee ID, employment status,
 * and pay rate.
 */
public class Employee extends Person {
    private long employeeID;
    private EmploymentStatus employeeStatus;
    private float payAmount;



    /***********************************************************************
     * Constructor for Employee class
     * 
     * @param firstName  : the employee's first name
     * @param lastName   : the employee's last name
     * @param age        : the employee's age
     * @param address    : the address that the employee lives at
     * @param gender     : the employee's gender
     * @param weight     : the employee's weight
     * @param social     : the employee's social number
     * @param employeeID : the employee's ID
     * @param status     : the employee's working status
     * @param pay        : the employee's pay rate
     */
    public Employee(String firstName, String lastName, int age,
                    String address, Gender gender, float weight, long social,
                    long employeeID, EmploymentStatus status, float pay) {
        super(firstName, lastName, age, address, gender, weight, social);
        this.employeeID     = employeeID;
        this.employeeStatus = status;
        this.payAmount      = pay;
    }



    /***************************************************************************
     * calculate the pay amount that the employee will be receiving.
     * The pay amount will be calculated by multiplying the employee's
     * pay rate with his/her number of time units worked.
     * 
     * @param timeWorked The number of time units the employee has worked.
     *                   The time unit is based on the employee status.
     *                   If the employee is a contractor or a part-time worker,
     *                   the time unit will be hours. If the employee is
     *                   a full-time worker, the time unit will be weeks.
     * @return The amount of pay the employee will be receiving
     */
    public float calculatePay(float timeWorked) {
        // If the employment status is fulltime, the input time unit is week.
        // However, the pay rate is per year, so we must convert it to year unit
        if (employeeStatus == EmploymentStatus.FULL_TIME) {
            timeWorked /= 52.143;
        }
        float result = timeWorked * payAmount;
        // round the result to 2 decimal places
        result = Math.round(result * 100) / 100;
        return result;
    }



    /******************************************************************
     * Represents the Employee class as a string.
     * The string will contains all the information about the employee.
     * Overriding the toString() method
     * 
     * @return the string represents the Employee class
     */
    @Override
    public String toString() {
        String payUnit = "/hour";
        String result = super.toString();
        String status = employeeStatus.toString().toLowerCase().replaceAll("_", " ");

        if (employeeStatus == EmploymentStatus.FULL_TIME)
            payUnit = "/year";

        result += (
            "\n" +
            "ID        : " + employeeID + "\n" +
            "Status    : " + status + "\n" +
            "Pay Rate  : " + "$" + String.format("%.2f", payAmount) + payUnit
        );
        return result;
    }



    public long getEmployeeID() {
        return this.employeeID;
    }


    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }


    public EmploymentStatus getEmployeeStatus() {
        return this.employeeStatus;
    }


    public void setEmployeeStatus(EmploymentStatus employeeStatus) {
        this.employeeStatus = employeeStatus;
    }


    public float getPayAmount() {
        return this.payAmount;
    }


    public void setPayAmount(float payAmount) {
        this.payAmount = payAmount;
    }

} // end of Employee class



/*******************************************************
 * Represents the types of employment statuses,
 * including full-time employees, part-time employees, 
 * contractor
 */
enum EmploymentStatus {
    FULL_TIME,
    PART_TIME,
    CONTRACTOR

} // end of EmploymentStatus enum