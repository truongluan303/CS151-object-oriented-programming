import java.util.*;


/**
 * A class that performs operation on an ArrayList
 * including sorting, swaping largest and smallest
 * elements, and sort based on occurences.
 */
class ListManipulation {
    
    /**
     * Sort an array list of integer in acsending or decending order
     * @param myList an array list of integer to sort
     * @param ascending order to sort
     * @return the sorted array list
     */
    public static ArrayList<Integer> sort(ArrayList<Integer> myList, Boolean ascending) {
        if (ascending) {
            Collections.sort(myList);
        }
        else {
            Collections.sort(myList, Collections.reverseOrder());
        }
        return myList;
    }





    /**
     * 
     * @param myList an array list of integer to swap biggest and smallest elements
     * @return the modified array list
     */
    public static ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myList) {

        Integer maxVal = myList.get(0), minVal = myList.get(0);
        int maxIdx = 0, minIdx = 0;

        for (int i = 1; i < myList.size(); i++) {
            // find the largest and smallest values and their indices
            if (myList.get(i) > maxVal) {
                maxVal = myList.get(i);
                maxIdx = i;
            }
            if (myList.get(i) < minVal) {
                minVal = myList.get(i);
                minIdx = i;
            }
        }

        // swap the positions for the largest and smallest elements
        myList.set(maxIdx, minVal);
        myList.set(minIdx, maxVal);

        return myList;
    }





    /**
     * 
     * @param myList an array list of integer to display
     */
    public static void table(ArrayList<Integer> myList) {
        HashMap<Integer, Integer> bag = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        
        // get the frequency of all elements
        // also map each value to its first occurence index
        for (int i = 0; i < myList.size(); i++) {
            Integer val = myList.get(i);
            if (!bag.containsKey(val)) {
                bag.put(val, 0);
                indexMap.put(val, i);
            }
            bag.put(val, bag.get(val) + 1);
        }
        
        ArrayList<Integer> items = new ArrayList<>();
        for (Integer key : bag.keySet()) {
            items.add(key);
        }
        
        // sort the items based on the occurences
        Collections.sort(items, new Comparator<Integer>(){
            public int compare(Integer a, Integer b) {
                int freq1 = bag.get(a);
                int freq2 = bag.get(b);

                if (freq1 > freq2) {
                    return 1;
                }
                if (freq1 == freq2) {
                    // which element appears first will get the higher priority
                    if (indexMap.get(a) < indexMap.get(b)) {
                        return 1;
                    }
                    return -1;
                }
                return -1;
            }
        });

        // print out the table
        System.out.println("\nValue\t\tOccurences");
        System.out.println("--------------------------");
        for (Integer val : items) {
            System.out.println(val + "\t\t" + bag.get(val));
        }
    }




    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 3, 2, 9, 5));

        arr = sort(arr, true);
    
        System.out.println(arr);
    }
}