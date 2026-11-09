public class Assignment01Q03 {
    /**
     * Prints the first x Fibonacci numbers and counts the number of odd numbers
     * @param args args[0] is the number of Fibonacci numbers to print
     */
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        // Create an array to hold the Fibonacci numbers
        long[] fib = new long[x];
        fib[0] = 1;
        fib[1] = 1;
        for (int j = 2; j < x; j++) {
            fib[j] = fib[j - 1] + fib[j - 2];
        }
        // Count the number of odd Fibonacci numbers and print the Fibonacci numbers
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(fib[i]);
            if (fib[i] % 2 != 0){
                numOdd++;
            }
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();       
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
