package com.appium.oneplus5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;

public class Ecom_Flow {

	public static AndroidDriver driver;
//	public static MobileDriver driver1;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("Android-version","1.22.3");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","9");
		cap.setCapability("udid","95de745c");
		cap.setCapability("deviceName","OnePlus 5");
		cap.setCapability("appPackage","com.cricketronics.sportsal");
		cap.setCapability("appActivity","com.cricketronics.sportsal.ui.onboarding.CommonOnboardActivity");
		
//		URL url =new URL("http://0.0.0.0:4723/wd/hub/");
//		driver = new AndroidDriver(url,cap);

		URL url =new  URL("http://0.0.0.0:4723/wd/hub/");
		driver = new AndroidDriver(url,cap);
		
		
		WebElement Login = driver.findElement(By.id("com.cricketronics.sportsal:id/button_get_started"));
		Login.click();
		
		WebElement mobile_Number = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_mobile_number"));
		mobile_Number.sendKeys("9003180496");
		
		WebElement Pin = driver.findElement(By.id("com.cricketronics.sportsal:id/button_login_with_pin"));
		Pin.click();
		Thread.sleep(3000);
		
		WebElement forgot_Pin = driver.findElement(By.id("com.cricketronics.sportsal:id/text_forgot_pin"));
		forgot_Pin.click();
		Thread.sleep(3000);
		
		WebElement resend_One = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_otp_one"));
		resend_One.sendKeys("1");
		
		WebElement resend_Two = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_otp_two"));
		resend_Two.sendKeys("2");
		
		WebElement resend_Three = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_otp_three"));
		resend_Three.sendKeys("3");
		
		WebElement resend_Four = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_otp_four"));
		resend_Four.sendKeys("4");
		
		
		
		
		WebElement new_One = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_pin_one"));
		new_One.sendKeys("1");
		
		WebElement new_Two = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_pin_two"));
		new_Two.sendKeys("2");
		
		WebElement new_Three = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_pin_three"));
		new_Three.sendKeys("3");
		
		WebElement new_Four = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_pin_four"));
		new_Four.sendKeys("4");
		
		
		WebElement update_Pin = driver.findElement(By.id("com.cricketronics.sportsal:id/button_update_pin"));
		update_Pin.click();
		Thread.sleep(3000);
		
		
		WebElement exist_One = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_pin_one"));
		exist_One.sendKeys("1");
		
		WebElement exist_Two = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_pin_two"));
		exist_Two.sendKeys("2");
		
		WebElement exist_Three = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_pin_three"));
		exist_Three.sendKeys("3");
		
		WebElement exist_Four = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_pin_four"));
		exist_Four.sendKeys("4");
		
		WebElement next_Pin = driver.findElement(By.id("com.cricketronics.sportsal:id/button_next_pin"));
		next_Pin.click();Thread.sleep(3000);
		
		WebElement my_Order = driver.findElement(By.id("com.cricketronics.sportsal:id/myOrdersImageView"));
		
		
		
//		WebElement my_Order = driver.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView"));
		my_Order.click();Thread.sleep(3000);
		
//		driver.findElement(By.AndroidUIAutomator("new UiScrollable(new UiSelector().Scroable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"webview").instance(0))").click();
		
		WebElement my_Order_Back = driver.findElement(By.className("android.widget.ImageButton"));
		my_Order_Back.click();
		Thread.sleep(5000);
		
		WebElement balls= driver.findElement(By.id("com.cricketronics.sportsal:id/category2ImageView"));
		balls.click();
		Thread.sleep(3000);
		
		WebElement heavy_Ball = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ImageView"));
		heavy_Ball.click();
		Thread.sleep(3000);
		
		WebElement wishlist_Rubber_Ball = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/androidx.cardview.widget.CardView[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView"));
		wishlist_Rubber_Ball.click();Thread.sleep(3000);
		
		
		WebElement ruber_Ball = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/androidx.cardview.widget.CardView[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
		ruber_Ball.click();Thread.sleep(3000);
		
		WebElement quantity_Rubber_Ball = driver.findElement(By.id("com.cricketronics.sportsal:id/quantitySpinnerLayout"));
		quantity_Rubber_Ball.click();
		
		WebElement quantity_Seven = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.NumberPicker/android.widget.Button"));
		quantity_Seven.click();
		
		WebElement quantity_Done = driver.findElement(By.id("com.cricketronics.sportsal:id/updateQuantityButton"));
		quantity_Done.click();Thread.sleep(3000);
		
		WebElement buy_Now = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button[2]"));
		buy_Now.click();Thread.sleep(3000);
			
		WebElement cart_Quantity = driver.findElement(By.id("com.cricketronics.sportsal:id/quantitySpinnerLayout"));
		cart_Quantity.click();
		
		WebElement outside_Touch = driver.findElement(By.id("com.cricketronics.sportsal:id/touch_outside"));
		outside_Touch.click();
		
		WebElement checkout_Button = driver.findElement(By.id("com.cricketronics.sportsal:id/checkoutButton"));
		checkout_Button.click();Thread.sleep(3000);
		
		WebElement address_Continue = driver.findElement(By.id("com.cricketronics.sportsal:id/button_continue"));
		address_Continue.click();
		Thread.sleep(5000);
		
		WebElement order_Continue = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button"));
		order_Continue.click();
		
		driver.quit();
		
		System.out.println("success");
		
		
		
		
		
		
		
		
//		driver.findElement(By.className("_highlighter-box_619e8")).click();
		
		System.out.println("Executed Successfully");
//		driver.findElement(AppiumBy.And)
		
	}
}
