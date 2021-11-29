/**
 * Represents a person.
 * 
 * Contains all the information of a person including
 * first name, last name, age, social number, and address
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String socialNum;
    private Address address;


    /**
     * Overloaded Constructor 
     * @param firstName
     * @param lastName
     * @param age
     * @param social social security number
     * @param address
     */
    public Person(String firstName, String lastName, int age,
                  String social, Address address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.socialNum = social;
        this.address = address;
    }


    /**
     * Default Constructor
     */
    public Person() {
        firstName = lastName = socialNum = null;
        address = null;
        age = -1;
    }



    @Override
    public String toString() {
        return (
            "\n\tFirst Name: " + firstName +
            "\n\tLast Name: " + lastName +
            "\n\tAge: " + ((age != -1) ? age : "N/A") +
            "\n\tSSN: " + socialNum +
            "\n\tAddress: " + address + "\n\n"
        );
    }



    /**
     * introduce and automatically shows SSN
     */
    public void introduce() {
        this.introduce(true);
    }


    /**
     * print all the information about the person
     * @param showsSSN whether to show the SSN
     */
    public void introduce(boolean showsSSN) {
        System.out.println("\n\n\033[1;36m===============================================\033[0m");
        
        String output = this.toString();

        // if not show SSN, then delete the that displays social number
        if (!showsSSN) {
            output = output.replace("\nSSN: " + socialNum, "");
        }
        System.out.println(output);
    }



    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSocialNum() {
        return this.socialNum;
    }

    public void setSocialNum(String socialNum) {
        this.socialNum = socialNum;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
