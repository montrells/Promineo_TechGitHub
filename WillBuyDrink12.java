/*
1.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
    and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
 */

public class WillBuyDrink12 {
    public static void main(String[] args) {
        System.out.println(willBuyDrink(true, 10.60));
    }

    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {

        if (isHotOutside && moneyInPocket > 10.50){
            return true;
        }else {

            return false;
        }

   }
}