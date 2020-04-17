/*
8.	Write a method that takes two Strings, firstName and lastName, and returns a full name
     (the full name should be the first and the last name as a String separated by a space).
 */
public class FullName8 {

    public static void main(String[] args) {
        String FullName = fullName("Montrell", "Story");
        System.out.println(FullName);

    }

    public static String fullName(String fn, String ln) {
        return fn + " " + ln;
    }
}
