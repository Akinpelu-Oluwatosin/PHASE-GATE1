import java.util.Scanner;

	public class Task1{
	public static void main(String...args){

	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number");
	int firstNumber = input.nextInt();
	
	System.out.println("Enter another number");
	int secondNumber = input.nextInt();

	int squareFirst = firstNumber * firstNumber;
	int squareSecond = secondNumber * secondNumber;

	System.out.println("The Square of the first number is  " +  squareFirst);
	System.out.println("The Square of the second number is  " +  squareSecond);

	int sumOfSquared = squareFirst + squareSecond;
	
	System.out.println("The Sum of their Square is  " +  sumOfSquared);
	
	int subOfSquared = squareFirst - squareSecond;
	System.out.println("squareFirst - squareSecond  " +  subOfSquared);
	






}
}




	