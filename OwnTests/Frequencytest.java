package OwnTests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import TestProgram.Frequency;

class Frequencytest {

	private static Frequency fact;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		fact = new Frequency();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		fact= null;

	}

	@SuppressWarnings("static-access")
	@Test
	void testMain() throws FileNotFoundException {
	assertEquals("{sleep=1, a=2, home.=1, like=1, have=1, i=3, man=1, to=1, am=1, ,=2}",fact.main(null));
	}


}
