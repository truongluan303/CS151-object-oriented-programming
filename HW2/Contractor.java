/**
 * Represents a contractor
 * Since contractor is a type of employee
 * The class will inherit from employee class
 */
public class Contractor extends Employee {
    
    private float basePay;


    /**
     * Default Constructor
     */
    public Contractor() {
        super();
        basePay = 0;
    }



    /**
     * Overloaded Constructor
     * @param firstName first name
     * @param lastName last name
     * @param id emplyee id
     * @param address
     * @param pay pay amount
     * @param socialNumber social security number
     */
    public Contractor(String firstName, String lastName, int id,
                      Address address, float pay, String socialNumber) {
        super(firstName, lastName, id, address, socialNumber);
        this.basePay = pay;
    }



    @Override
    public String toString() {
        return super.toString() + (
            "Base Pay: " + basePay + "\n"
        );
    }


    /**
     * @param numOfHours total hours that the contractor worked
     * @return the pay amount based on the given hours worked
     */
    public float computePay(float numOfHours) {
        return numOfHours * basePay;
    }



    public float getBasePay() {
        return this.basePay;
    }

    public void setBasePay(float basePay) {
        this.basePay = basePay;
    }
}
