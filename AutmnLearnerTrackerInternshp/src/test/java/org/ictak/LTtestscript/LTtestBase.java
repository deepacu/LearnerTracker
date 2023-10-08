package org.ictak.LTtestscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class LTtestBase {

	 
	 		 
		WebDriver driver;
		 @BeforeTest
		public void setUP()
		{
			 driver=new ChromeDriver();
			driver.get("https://learnertracker.netlify.app/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					
			
		}
}
