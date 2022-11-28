package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {

	
	@Test(groups="one")
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  ChromeDriver ob= new ChromeDriver();
		  ob.get("http://www.google.com");
		  System.out.println(ob.getTitle());
		  ob.quit();
	}
}


// file=> new => project=> maven=> maven project=> create a simple=> groupid, artifactid=> finish
// right click on project=> package=> class=> test case 
//  mvnrepository.com 
//  selenium hq server standalone => selenium java=> 3.141.59 => copy the code
