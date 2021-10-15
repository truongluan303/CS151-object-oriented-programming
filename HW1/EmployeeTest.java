/**
 * EmployeeTest class
 * 
 * A class to test if the Employee class is working.
 * In this class, we will create 5 employees
 * with different information. And then we will print out
 * their information as well as calculating their pay amount
 */
public class EmployeeTest {
    
    public static void main(String[] args) {
        Employee joeS = new Employee(
            "Joe", "Smith", 40, "1000 Avenue Ave", Gender.MALE, 
            140.5f, 123456789, 1234, EmploymentStatus.CONTRACTOR, 60f
        );
        getPayAndIntroduce(joeS, 30f);

        Employee lisaG = new Employee(
            "Lisa", "Gray", 45, "2000 Street St", Gender.FEMALE, 
            120f, 123456788, 1233, EmploymentStatus.FULL_TIME, 110000f
        );
        getPayAndIntroduce(lisaG, 2f);

        Employee timB = new Employee(
            "Timothy", "Briggs", 30, "3000 Road Rd", Gender.MALE, 
            130f, 123456777, 1222, EmploymentStatus.FULL_TIME, 80000f
        );
        getPayAndIntroduce(timB, 4f);

        Employee georgeW = new Employee(
            "George", "Wallace", 35, "4000 Boulevard Blvd", Gender.TRANS,
            125f, 123456666, 1111, EmploymentStatus.PART_TIME, 20f
        );
        getPayAndIntroduce(georgeW, 25f);

        Employee amyS = new Employee(
            "Amy", "Student", 22, "5000 Parkway Pkwy", Gender.BISEXUAL, 
            110f, 123455555, 2222, EmploymentStatus.CONTRACTOR, 45f
        );
        getPayAndIntroduce(amyS, 45f);
    }    



    /**
     * print out the information of an employee and then calculate his/her
     * pay amount based on the input time worked
     * 
     * @param employee   : the employee whose information will be printed and
     *                     pay amount will be calculated
     * @param timeWorked : the amount of time that the employee had worked
     */
    private static void getPayAndIntroduce(Employee employee, float timeWorked) {
        System.out.println("\n***************************************************");
        employee.introduce();
        float pay = employee.calculatePay(timeWorked);
        System.out.println();
        System.out.println(employee.getFirstName() + " will receive $" + 
                           String.format("%.2f", pay) + " on the incoming pay check");
        System.out.println();
    }

} // end of EmplyeeTest class


/*
SAMPLE OUTPUT:

***************************************************
First Name: Joe
Last Name : Smith
Age       : 40
Address   : 1000 Avenue Ave
Gender    : male
Weight    : 140.50 lbs
SSN       : 123456789
ID        : 1234
Status    : contractor
Pay Rate  : $60.00/hour

Joe will receive $1800.00 on the incoming pay check 


*************************************************** 
First Name: Lisa
Last Name : Gray
Age       : 45
Address   : 2000 Street St
Gender    : female
Weight    : 120.00 lbs
SSN       : 123456788
ID        : 1233
Status    : full time
Pay Rate  : $110000.00/year

Lisa will receive $4219.00 on the incoming pay check


*************************************************** 
First Name: Timothy
Last Name : Briggs
Age       : 30
Address   : 3000 Road Rd
Gender    : male
Weight    : 130.00 lbs
SSN       : 123456777
ID        : 1222
Status    : full time
Pay Rate  : $80000.00/year

Timothy will receive $6136.00 on the incoming pay check


***************************************************
First Name: George
Last Name : Wallace
Age       : 35
Address   : 4000 Boulevard Blvd
Gender    : trans
Weight    : 125.00 lbs
SSN       : 123456666
ID        : 1111
Status    : part time
Pay Rate  : $20.00/hour

George will receive $500.00 on the incoming pay check


***************************************************
First Name: Amy
Last Name : Student
Age       : 22
Address   : 5000 Parkway Pkwy
Gender    : bisexual
Weight    : 110.00 lbs
SSN       : 123455555
ID        : 2222
Status    : contractor
Pay Rate  : $45.00/hour

Amy will receive $2025.00 on the incoming pay check
*/