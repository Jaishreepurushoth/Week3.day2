package week3.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListPhones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//list creation printing phone price 
		
		List<WebElement>  allphonePrice = driver.findElements(By.className("a-price-whole"));
		
		List<Integer> phonePrices = new ArrayList<Integer>();
		
		for (int i=0 ; i < allphonePrice.size() ; i++) {
			
			System.out.println(allphonePrice.get(i).getText());
			//string priceStr = allphonePrice.get(i).getText().replace
			
		}
		
			
		
		
	}

}
