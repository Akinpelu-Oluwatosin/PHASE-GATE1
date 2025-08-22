import java.util.Scanner;

public class carPack {

	static int[] carSlots = new int[20];

	public static void main(String... args) {

	Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("1: TO PARK YOUR CAR");

            System.out.println("2: TO REMOVE YOUR CAR");

            System.out.println("3: TO DISPLAY ALL SPACES");

            System.out.println("4: TO EXIT");

            System.out.print("SELECT AN OPTION: ");

            int option = input.nextInt();

            if (option == 1) {

	parkCar();

}
	
	else if (option == 2) {

	System.out.print("Enter a slot to remove car from : ");
   
	int thePosition = input.nextInt();

	removeCar(thePosition); 

}
	else if (option == 3) {
	
	showStatus();

}
 
	else if (option == 4) {

	System.out.println("GOODBYE");

	break;
}
	else {

	System.out.println("Invalid option, try again.");

}

}

 
}

	public static void parkCar() {
	
	for (int position = 0; position < carSlots.length; position++) {

	if (carSlots[position] == 0) {

	carSlots[position] = 1;

	System.out.println("Tosin parked Lexus at slot " + position);
               
	return;
}

}

	System.out.println("CAR SLOTS ARE FULL");
 
}

	public static void removeCar(int thePosition) {

	if (thePosition >= 0 && thePosition < carSlots.length) {

	if (carSlots[thePosition] == 1) {

	carSlots[thePosition] = 0;

	System.out.println("Car removed from slot " + thePosition);

} 

	else {

	System.out.println("POSITION" + thePosition + " IS EMPTY.");

}

} 
	else {

	System.out.println("INVALID INPUT.");
}

}

	public static void showStatus() {

	System.out.println("THE CARS IN THE LOT ARE:");

	for (int theSlot = 0; theSlot < carSlots.length; theSlot++) { 

	System.out.println(theSlot);
}

    }
}