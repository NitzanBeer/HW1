public class Assignment01Q02 {
    /**
     * Approximates the value of pi using a mathematical expression
     * @param args args[0] is the number of terms to use in the approximation
     */
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int input = Integer.parseInt(args[0]);
        for (int i = 0; i < input; i++){
            if (i % 2 == 0){
                approxPi += 1.0 / (2 * i + 1);
            }
            else{
                approxPi -= 1.0 / (2 * i + 1);
            }
        }
        approxPi *= 4;
        System.out.println(approxPi + " " + actualPi);
    }
}
