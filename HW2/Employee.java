/**
 * Represents an employee with all the necessary information
 * including emplyee ID, education, and direct diposit acceptance.
 * Since employee is a person, this class inherits from person class
 */
public abstract class Employee extends Person {
    private int id;
    private String education;
    private boolean directDeposit;


    /**
     * Default Constructor
     */
    public Employee() {
        id = -1;
        education = null;
        directDeposit = false;
    }


    /**
     * Overloaded Constructor
     * @param firstName first name
     * @param lastName last name
     * @param id employee ID
     * @param address emplyee's address
     * @param socialNumber employee's social security number
     */
    public Employee(String firstName, String lastName, int id,
                    Address address, String socialNumber) {
        super(firstName, lastName, -1, socialNumber, address);
    }


    @Override
    public String toString() {
        return super.toString() + (
            "Employee ID: " + ((id > 0) ? id : "N/A") +
            "\nEducation Level: " + (education != null ? education : "N/A") +
            "\nAccept Direct Deposit: " +
            (directDeposit ? "Yes" : "No") + "\n"
        );
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEducation() {
        return this.education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public boolean isDirectDeposit() {
        return this.directDeposit;
    }

    public void setDirectDeposit(boolean directDeposit) {
        this.directDeposit = directDeposit;
    }
}
