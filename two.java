/*
2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.

 */
public class two {
    public static void main(String[] args) {
        String[] strings = new String[]{"Sam", "Thommy", "Tim", "Sally", "Buck", "Bob"};


        int totalLength = 0;
        for (String string : strings) {
            totalLength += string.length();
        }
        System.out.println("Number of words in array: " + strings.length);
        System.out.println("The total length of the quote is: " + totalLength);
        System.out.println("The average is: " + totalLength / strings.length);

        for (String string : strings) {
            System.out.print(string + " ");
        }
        System.out.println();

    }
}
