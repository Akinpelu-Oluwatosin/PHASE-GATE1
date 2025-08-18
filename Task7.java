public class Task7{
	public static void main(String...args){
	
	int[] theArray = {1, 2, 3};
	

	int smallest = theArray[1];
	
	if(theArray[0] < theArray[1]){

	smallest = theArray[0];
}
	else if(theArray[2] < theArray[1]){

	smallest = theArray[2];
}
	System.out.println("The smallest is  "  + smallest);
}
}