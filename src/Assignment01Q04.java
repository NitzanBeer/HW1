import java.util.Arrays;

public class Assignment01Q04 {

    /** Shifts an array cyclically by a given number of positions.
     * @param array The input array to shift.
     * @param move The number of positions to shift 
     * @param direction The direction of the shift ('R' for right, 'L' for left).
     * @return The shifted array.
     */
    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        int len = array.length;
        if (len == 0 || move == 0){ // If the array is empty or no movement is needed, return the original array
            return array;
        }
        int steps = Math.abs(move % len); 
        // option 1 - moving right
        if ((direction == 'R' && move > 0) || (direction == 'L' && move < 0)) {
            for (int i = 0; i < steps; i++) {
                shiftRightByOne(array);
            }
        }
        // option 2 - moving left
        else if ((direction == 'L' && move > 0) || (direction == 'R' && move < 0)) {
            for (int i = 0; i < steps; i++) {
                shiftLeftByOne(array);
            }
        }
        return array;
    }
    /** 
     * Shifts the array one position to the right, in place.
     * The last element becomes the first.
     */
    private static void shiftRightByOne(int[] array) {
        int len = array.length;
        int temp = array[len - 1];
        for (int i = len - 2; i >= 0; i--){
            array[i + 1] = array[i];
        }
        array[0] = temp;
    }
    /**
     * Shifts the array one position to the left, in place.
     * The first element becomes the last.
     */
    private static void shiftLeftByOne(int[] array) {
        int len = array.length;
        int temp = array[0];
        for (int i = 1; i < len; i++){
            array[i - 1] = array[i];
        }
        array[len - 1] = temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}