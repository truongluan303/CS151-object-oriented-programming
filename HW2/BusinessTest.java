public class BusinessTest {

    public static void main(String[] args) {

        Executive exe1 = new Executive("Johnny", "Depp", 1234, new Address(
                                       1111, "Street st", "San Jose", "95132", "CA"), 
                                       200000, 50000, "123456789");

        Executive exe2 = new Executive("Amber", "Heard", 1235, new Address(
                                       2222, "Boulevard Blv", "San Diego", "22400", "CA"),
                                       150000, 30000, "123456788");

        FullTimeSalaried fullSalaried1 = new FullTimeSalaried(
            "Tom", "Cruise", 1236, new Address(
                3333, "Parkway Prkw", "Los Angeles", "90001", "CA"
            ), 170000, "123456777"
        );

        FullTimeSalaried fullSalaried2 = new FullTimeSalaried(
            "Chris", "Pratt", 1237, new Address(
                4444, "Road Rd", "San Francisco", "94016", "CA"
            ), 180000, "123456666"
        );

        FullTimeHourly fullHourly1 = new FullTimeHourly(
            "Lil", "Pump", 1238, new Address(
                5555, "Route Rte", "Austin", "73301", "TX"),
            30, 45, "1234555555"
        );

        FullTimeHourly fullHourly2 = new FullTimeHourly(
            "Vin", "Diesel", 1239, new Address(
                6666, "Route Rte", "Austin", "73301", "TX"),
            40, 60, "1234555556"
        );
        
        Contractor contractor1 = new Contractor(
            "Will", "Smith", 1300, new Address(
                7777, "Road Rd", "San Jose", "95111", "CA"),
            35, "123455557"
        );

        Contractor contractor2 = new Contractor(
            "Emma", "Watson", 1301, new Address(
                8888, "White Rd", "Oakland", "93331", "CA"),
            50, "123444444"
        );

        PartTimeHourly partTimeHourly1 = new PartTimeHourly(
            "Tom", "Holland", 1302, new Address(
                9000, "Piedmont Rd", "San Jose", "95131", "CA"),
            40, "123333333"
        );

        PartTimeHourly partTimeHourly2 = new PartTimeHourly(
            "Charlie", "Cox", 1303, new Address(
                9001, "King Rd", "San Diego", "911111", "CA"),
            50, "122222222" 
        );

        Customer customer1 = new Customer(
            "Elon", "Musk", new Address(
                1000, "Street Str", "Freemont", "95222", "CA"),
            12345, "111111111"
        ); 

        Customer customer2 = new Customer(
            "Steve", "Jobs", new Address(
                2000, "Apple Pkwy", "Cupertino", "95333", "CA"),
            54321, "222222222"
        );


        exe1.introduce(false);  // pass in false will not show SSN
        printPay(exe1.getFirstName(), exe1.computePay());

        exe2.introduce();
        printPay(exe2.getFirstName(), exe2.computePay());

        fullSalaried1.introduce();
        printPay(fullSalaried1.getFirstName(), fullSalaried1.computePay(1));

        fullSalaried2.introduce();
        printPay(fullSalaried2.getFirstName(), fullSalaried2.computePay(2));

        fullHourly1.introduce();
        printPay(fullHourly1.getFirstName(), fullHourly1.computePay(38));

        fullHourly2.introduce();
        printPay(fullHourly2.getFirstName(), fullHourly2.computePay(40));

        partTimeHourly1.introduce();
        printPay(partTimeHourly1.getFirstName(), partTimeHourly2.computePay(20));

        partTimeHourly2.introduce();
        printPay(partTimeHourly2.getFirstName(), partTimeHourly2.computePay(18));

        contractor1.introduce();
        printPay(contractor1.getFirstName(), contractor1.computePay(32));

        contractor2.introduce();
        printPay(contractor2.getFirstName(), contractor2.computePay(40));

        customer1.introduce();

        customer2.introduce();

        System.out.println("\n\n");
    }



    public static void print(Object o) {
        System.out.println("\n\n\033[1;36m=============================================\033[0m");
        System.out.println(o.toString());
    }



    public static void printPay(String name, float pay) {
        System.out.println("\033[0;93m" + name + " receives $" +
                         String.format("%.2f", pay) + " for this pay period" + "\033[0m");
    }
}