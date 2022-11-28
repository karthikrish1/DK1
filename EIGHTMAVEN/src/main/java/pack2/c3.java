package pack2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c3 {
	
	@Test(groups="two")
	public void t3() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  ChromeDriver ob= new ChromeDriver();
		  ob.get("https://jqueryui.com/droppable/");
		  //step1: taking screenshot and storing it in a file
		  // Fileutils => apache directory studio common io
		  //step2: adding jar 
		  //step3: copy, paste
		  
		File f = ob.getScreenshotAs(OutputType.FILE);
		 
		FileUtils.copyFile(f, new File("C:\\Users\\hp\\eclipse-workspace\\EIGHTMAVEN\\screenshots\\b.png"));
		  ob.switchTo().frame(0);
		  Actions ac= new Actions(ob);
		  
		 WebElement ele1 = ob.findElementById("draggable");
		 
		 WebElement ele2 = ob.findElementById("droppable");
		 
		 ac.dragAndDrop(ele1, ele2).build().perform();
		 
		 File f1 = ob.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(f1, new File("C:\\Users\\hp\\eclipse-workspace\\EIGHTMAVEN\\screenshots\\a.png"));
		 
		 Thread.sleep(3000);
		 ob.quit();
	}

}
