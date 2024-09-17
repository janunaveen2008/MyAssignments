package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver pathfinder=new ChromeDriver();
		pathfinder.get("http://leaftaps.com/opentaps/control/main");
		pathfinder.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		pathfinder.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		pathfinder.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		pathfinder.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		
		
		
		
		
				
				
				


		
		
		
		
		
		
		
		
		

	}

}
