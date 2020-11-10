import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        //setting counter variable
        int x = 0;
        //getting array list size
        int w = list.size();
        //for loop checking if number is odd
        for (int i = 0; i < w; i++) {
            int temporary = list.get(i);
            if(temporary % 2 != 0) {
                x++;
            }
            //useless else statement, just to avoid possible glitches
            else {
                x = x;
            }
        }
        return x;
        // REPLACE WITH YOUR CODE
        
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        //setting counter variable
        int x = 0;
        int w = list1.size();
        //for loop checks if lists have same item, uses counter
        for (int i = 0; i < w; i++) { 
            int item = list1.get(i);
            if (list2.contains(item)) {
                x++; 
            }
            else {
                x = x;
            }
        } 
        //returning true or false
        if(x != 0) {
            return true;
        }
        else {
            return false;
        }
       
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        //making variable for new array list
        ArrayList<Integer> newint = new ArrayList<Integer>(arr.length);
        //for loop
        for (int i = 0; i < arr.length; i++) {
            newint.add(arr[i]);
        }
        //returning new array list
        return newint;
        //return null;
    }


    public static void main(String[] args) {

        //testing array convert
        int[] hap = {1,3,5,7,9};
        System.out.println(convertToArrayList(hap));

        //testing counting odds
        ArrayList<Integer> oddnumbers = new ArrayList<Integer>();
            oddnumbers.add(1);
            oddnumbers.add(2);
            oddnumbers.add(3);
            oddnumbers.add(4);
            oddnumbers.add(5);
        System.out.println(countOdd(oddnumbers));
        
        //testing duplicates
        ArrayList<Integer> othernumbers = new ArrayList<Integer>();
            othernumbers.add(7);
            othernumbers.add(6);
            othernumbers.add(5);
            othernumbers.add(4);
            othernumbers.add(3);
        System.out.println(checkDuplicates(oddnumbers, othernumbers));
        // Write some code here to test your methods!
    }
}
