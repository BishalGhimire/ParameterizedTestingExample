package assignmentTDD;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class DivisibleTest {
	Junit test = new Junit();
	
	
	@ParameterizedTest
	@CsvSource({ 
		"6, true", 
		"5, false", 
		"-1, false",
		"-256, false",
		"1296, true",
		"-12, true", 
		"0, true", 
		"10, false"})
	void divisibilityTest(int number, boolean result) {
		
		assertEquals(test.divisible(number), result);
	}
    
}


