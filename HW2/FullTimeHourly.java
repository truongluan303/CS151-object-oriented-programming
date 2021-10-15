/**
 * Represents a full time employee that is paid by hourly wage.
 * The class inherits from Fulltime employee
 */
public class FullTimeHourly extends FullTimeEmployee {

    private float overTimePay;


    /**
     * Default Constructor
     */
    public FullTimeHourly() {
        super();
        overTimePay = 0;
    }


    /**
     * Overloaded Constructor
     * @param firstName
     * @param lastName
     * @param id
     * @param address
     * @param basePay base pay per hour
     * @param overTimePay pay amount for each hour working overtime
     * @param socialNumber
     */
    public FullTimeHourly(String firstName, String lastName, int id,
                          Address address, float basePay,
                          float overTimePay, String socialNumber) {
        super(firstName, lastName, id, address, basePay, socialNumber);
        this.overTimePay = overTimePay;
    }



    @Override
    public String toString() {
        return super.toString() + (
            "Overtime Pay: $" + String.format("%.2f", overTimePay) + "\n"
        );
    }



    /**
     * Calculate the pay amount that this emplyee get.
     * If the employee works more than 40 hours, the exceeded
     * hours will be counted as overtime
     * 
     * @param hoursPerWeek total hours worked this week
     * @return amount paid for the employee this week based on the given hours worked
     */
    public float computePay(float hoursPerWeek) {

        float overtime = 0;

        if (hoursPerWeek > 40) {
            overtime = overTimePay * (hoursPerWeek - 40);
            hoursPerWeek = 40;
        }
        return (hoursPerWeek * super.getBasePay()) + overtime;
    }




    public float getOverTimePay() {
        return this.overTimePay;
    }

    public void setOverTimePay(float overTimePay) {
        this.overTimePay = overTimePay;
    }
}
