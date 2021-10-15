/**
 * Customer class
 * Represents a customer with the needed info such as
 * customer ID or payPreference
 */
public class Customer extends Person {
    private int customerID;
    private String payPreference;


    /**
     * Default Constructor
     */
    public Customer() {
        super();
        customerID = -1;
        payPreference = null;
    }


    /**
     * Overloaded Constructor
     * @param firstName customer's first name
     * @param lastName customer's last name
     * @param address customer's address
     * @param id customer's id
     * @param socialNumber customer's ssn
     */
    public Customer(String firstName, String lastName, Address address,
                    int id, String socialNumber) {
        super(firstName, lastName, -1, socialNumber, address);
        this.customerID = id;
    }



    /**
     * Print out the customer's pay preference
     */
    public void makePayment() {
        System.out.println("\nPay Preference: " + payPreference + "\n");
    }



    @Override
    public String toString() {
        return super.toString() + (
            "Customer ID: " + customerID +
            "\nPay Preference: " + (payPreference != null ? payPreference : "N/A" )
        );
    }


    /**
     * Print all the customer's inforation except for SSN
     */
    @Override
    public void introduce() {
        super.introduce(false);
    }



    @Override
    public void introduce(boolean showsSSN) {
        // SSN cannot be shown for customers, so throw exception if someone attempts to show SSN
        if (showsSSN) {
            throw new UnsupportedOperationException("SSN cannot be shown for customers!");
        }
        this.introduce();
    }



    public int getCustomerID() {
        return this.customerID;
    }


    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getPayPreference() {
        return this.payPreference;
    }

    public void setPayPreference(String payPreference) {
        this.payPreference = payPreference;
    }
}