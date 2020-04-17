import java.util.ArrayList;

public class FirstLast {

    // main method
    public static void main(String[] args)
    {

        // creating an Empty Integer ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>(5);

        // using add() to initialize values
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // printing initial value ArrayList
        System.out.print("ArrayList: " + list);

        // find first element
        int first = list.get(0);

        // find last element
        int last = list.get(list.size() - 1);

        // print first and last element of ArrayList
        System.out.println("\nFirst : " + first
                + ", Last : " + last);
    }
}
