import java.util.ArrayList;
import java.util.Scanner;

public class Metodai {

	//First task
	public Integer smallestNumber(ArrayList<Integer> numbers) {
		
		Integer smallestNumber = numbers.get(0);
		
		for(Integer number : numbers) {
			if(number < smallestNumber) {
				smallestNumber = number;
			}
		}
		return smallestNumber;
		
	}
	//Second task
	public Double getAverage(ArrayList<Integer> numbers) {
		
		Double sum = 0.0;
		for(int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		return sum / numbers.size();
		
	}
	//Third task
	
	public String middleChar(String str) {
		
		{
	        int position;
	        int length;
	        if (str.length() % 2 == 0)
	        {
	            position = str.length() / 2 - 1;
	            length = 2;
	        }
	        else
	        {
	            position = str.length() / 2;
	            length = 1;
	        }
	        return str.substring(position, position + length);
		}
	    }
		//Fourth task
	public Integer findVowels (String str) {
		
		Integer sum = 0;
		
		String wordLowerCase = str.toLowerCase();
		
		for (int i = 0; i < wordLowerCase.length(); i++) {
			// Check a character is vowel or not
			if (wordLowerCase.charAt(i) == 'a' || wordLowerCase.charAt(i) == 'e' || wordLowerCase.charAt(i) == 'i' || wordLowerCase.charAt(i) == 'o'
					|| wordLowerCase.charAt(i) == 'u') {
				sum++;
	}
		

}
		return sum;
}
}
