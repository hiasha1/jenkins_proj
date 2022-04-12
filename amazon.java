package proj_3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pshar\\selenium1\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    //search
	    driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys(" pencil eraser");
	    driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
	    
	    //add to cart
	    driver.findElement(By.xpath("//span[contains( text(),\"Sooez 120 Pack Pencil Erasers, Pencil Top Erasers Cap Erasers Eraser Tops Pencil Eraser Toppers Eraser Studying Supplies for Teachers Eraser Pencil Erasers, 7 Colors\")]")).click();
	    driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
	    
	    //proceed to checkout
	    driver.findElement(By.xpath("//input[@data-feature-id=\"proceed-to-checkout-action\"]")).click();
	    
	    //sign-in
	    driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("hiashi.sharma@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("Arjun2005");
        driver.findElement(By.xpath("//span[@id=\"auth-signin-button\"]")).click();
        
        
        driver.findElement(By.xpath("//input[@id=\"address-ui-widgets-enterAddressPhoneNumber\"]")).sendKeys("9043336805");
        driver.findElement(By.xpath("//input[@id=\"address-ui-widgets-enterAddressLine1\"]")).sendKeys("1733 belay way");
        driver.findElement(By.xpath("//input[@id=\"address-ui-widgets-enterAddressCity\"]")).sendKeys("Louisville");
        driver.findElement(By.xpath("//label[@for=\"address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId\"]//following::span[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Kentucky')]")).click();
        driver.findElement(By.xpath("//input[@class=\"a-button-input\"]")).click();
	}

}
