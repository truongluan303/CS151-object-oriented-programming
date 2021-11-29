
/**
 * Represents a real address with street number,
 * street name, city, state, and zip code.
 */
public class Address {
    private int streetNum;
    private String streetName;
    private String city;
    private String zip;
    private String state;



    /**
     * Constructor
     * @param streetNum street number
     * @param streetName street name
     * @param city 
     * @param zip zip code (5 digits)
     * @param state
     */
    public Address(int streetNum, String streetName, String city,
                   String zip, String state) {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }


    @Override
    public String toString() {
        return (
            "\n\t\tStreet Number: " + streetNum +
            "\n\t\tStreet Name: " + streetName +
            "\n\t\tCity: " + city +
            "\n\t\tState: " + state +
            "\n\t\tZip Code: " + zip + "\n"
        );
    }


    public int getStreetNum() {
        return this.streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
