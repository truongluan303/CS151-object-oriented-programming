/**
 * Represents a part time employee that is paid by hourly wage.
 * The class inherits from Employee
 */
public class PartTimeHourly extends Employee {
    private float baseHourlyPay;


    /**
     * Default Constructor
     */
    public PartTimeHourly() {
        super();
        baseHourlyPay = 0;
    }


    /**
     * Overloaded Construtor 
     * @param firstName
     * @param lastName
     * @param id
     * @param address
     * @param pay the amount of hourly wage
     * @param ssn social security number
     */
    public PartTimeHourly(String firstName, String lastName, int id,
                          Address address, float pay, String ssn) {
        super(firstName, lastName, id, address, ssn);
        this.baseHourlyPay = pay;
    }



    @Override
    public String toString() {
        return super.toString() + (
            "Base Hourly Pay: $" + String.format("%.2f", baseHourlyPay) + "\n\n"
        );
    }


    public float computePay(float hoursPerWeek) {
        return hoursPerWeek * baseHourlyPay;
    }



    public float getBaseHourlyPay() {
        return this.baseHourlyPay;
    }

    public void setBaseHourlyPay(float baseHourlyPay) {
        this.baseHourlyPay = baseHourlyPay;
    }
}
