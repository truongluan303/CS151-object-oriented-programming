public abstract class FullTimeEmployee extends Employee {
    private float basePay;


    /**
     * Default Constructor
     */
    public FullTimeEmployee() {
        super();
        basePay = 0;
    }


    /**
     * Overloaded Constructor
     * @param firstName
     * @param lastName
     * @param id
     * @param address
     * @param basePay base pay per year
     * @param ssn social security number
     */
    public FullTimeEmployee(String firstName, String lastName, int id,
                            Address address, float basePay, String ssn) {
        super(firstName, lastName, id, address, ssn);
        this.basePay = basePay;
    }



    @Override
    public String toString() {
        return super.toString() + (
            "Base Pay: $" + String.format("%.2f", basePay) + "\n"
        );
    }



    public float getBasePay() {
        return this.basePay;
    }

    public void setBasePay(float basePay) {
        this.basePay = basePay;
    };

}
