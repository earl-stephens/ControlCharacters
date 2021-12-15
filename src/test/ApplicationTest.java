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
}
