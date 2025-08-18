public class Task18{
	public static void main(String...args){

for(int number = 1; number < 100){

if(number % 3 == 0){
System.out.println("FIZZ");
}

else if(number % 5 == 0){
System.out.println("Buzz");
}

else if(number % 5 == 0 && number % 3 == 0){
System.out.println("FIZZBuzz");
}
}
}


