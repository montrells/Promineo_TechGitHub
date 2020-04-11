public class Coding_Assignment {

    public static void main(String[] args) {

        boolean	isHotOutside = true;
        boolean isWeekday = true;
        boolean hasMoneyInPocket = true;

        double costOfMilk = 2.50;
        double moneyInWallet = 5.50;
        int thirstLevel = 5;
        double iceCream = 2.10;
        String line = "--------------------------------------------";
        double shouldBuyIcecream = (moneyInWallet - iceCream);
        boolean willGoSwimming = (isHotOutside && !isWeekday);
        String willBuyMilk = "I'm Thirsty. Time to buy some milk!";
        String isAGoodDay = "Lets DO This";

        //--------------------------------------------
        System.out.println(line);
        if (isHotOutside){
            System.out.println("Money left after buying Ice cream: $" + shouldBuyIcecream);
        }else {
            System.out.println("Don't have enough Money ");
        }
       //--------------------------------------------
        System.out.println(line);
        if (willGoSwimming){
            System.out.println("Hot Weekend Baby! Lets Go Swimming!!!");
        }else {
            System.out.println("Can't go swimming on a weekday, Bummer");
        }
        //----------------------------------------------
        System.out.println(line);
        if (isHotOutside && hasMoneyInPocket && !isWeekday) {

            System.out.println(isAGoodDay);
        }else {
            System.out.println("I wish it was the weekend");
        }
        //----------------------------------------------------------------
        System.out.println(line);
        if (isHotOutside && thirstLevel >= 3 && moneyInWallet >= (costOfMilk * 2)) {
            System.out.println(willBuyMilk);
        }else {
            System.out.println("Can't get a break");
        }
        System.out.println(line);





    }
}