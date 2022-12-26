package com.neo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeoStox {
  @Test
  public void launchingNeo() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
  }
}
