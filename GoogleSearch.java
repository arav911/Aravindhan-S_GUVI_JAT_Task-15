package task_15_guvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
//		set the path to the location of chromedriver executable
		System.setProperty("webdriver.chrome.driver", "path\\to\\chromedriver.exe");
		
//		create an instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
//		Maximize the Window
		driver.manage().window().maximize();
		
//		Launch the chrome browser and redirect to it to the specified URL
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium Browser Driver");
		
		driver.findElement(By.name("btnK")).click();

	}

}
