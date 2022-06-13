package StepDefination;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRun {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestJunit.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println("Result=="+result.wasSuccessful());
	      System.out.println("This is also another change");
	      
	   }
	public void test ()
	{
		System.out.println("Simple test method");
	}

}
