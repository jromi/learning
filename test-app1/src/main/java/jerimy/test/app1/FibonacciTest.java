package jerimy.test.app1;

import java.util.List;

/**
 *
 * @author theider
 */
public class FibonacciTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Fibonacci f = new Fibonacci();        
        // EX. 1
        // create an array of 10 integers (and give it a name like myNumbers)
        
        // use the Fibonacci object f to populate the array of integers.
        
        // use another iterator loop that prints out the values like below but using the array
        int[] myNumbers = new int[10];
        
        for (int fill=1; fill <= myNumbers.length; fill++){                    
            myNumbers[fill-1] = f.fibonacciNumber(fill);
            System.out.println("value: " + myNumbers[fill-1] + " is located at array position: " + (fill-1));
        }
               
        System.out.println("Use sequence to output a list...");
        List<Integer> sequence = f.getFibonacciSequence(10);
        int i=1;
        for(Integer x : sequence) {
            System.out.println(i + " " + x);
            i++;
        }
        
    }
    
    // EX. 2
    // Do the same thing as above but have the Fibonacci class return a List<> of integers
    // and then output that list of integers.
    
}
