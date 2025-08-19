public class Task4{

    public static boolean getReachPump(int distance, int mpg, int gallons) {

        int mainDistance = mpg * gallons;

        if (mainDistance >= distance) {

            return true;

        } else {

            return false;

        }
    }

    public static void main(String...args) {

        System.out.println(getReachPump(50, 25, 2));

    }

} 
