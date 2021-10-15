/**
 * Represents a full time employee that is paid by annual salary.
 * The class inherits from Fulltime employee
 */
public class FullTimeSalaried extends FullTimeEmployee {
    
    /**
     * Default Constructor
     */
    public FullTimeSalaried() {
        super();
    }


    /**
     * Overloaded Constructor
     * @param firstName
     * @param lastName
     * @param id
     * @param address
     * @param salary the annual salary
     * @param ssn social security number
     */
    public FullTimeSalaried(String firstName, String lastName, int id,
                            Address address, float salary, String ssn) {
        super(firstName, lastName, id, address, salary, ssn);
    }



    public float computePay(int numOfWeeks) {
        return numOfWeeks * super.getBasePay() / 52;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
