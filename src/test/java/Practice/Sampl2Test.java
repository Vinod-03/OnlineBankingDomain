package Practice;

import org.testng.annotations.Test;

public class Sampl2Test {

	
	@Test(groups = "smoke")
	public void test1()
	{
		System.out.println("craeted sucesfully");
	}
	@Test(groups = "regression")
	public void test2()
	{
		System.out.println("modified sucesfully668");
	}
	

	
}
