package ibot_Demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Before_Login_Screen {
	
	public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {

		try {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Augray\\eclipse-workspace\\Demo_Project\\chrome\\chromedriver.exe");
			driver =new ChromeDriver();
//			WebdDriver driver =new ChromeDriver();
			driver.get("https://bodhi.augray.com:4001/");
			driver.manage().window().maximize();
			
		} catch (Exception e) {
			System.out.println("Unable to launch");
		}
		
		

		WebElement Logo = driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img"));
		Logo.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Meet ibot')]")).click();

		driver.findElement(By.xpath("//button[@class='close']//child::img")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Experts']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@class='close pointer']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'My Journal')]")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@class='close pointer']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@class='close pointer']")).click();


		driver.findElement(By.xpath("//a[text()='Community']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(3000);

		driver.navigate().back();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		WebElement link = driver.findElement(By.className("aur-world"));
		link.click();
		//		driver.findElement(By.xpath("(//div[@class='aur-world']//child::i)[1]")).click();

		String windowHandle = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> it = s1.iterator();
		while(it.hasNext()) {

			String child= it.next();
			if(windowHandle.equalsIgnoreCase(child)) {

				driver.switchTo().window(child);

				System.out.println("parent window pop title "+ "  "+ ":"+" "+driver.getTitle());

				driver.findElement(By.xpath("//i[@class='bi bi-twitter']")).click();
				
				
					

			}
		}

		







		System.out.println("sucess");



	}

}
