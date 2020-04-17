/*
13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
 */
public class WillyNilly {
    public static void main(String[] args) {
        double[] workFor = new double[] {130000., 150000.,140000};
        System.out.println(workForWho(workFor[0], workFor[1], workFor[2]));
    }

    public static String workForWho(double Amazon, double Lockheed, double Vectrus) {
                double A = Amazon;
                double L = Lockheed;
                double V = Vectrus;
        if(A > L && A > V)
        {
            return "Work for Amazon";
        }
        else if(L > V)
        {
            return "Work for Lockheed";
        }
        else
        {
            return "Work for Vectrus";
        }

        }
    }

