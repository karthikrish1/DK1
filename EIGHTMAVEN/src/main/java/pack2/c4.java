package pack2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c4 {
	
	@Test(groups="two")
	public void t4() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  ChromeDriver ob= new ChromeDriver();
		  ob.get("http://www.mycontactform.com");

		  //control+a => selection
		  //control+c=> copy
		  //control+v=> pasting
		  //tab key => move to the next element
		  
		 WebElement ele = ob.findElementById("user");
		 Actions ac= new Actions(ob);
		 ac.click(ele).sendKeys("hi").build().perform();
		 
		 //Control+a
		 ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		 
		//Control+c
	    ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	    
	    //tab
	    ac.sendKeys(Keys.TAB).build().perform();
	    

		//Control+v
	    ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	    
	    Thread.sleep(2000);
	    
	    ob.quit();
	}

}
