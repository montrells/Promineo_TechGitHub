import java.util.ArrayList;
/*
a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array
    (do not type ANY numbers in the operation, ages[7] – ages[0] is not allowed). Print the result to the console.
b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.

 */

public class one {
    public static void main(String[] args) {
        double total = 0;
        double average = 0;
        double Subtract = 0;
        ArrayList<Double> ages = new ArrayList<Double>();
        ages.add(3.);
        ages.add(9.);
        ages.add(23.);
        ages.add(64.);
        ages.add(2.);
        ages.add(8.);
        ages.add(28.);
        ages.add(93.);

        System.out.println(ages);
        double firstIndex = ages.get(0);
        double lastIndex = ages.get(ages.size() - 1);
        System.out.println("First: " + firstIndex);
        System.out.println("Last: " + lastIndex);
        Subtract = lastIndex - firstIndex;
        System.out.println("Subtract first element from the last: " + Subtract);

        System.out.println(ages.size());

        for (double age : ages) {

            total += age / ages.size();
            System.out.println(total);

        }


    }
}
