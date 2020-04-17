/*
5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.

 */
public class five_six {
    public static void main(String[] args) {
        String[] strings = new String[]{"Sam", "Thommy", "Tim", "Sally", "Buck", "Bob"};

        int total = 0;
        int sum = 0;
        String line = "------------------------------";

        for (int i = 0; i < strings.length; i++) {
            int[] nameLengths = new int[]{strings[i].length()};
            System.out.println(line);
            System.out.print(strings[i]);
            for (int j = 0; j < nameLengths.length; j++) {
                total = nameLengths[j];
                System.out.println(" is " + total + " letters in length");
                sum += nameLengths[j];
                System.out.println("The Sum ------------> " + sum);
            }

        }

    }
}
