package application;

public class ControlChars {

	public static void main(String[] args) {
		String text = "To be or not to be.  That is the question.";
		
		System.out.println(text);
		
		//control characters alter the display of the text
		
		// \n is a new line
		
		String text2 = "To be or not to be.\nThat is the question.";
		System.out.println(text2);
		
		// \t is tab
		
		String text3 = "\tTo be or not to be.\nThat is the question.";
		System.out.println(text3);
		
		//can combine control characters
		//ex. \n\t
		
		String text4 = "\tTo be or not to be.\n\tThat is the question.";
		System.out.println(text4);
		
		/* \ starts a control character.
		 * To add an actual \ as text, you have to use \\
		 */

		String text5 = "\\To be or not to be.\n\\That is the question.";
		System.out.println(text5);
		
		String firstLine = "Select an option:";
		String secondLine = "Add an entry";
		String thirdLine = "View the database";
		String fourthLine = "Exit";
		int firstNumber = 1;
		int secondNumber = 2;
		int thirdNumber = 3;
		//System.out.println("\t" + firstLine + "\n\t\t" + firstNumber + ". " + secondLine + "\n\t\t" + secondNumber + ". " + thirdLine + "\n\t\t" + thirdNumber + ". " + fourthLine);
		String menu = "\t" + firstLine;
		menu += "\n\t\t" + firstNumber + ". " + secondLine;
		menu += "\n\t\t" + secondNumber + ". " + thirdLine;
		menu += "\n\t\t" + thirdNumber + ". " + fourthLine;
		System.out.println(menu);
	}
	
	public String printWithTabs(String input, String secondInput, String thirdInput, String fourthInput) {
		return "\t" + input + "\n\t\t1. " + secondInput + "\n\t\t2. " + thirdInput + "\n\t\t3. " + fourthInput;
	}
	
	

}
