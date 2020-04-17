/*
9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
 */

public class LargeSum9 {

    public static void main(String[] args) {
        int[] number = new int[]{50, 30, 21};
        System.out.println( intSumOver100 (number[0], number[1], number[2]));
    }

    private static boolean intSumOver100(int one, int two, int three) {
        int group = one + two + three;
        if (group > 100) {
            return true;
        } else {
            return false;
        }
    }

    }


