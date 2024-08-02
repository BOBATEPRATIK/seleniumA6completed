package BaseTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass1;
import com.crm.Pom.VtigerLogin;

@Listeners(com.crm.Listeners.Listener.class)
public class VtigerLoginProcess extends BaseClass1{

	@Test

	public void login()
	{
		
		
     //   VtigerLogin logins=new VtigerLogin(driver);
//		logins.getUsername("admin");
//		logins.getPassword("root");
//		logins.getLogin();
	    
	}
}
