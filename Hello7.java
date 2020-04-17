/*
7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to
    itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
 */
public class Hello7 {

    public static void main(String[] args) {
        String result = hello("Hello", 3);
        System.out.println(result);
    }

    public static String hello(String word, int n) {
        String string = word;
        return string.repeat(n);
    }
}
