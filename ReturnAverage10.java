/*
10.	Write a method that takes an array of double and returns the average of all the elements in the array.
 */

public class ReturnAverage10 {
    public static void main(String[] args) {
        double[] numbers = new double[]{50, 30, 21};
        System.out.println("The average is: " + average(numbers));
    }

    private static double average(double[] Array1) {
        double average = 0;
        for (int i = 0; i < Array1.length; i++) {
            average += Array1[i] / Array1.length;
        }
        return average;
    }
}
