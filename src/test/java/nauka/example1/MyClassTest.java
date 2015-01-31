package nauka.example1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyClassTest {
	
	@Test
	public void testIfAddingWorksForSmallNumber(){
		//given
		nauka.example1.MyClass myClass = new nauka.example1.MyClass();
		
		//when
		int result = myClass.add(1,2);
		
		//then
		Assert.assertEquals(3, result);
	}
	
	@Test
	public void testIfAddingWorksForLargeNumber(){
		//given
		nauka.example1.MyClass myClass = new nauka.example1.MyClass();
		
		//when
		int result = myClass.add(11,2);
		
		//then
		Assert.assertEquals(20, result);
	}
	
	@Test
	public void testIfAddigKrowaToString(){
		//given
		nauka.example1.MyClass myClass = new nauka.example1.MyClass("Kiljanski");
		
		//when
		String result = myClass.addKrowaToString("Jacek");
		
		//then
		Assert.assertEquals("Kiljanski:Jacek", result);
	}
	@Test
	public void testIfAddigPrefixToString(){
		//given
		nauka.example1.MyClass myClass = new nauka.example1.MyClass();
		
		//when
		String result = myClass.addKrowaToString("Jacek");
		
		//then
		Assert.assertEquals("unknown:Jacek", result);
	}
	
}
