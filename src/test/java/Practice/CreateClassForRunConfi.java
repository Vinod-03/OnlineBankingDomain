package Practice;

import org.testng.annotations.Test;

public class CreateClassForRunConfi {

	@Test
	
	public void create()
	{
		       String url = System.getProperty("url");
		       String user = System.getProperty("user");
		       String password = System.getProperty("password");
		       String browser = System.getProperty("browser");
		
		        System.out.println(url);
		        System.out.println(user);
		        System.out.println(password);
		        System.out.println(browser);
		
		
	}
	
}
