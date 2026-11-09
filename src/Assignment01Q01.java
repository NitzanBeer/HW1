public class Assignment01Q01 {
    /**
     * Prints the first char of each command line argument
     * if the ASCII value of that char is divisible by 5.
     * @param args the input strings from the command line
     */
    public static void main(String[] args) {
        int lenArgs = args.length;
        int i = 0;
        while (i < lenArgs){
            char firstChar = args[i].charAt(0);
            int valueOfFirstChar = (int) firstChar;
            if (valueOfFirstChar % 5 == 0){
                System.out.println(firstChar);
            }
            i++;
        }
    }
}

