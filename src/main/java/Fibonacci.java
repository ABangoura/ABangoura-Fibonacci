
public class Fibonacci {
    /**
     * Return the nth number of fibonacci sequence.
     * The fibonacci sequence is calculated by adding the previous two numbers in the sequence to obtain the next
     * number. The first two numbers in the whole fibonacci sequence are always 0 and 1.
     * For instance, the sequence starts as:
     * 0 1 1 2 3 5 8 13 21
     * where the 4th number of the sequence would be 3, the 5th number would be 5, the 6th number would be 8, etc.
     *
     * You could either use a for loop to keep track of the current number of the fibonacci sequence as well as the two
     * numbers before it, or you could look up a recursive solution to experiment with recursion for the first time.
     *
     * @param n an iteration of the fibonacci sequence.
     * @return the nth number of fibonacci sequence.
     */
    public int fib(int n){

        // Using recursion, we can first set up the two base cases:
        // n = 0, and n = 1.
        if(n == 0)
            return 0; // Fibonacci value of 0 is 0.
        else if(n == 1)
            return 1; // Fibonacci value of 1 is 1.
        // Now we can make recursive calls to the 'fib()' method until it gets to the base cases, then back up the call stack.
        else
            return fib(n - 1) + fib(n - 2); // With n-1 and n-2 being the 2 consecutive numbers before n.
    }
}
