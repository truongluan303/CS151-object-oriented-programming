import java.util.ArrayList;
import java.util.Arrays;


public class MethodTest {

    public static void main(String[] args) {

        ArrayList<String> sList = new ArrayList<>(
            Arrays.asList("Facebook", "Amazon", "Apple", "Netflix", "Google")
        );
        ArrayList<Integer> iList = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5, 6)
        );
        ArrayList<Double> dList = new ArrayList<>(
            Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8)
        );

        int sCount = count(sList);
        int iCount = count(iList);
        int dCount = count(dList);

        System.out.println("String Array List Count: " + sCount);
        System.out.println("Integer Array List Count: " + iCount);
        System.out.println("Double Array List Count: " + dCount);
    }



    public static <T> int count(ArrayList<T> arrayList) {
        int elementCount = 0;
        for (T element : arrayList) {
            elementCount++;
        }
        return elementCount;
    }
}