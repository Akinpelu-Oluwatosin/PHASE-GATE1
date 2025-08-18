public class Task13{
	public static void main(String...args){
	
	int[] theArray = {1, 2, 3};
	

	int largest = theArray[1];
	
	if(theArray[0] > theArray[1] && theArray[0] < theArray[2]){

	int secondLargest = theArray[0];
}
	else if(theArray[2] > theArray[1] && theArray[2] < theArray[0]){

	secondLargest = theArray[2];
}
	System.out.println("The Second Largest is  "  + secondLargest);
}
}