package pack1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c2 {

	@Test(groups="one")
	public void t2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  ChromeDriver ob= new ChromeDriver();
		  ob.get("https://courses.letskodeit.com/practice");
		  
		
		  
		  
		  //method2
		  // collect all the radio buttons and storing it in a list
		  // iterate through it
		  // click 
		  
		  // xpath=> //*[@loc/attribute='value' and @loc/attribute='value']
		  
		  List<WebElement> l = ob.findElementsByXPath("//*[@name='cars' and @type='radio']");
		  
		  // iterate :   for(datatype tempvariable: nameofthecollection)
		  
		  for(WebElement x:l)
		  {
			  x.click();
			  Thread.sleep(2000);
		  }
		  
		  Thread.sleep(3000);
		  ob.quit();
	}
}
