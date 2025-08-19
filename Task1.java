public class Task1{

	public static int twiceAsOld(int theFatherAge, int theSonAge) {

	int twiceOfSon = theSonAge * 2;

	int theirAge = theFatherAge - twiceOfSon;

        return theirAge;
}

	public static void main(String...args){

	int fatherAge = 50;

	int sonAge = 10;

	int theDifference = twiceAsOld(fatherAge,sonAge);

	System.out.println(theDifference);
	
	
}
}