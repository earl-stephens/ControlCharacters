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
	}

}
