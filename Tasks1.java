import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Tasks1 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void smallestNumberTest() {
		
	Metodai metodai = new Metodai();
	ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,6,7,4,7,9,4,1));
	Integer smallestNumber = metodai.smallestNumber(numbers);
	assertEquals(smallestNumber, 1);
	}
	
	@Test 
	void getAverageTest() {
	Metodai metodai = new Metodai();
	ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(23,31,24));
	Double average = metodai.getAverage(numbers);
	assertEquals(45.00, average);
		
	}

}
