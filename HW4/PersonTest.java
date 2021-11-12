import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;



public class PersonTest {
    
    public static void main(String[] args) {

        String[] fnames = new String[]{"Joe", "Amy", "Tony", "Sean", "Tina", "Lenny"};

        String[] lnames = new String[]{"Smith", "Gold", "Stork", "Irish", "Brock", "Hep"};

        int[] ages = new int[]{40, 32, 21, 24, 28, 18};

        ArrayList<Person> people = new ArrayList<Person>();

        // create the instances of Person class
        for (int i = 0; i < fnames.length; i++) {
            people.add(new Person(fnames[i], lnames[i], ages[i]));
        }

        sort(people);
    }



    
    /**
     * Sort a list of Person instances based on the attributes of Person classes
     * 
     * @param ppl the list of Person instances to be sorted
     */
    public static void sort(ArrayList<Person> ppl) {

        Comparator<Person> fnameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getFname().compareTo(p2.getFname());            
            }
        };

        Comparator<Person> lnameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLname().compareTo(p2.getLname());
            }
        };

        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                Integer age1 = Integer.valueOf(p1.getAge());
                Integer age2 = Integer.valueOf(p2.getAge());
                return age1.compareTo(age2);
            }
        };

        System.out.println("Sorted ascendingly based on first name:");
        Collections.sort(ppl, fnameComparator);
        printPersonList(ppl);

        System.out.println("Sorted descendingly based on first name:");
        Collections.sort(ppl, Collections.reverseOrder(fnameComparator));
        printPersonList(ppl);

        System.out.println("Sorted ascendingly based on last name:");
        Collections.sort(ppl, lnameComparator);
        printPersonList(ppl);

        System.out.println("Sorted descendingly based on last name:");
        Collections.sort(ppl, Collections.reverseOrder(lnameComparator));
        printPersonList(ppl);

        System.out.println("Sorted ascendingly based on age:");
        Collections.sort(ppl, ageComparator);
        printPersonList(ppl);

        System.out.println("Sorted descendingly based on age:");
        Collections.sort(ppl, Collections.reverseOrder(ageComparator));
        printPersonList(ppl);
    }






    public static void printPersonList(ArrayList<Person> ppl) {
        for (Person p : ppl) {
            System.out.print(p.getFname() + "  ");
        }
        System.out.printf("\n\n");
    }
}
