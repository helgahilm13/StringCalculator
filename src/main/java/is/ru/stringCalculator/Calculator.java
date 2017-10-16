package is.ru.stringCalculator;


public class Calculator {
	
	public static int add(String text) {
		String[] numbers =  text.split(",|\n");

		if(text.equals(""))
			return 0;
		else{

			return sum(numbers);

		}
	}

	private static int toInt(String number){

		return Integer.parseInt(number);
	}
	
	private static int sum(String [] numbers){

		int total = 0;
		int [] negNumbers = new int[0];

		for(String number : numbers){
			int numberInt = Integer.parseInt(number.trim());
			/*if (numberInt < 0) {
              negNumbers[numberInt];
              
          	}*/
			if(numberInt <= 1000) {
				total += numberInt;
			}
		}

		/*if (isNegative == true) {
          throw new RuntimeException("Negatives not allowed: " + );
        }*/

		return total;
	}
}
