
public class Task2 {

    public static void main(String...args) {
	

	int score1 = 100;

	int score2 = 30;

	int score3 = 40;
	

        int theSum = score1 + score2 + score3;

	double theAverage = theSum / 2.0;
	

       
        if (theAverage >= 90 && theAverage <= 100) {
        System.out.println("A");

        } else if (theAverage >= 80 && theAverage < 90) {
          System.out.println("B");

        }
	 else if (theAverage >= 70 && theAverage < 80) {
          System.out.println("C");

        }
	 else if (theAverage >= 60 && theAverage < 70) {
          System.out.println("D");

        }
	 else if (theAverage >= 0 && theAverage < 60) {
          System.out.println("YOU ARE A FAILURE");

        } 
	else {
         System.out.println("INVALID INPUT");
        }
    }
}