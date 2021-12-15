package test;
import org.junit.Assert;
import org.junit.Test;

import application.ControlChars;

public class ApplicationTest {
	@Test
	public void shouldReturnAnInstanceOfControlChars() {
		ControlChars testClass = new ControlChars();
		Assert.assertNotNull(testClass);
	}
	
	/* Criteria:
	 * Display the following, including the tabbed spaces.
	 * Attempt to differentiate the integer and string values.
	 * 
	 * 		Select an option:
	 * 			1. Add an entry
	 * 			2. View the database
	 * 			3. Exit
	 */
	
	@Test
	public void shouldOutputTextWithTabbedSpaces() {
		ControlChars testClassText = new ControlChars();
		String firstLine = "Peter Pan";
		//String expectedOutput = "\tPeter Pan";
		//Assert.assertEquals(testClassText.printWithTabs(firstLine), expectedOutput);
		String secondLine = "Mickey Mouse";
		//Assert.assertEquals(expectedOutput, testClassText.printWithTabs(firstLine, secondLine));
		String thirdLine = "Bugs Bunny";
		String fourthLine = "Daffy Duck";
		//String secondLineNumber = "1. ";
		//String thirdLineNumber = "2. ";
		//String fourthLineNumber = "3. ";
		String expectedOutput = "\tPeter Pan\n\t\t1. Mickey Mouse\n\t\t2. Bugs Bunny\n\t\t3. Daffy Duck";
		Assert.assertEquals(expectedOutput, testClassText.printWithTabs(firstLine, secondLine, thirdLine, fourthLine));
	}
}
