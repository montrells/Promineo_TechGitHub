/*
11.	Write a method that takes two arrays of double and returns true if the average of the elements
    in the first array is greater than the average of the elements in the second array.
 */

public class CompareArray11 {
    public static void main(String[] args) {
        double[] numbers1 = new double[]{50., 30., 32.};
        double [] numbers2 = new double[]{60., 30., 21.};
        System.out.println("Is Array1 greater than Array2? " +  average(numbers1, numbers2));
    }

    public static boolean average(double[] numbers1, double[] numbers2) {
        double array1 = 0;
        double array2 = 0;
        for (int i = 0; i < numbers1.length; i++) {
             array1 += numbers1[i] / numbers1.length;
        }
        for (int i = 0; i < numbers2.length; i++) {
            array2 += numbers2[i] / numbers2.length;
        }
        if (array1 > array2){
            return true;
        }else {
         return false;
        }

    }
}