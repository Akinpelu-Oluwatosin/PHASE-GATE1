import java.util.Scanner;
	public class Task4{
	public static void main(String...args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number");
	int TheNumber = input.nextInt();

	if(TheNumber > 0){
	System.out.println(TheNumber  + "  is a Positive number");
}
	else
	System.out.println(TheNumber  + "  is  a Negative number");

	}
}