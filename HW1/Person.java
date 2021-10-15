/**
 * Person class
 * 
 * containing the basic information of a person such as
 * name, age, address, gender, weight, and social number
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private Gender gender;
    private float weight;
    private long socialNumber;



    /**********************************************************
     * Constructor for Person class
     * 
     * @param firstName : the person's first name
     * @param lastName  : the person's last name
     * @param age       : the person's age
     * @param address   : the address that the person lives at
     * @param gender    : the person's gender
     * @param weight    : the person's weight
     * @param social    : the person's social security number
     */
    public Person(String firstName, String lastName, int age,
                  String address, Gender gender, float weight, long social) {
        this.firstName    = formatString(firstName);
        this.lastName     = formatString(lastName);
        this.age          = age;
        this.address      = address;
        this.gender       = gender;
        this.weight       = weight;
        this.socialNumber = social;
    }



    /***********************************************************
     * Represents the class Person as a string.
     * The string will include all information about the person.
     * This method is overriding the toString() method 
     * 
     * @return a string represents the Person class
     */
    @Override
    public String toString() {
        return (
            "First Name: " + firstName + "\n" +
            "Last Name : " + lastName + "\n" +
            "Age       : " + age + "\n" +
            "Address   : " + address + "\n" +
            "Gender    : " + gender.toString().toLowerCase().replace("_", " ") + "\n" +
            "Weight    : " + String.format("%.2f", weight) + " lbs\n" +
            "SSN       : " + socialNumber
        );
    }


    public void introduce() {
        System.out.println(toString());
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


    public String getAddress() {
        return this.address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public Gender getGender() {
        return this.gender;
    }


    public void setGender(Gender gender) {
        this.gender = gender;
    }


    public float getWeight() {
        return this.weight;
    }


    public void setWeight(float weight) {
        this.weight = weight;
    }


    public long getSocialNumber() {
        return this.socialNumber;
    }


    public void setSocialNumber(long socialNumber) {
        this.socialNumber = socialNumber;
    }


    /**
     * format a string so that it will be lowercase
     * with only the first letter capitalized
     * 
     * @param str the string to be formatted
     * @return the formatted string
     */
    public String formatString(String str) {
        str = str.replaceAll("_", " ");
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

} // end of Person class



/**
 * Represents the possible gender of a person.
 * The genders including male, female, bisexual,
 * transgender, and other.
 */
enum Gender {
    MALE,
    FEMALE,
    BISEXUAL,
    TRANS,
    OTHER

} // end of Gender enum