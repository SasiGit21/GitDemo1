package StepDefination;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJunit {
	 @Test
	   public void testSetup() {
	      String str= "I am done with Junit setup";
	      assertEquals("I am done with Junit setup",str);
	      System.out.println("postJira1");
	      System.out.println("postJira2");
	      System.out.println("postJira3");
	      System.out.println("postJira4");
	   }
	}

