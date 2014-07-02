package jerimy.test.app1;

import java.util.ArrayList;
import java.util.Collection;
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
        
        for (int fill=0; fill<myNumbers.length; fill++){        
            int filler = fill+1;  // no zero
            myNumbers[fill] = f.fibonacciNumber(filler);
            System.out.println("value: " + myNumbers[fill] + " is located at array position: " + fill);
        }
        
        for(int i=1;i < 10;i++) {            
            System.out.println(i + " " + f.fibonacciNumber(i));
        }
       
        List<Integer> myList = new ArrayList<>();
        for (int fill=0; fill<10; fill++){
            int filler2 = fill +1;
            myList.add(f.fibonacciNumber(filler2));
        }
        
    }
    
    // EX. 2
    // Do the same thing as above but have the Fibonacci class return a List<> of integers
    // and then output that list of integers.
    
}
