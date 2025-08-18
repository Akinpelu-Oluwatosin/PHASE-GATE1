import java.util.Scanner;
	
	public class Task2{
	public static void main(String...args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a Digits");
	int firstNumber = input.nextInt();

	System.out.println("Enter the Second Digits");
	int secondNumber = input.nextInt();

	System.out.println("Enter last Digits");
	int lastNumber = input.nextInt();
	
	int theirSum = firstNumber + secondNumber + lastNumber;
	System.out.println("Their Sum Is  " +  theirSum);

	int theirAverage = theirSum / 2;
	System.out.println("The Average is  "  +  theirAverage);

	
	int theirProduct = firstNumber * secondNumber * lastNumber;
	System.out.println("The Product is  "  +  theirProduct);
	
	int largest = secondNumber;

	if(lastNumber > secondNumber){
	 largest = lastNumber;
	}
	else if(firstNumber > secondNumber){
	 largest = firstNumber;
	}

	System.out.println("The Largest is  "  + largest);
	
	int smallest = secondNumber;

	if(lastNumber < secondNumber){
	 smallest = lastNumber;
	}
	else if(firstNumber < secondNumber){
	 smallest = firstNumber;
	}

	System.out.println("The smallest is  "  + smallest);
	

}
}