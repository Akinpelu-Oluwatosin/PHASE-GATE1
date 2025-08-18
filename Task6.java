public class Task6{
	public static void main(String...args){
	
	int[] theArray = {1, 2, 3};
	

	int largest = theArray[1];
	
	if(theArray[0] > theArray[1]){

	largest = theArray[0];
}
	else if(theArray[2] > theArray[1]){

	largest = theArray[2];
}
	System.out.println("The Largest is  "  + largest);
}
}