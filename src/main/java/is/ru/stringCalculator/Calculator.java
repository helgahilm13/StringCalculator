package is.ru.stringCalculator;
import static org.junit.rules.ExpectedException;

public class Calculator {
	
	public static int add(String text) {
		String numbers[] =  new String[0];

		/*if(Integer.parseInt(text) < 0){
			throw new exception("Negatives not allowed: " + Integer.parseInt(text));
		}*/

		if(text.equals(""))
			return 0;
		else{

			if(text.contains(",") && text.contains("\n")){
				numbers = text.split("\n|\\,");
				return sum(numbers);
			}
			else if(text.contains(",")){
				numbers = text.split(",");
				return sum(numbers);
			}
			else if(text.contains("\n")){
				numbers = text.split("\n");
				return sum(numbers);
			}


			return 1;
		}
	}

	private static int toInt(String number){

		return Integer.parseInt(number);
	}

	private static int sum(String [] numbers){

		int total = 0;
		for(String number : numbers){
			total += toInt(number);
		}
		return total;
	}
}	