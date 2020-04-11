public class Loops {

    public static void main(String[] args) {
 /*A.
        int i = 0;
        while (i < 100){
            System.out.println(i += 2);
        }



   //B.
        int i = 100;
        while (i > 0){
            System.out.println(i -= 3);
        }


   C.
        for (int i = 1; i <= 100; i++){

            System.out.println(i);
        }
*/
        //D.


        for (int i = 0; i <= 100; i += 1) {

            if ((i % 3) == 0) {
                System.out.println("Hello");
            } else if ((i % 5) == 0) {
                System.out.println("World");
            } else if ((i % 3) == 0 && (i % 5) == 0) {
                System.out.println("Hello World");

            } else {
                System.out.println(i);
            }


        }

    }
}