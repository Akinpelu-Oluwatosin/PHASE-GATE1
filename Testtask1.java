import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferenceTest{

@Test
public void testsubract(){



		int fatherAge = 50;
		int sonAge = 10;


		Difference difference = new Difference();
		int result = difference.subract(fatherAge, sonAge);


		assertEquals(result, 40);



}

@Test
public void testnegativeNumber(){

}

		int fatherAge = -50;
		int sonAge = 10;


		Difference difference = new Difference();
		int result = difference.subract(fatherAge, sonAge);


		assertEquals(result, 0);



}
public void testmultiplyTwoNegativeNumbers(){



		int fatherAge = -50;

		int sonAge = 10;



		Calculator calculator = new Calculator();
		int result = calculator.division(firstNumber, secondNumber);


		assertEquals(result, 0);


}

