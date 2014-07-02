package jerimy.test.app1;

/**
 *
 * @author theider
 */
public class Fibonacci {

    // EX 2:
    // add a new method for returning a list of size n Fibonacci numbers starting with 1.
    // use the method below to populate it.
    // document your method contract using Javadoc.
    
    
    /**
     * Return the Fibonacci number starting with 1.
     * @param n
     * Any positive integer (1..n).
     * @return 
     * The Fibonacci number from 1 .. n
     */
    public int fibonacciNumber(int n) {
        if(n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer.");
        }
        if(n == 1) {
            return 1;
        } else if(n == 2) {
            return 1;
        } else {
            return fibonacciNumber(n-1) + fibonacciNumber(n-2);
        }
    }
    
}
