/**
 * Represents a person with fields including
 * first name, last name, age.
 */
public class Person {
    
    private String fname;
    private String lname;
    private int age;



    public Person() {
        this("N/A", "N/A", 0);
    }




    public Person(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }




    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
