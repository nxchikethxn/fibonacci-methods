import java.util.Random;

// resources used include lecture slides as well as 
// https://stackoverflow.com/questions/8065532/how-to-randomly-pick-an-element-from-an-array

/* collaborators:
 * Maisoon Rahman
 * Annie Chen
 * Jessica Lim
 * Jasmine Ongole
 */

public class fibMethods {
    
    private int size = 10;
    private int array[] = new int[size];

    // method that adds a number to the list
    public void add(int item) {
        for(int i = 0; i < array.length - 1; i++) {
            array[i] = FibonacciSeq.fibIteration(i);
        }
    }

    // method that removes a number from the list
    public void remove(int item) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == item) {
                array[i] = array[i + 1];
            }
            else if(array[i] == array[size]) {
                array[i] = 0;
            }
            else {
                System.out.println("item not in array.");
            }
        }
    }

    // method that checks if the item exists in the list
    public boolean ifContains(int item) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == item) {
                return true;
            }
        }
        return false;
    }

    // a method that draws a random number from the list without removing
    public int grab() {
        Random num = new Random();
        int rnd = 0;
        rnd = 1 + num.nextInt(array.length);
        return array[rnd];
    }
    

    // this method prints out the number of unique items in the list (WITHOUT DUPLICATES)
    public String numItems() {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] != array[i + 1]) {
                sum = sum + 1;
            }
        }
        return "the number of items in the list is" + numItems();
    }

}
