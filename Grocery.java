import java.util.ArrayList;
import java.util.Scanner;

public class Grocery {

	 ArrayList<String> theGrocery = new ArrayList<>();

	public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Tosin Grocery Store");

       while(true){

            System.out.println("1. To Add Item");

            System.out.println("2. To Remove Item");

            System.out.println("3. To Show All Items");

            System.out.println("4. To Exit");

            System.out.println("Enter from options (1-4): ");

            int theUserPick = input.nextInt();

            input.nextLine();

            if (theUserPick == 1) {

                System.out.println("Enter an item to add: ");

                String theItem = input.nextLine();

                toAddItem(theItem);

} 
	else if (theUserPick == 2) {

	System.out.println("Enter an item to remove: ");

	String theItem = input.nextLine();

                toRemoveItem(theItem);

} 
	else if (theUserPick == 3) {

                toShowItems();
}
	else if (theUserPick == 4) {

	System.out.println("GOOD BYE");

                break;
} 
	else {
	
	System.out.println("Invalid input. Please choose between 1 and 4.");
}
}

}

	public static void toAddItem(String theItem) {

        theGrocery.add(theItem);

        System.out.println(theItem + " has been added Successfully.");
}

	public static void toRemoveItem(String theItem) {

	if (theGrocery.remove(theItem)) {

	System.out.println(theItem + " has been removed from the list.");

} 
	else {

	System.out.println(theItem + " was not found in the list.");

}
}

	public static void toShowItems() {

        if (theGrocery.isEmpty()) {

	System.out.println("The Grocery is empty.");

} 
	else {

	System.out.println("The Grocery list:");
         
	for (int theList = 0; theList < theGrocery.size(); theList++){

	System.out.println(theList);
}
}
}
}