public class Executive extends Person {
    private float yearlyBonus;
    private float yearlyCompensation;


    /**
     * Default Constructor
     */
    public Executive() {
        super();
        yearlyBonus = 0;
        yearlyCompensation = 0;
    }


    /**
     * Overloaded Constructor
     * @param firstName
     * @param lastName
     * @param id
     * @param address
     * @param pay base pay amount per year
     * @param bonus bonus amount per year
     * @param socialNumber
     */
    public Executive(String firstName, String lastName, int id,
                     Address address, float pay, float bonus,
                     String socialNumber) {
        super(firstName, lastName, -1, socialNumber, address);
        this.yearlyBonus = bonus;
        this.yearlyCompensation = pay;
    }




    @Override
    public String toString() {
        return super.toString() + (
            "Yearly Bonus: $" + String.format("%.2f", yearlyBonus) +
            "\nyearly Compensation: $" + String.format("%.2f", yearlyCompensation) + "\n"
        );
    }



    public float computePay() {
        return yearlyCompensation + yearlyBonus;
    }

    

    public float getYearlyBonus() {
        return this.yearlyBonus;
    }

    public void setYearlyBonus(float yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    public float getYearlyCompensation() {
        return this.yearlyCompensation;
    }

    public void setYearlyCompensation(float yearlyCompensation) {
        this.yearlyCompensation = yearlyCompensation;
    }
}
