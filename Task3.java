import java.util.Scanner;
	public class Task3{
	public static void main(String...args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number");
	int TheNumber = input.nextInt();

	if(TheNumber % 3 == 0){
	System.out.println(TheNumber  + "  is a multiple of 3");
}
	else
	System.out.println(TheNumber  + "  is not a multiple of 3");

	}
}