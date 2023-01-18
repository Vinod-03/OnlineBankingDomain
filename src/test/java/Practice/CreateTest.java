package Practice;

import org.testng.annotations.Test;

public class CreateTest {

	@Test(groups = "smoke")
	public void create()
	{
		System.out.println("craeted sucesfully 3");
	}
	@Test(groups = "regression")
	public void modify()
	{
		System.out.println("modified sucesfully669");
	}
	
}
