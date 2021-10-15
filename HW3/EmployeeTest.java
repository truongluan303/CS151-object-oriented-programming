/**
 * Run test to make sure the Employee class works as expected.
 * Create an instance of Employee then call the function
 * computePay()
 */
public class EmployeeTest {

    public static void main(String[] args) {
        
        Employee employee = new Employee("John", "Smith", 101, 35f);

        int[] hoursWorked = {40, 23, 1, 0, -5, 45};
        

        for (int i = 0; i < hoursWorked.length; i++) {
            try {
                int hours = hoursWorked[i];
                float pay = employee.computePay(hours);
                System.out.println("\nThe pay for " + hours + " hour(s) of work is: $" + pay);
            } 
            catch(TooManyHoursWorkedException | NumberFormatException e) {
                System.out.println("\nError Message: " + e.getMessage());
            }
        }
        System.out.println("\n");
    }
}
