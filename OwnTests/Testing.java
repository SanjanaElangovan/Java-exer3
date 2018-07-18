package OwnTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import TestProgram.Factorial;
import TestProgram.Frequency;
import TestProgram.MemberVariable;
import TestProgram.NewClass;
import TestProgram.Student;
import TestProgram.TestClass;

//import com.sun.org.apache.xalan.internal.lib.Extensions;

public class Testing {
	private static NewClass cl;
	private static TestClass testclass;
	private static Student student;
	private static MemberVariable mem;
	private static Factorial fact;
	private static Frequency fq;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		testclass = new TestClass();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		testclass= null;

	}
	@SuppressWarnings("deprecation")
	
	
	


	@Test
	public void testReverse(){
		
		assertEquals(121, testclass.reverse(121));

	}
	
	@Test
	public void testprint() {
		assertEquals(true,testclass.isPowerOfFour(64));
	}
	@Test
	public void testTestin() {
		String conv="HI HELLO";
		assertEquals( conv, testclass.convertUpper("/home/sanjana/Desktop/file1.txt"));
		assertEquals("9.0", testclass.findLength("/home/sanjana/Desktop/file1.txt"));
	}
	
	
	
	@Test
	public void testEvenNum(){
		assertEquals(true,testclass.Even(8));
		assertEquals(false,testclass.Even(5));
	}
	
	
    @Test
    public void testDisplayExt() {
//    	String text1= "Hi hello";
    	assertEquals("Hi hello",cl.Sanjana("/home/sanjana/Desktop/"));
    }
	  @Test
		public void testStudent() {
			String[] expect={"81.5","65","98"};
			int[] array={86,65,98,77};
			String[] actual=student.findAvgMinMax(4,array);
			assertArrayEquals(expect,actual);
			
		}
	  @Test 
      public void testDisplayMemberVariables() { 
          assertArrayEquals(new String[]{"Members name:Harry Potter","member salary:2500.3","member age:30"},mem.displayMemberVariables(new String[]{"Members name:","member salary:","member age:"}));
}
	  @Test
      public void testFact() {
          


          assertEquals("hdafadaidha", 479001600, fact.printIntFactorials(1, 1));
          assertEquals("hdafadaidha",2432902008176640000L, fact.printLongFactorials(1, 1));
      }
	
	  
}

