package com.appium.oneplus5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Sportsal_Home_Screen {
	
	public static AndroidDriver driver;
	
	
	public static void main(String[] args) throws MalformedURLException, Exception {
		
		DesiredCapabilities cap =new DesiredCapabilities();
//		cap.setCapability("Android-version","1.22.3");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","9");
		cap.setCapability("udid","95de745c");
		cap.setCapability("deviceName", "OnePlus 5");
//		cap.setCapability("deviceName", "OnePlus Nord CE 2 Lite 5G");
		cap.setCapability("appPackage","com.cricketronics.sportsal");
		cap.setCapability("appActivity","com.cricketronics.sportsal.ui.onboarding.CommonOnboardActivity");
		
		
		URL url =new URL("http://0.0.0.0:4723/wd/hub/");
		driver =new AndroidDriver(url,cap);
		
//		press the start button a
		
		WebElement Login = driver.findElement(By.id("com.cricketronics.sportsal:id/button_get_started"));
		Login.click();
		
		Thread.sleep(5000);
		
		WebElement number = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_mobile_number"));
		number.sendKeys("9003180496");
//		WebElement nine = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"));
//		WebElement zero = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"));
//		driver.findElement(By.xpath(null))
//		WebElement pin = driver.findElement(By.id("com.cricketronics.sportsal:id/button_login_with_pin"));
		
//		Thread.sleep(3000);
		
		WebElement otp = driver.findElement(By.id("com.cricketronics.sportsal:id/button_login_with_otp"));
		otp.click();
//		pin.click();
		System.out.println("success");
		Thread.sleep(5000);
		
		WebElement one = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_otp_one"));
		one.sendKeys("1");
		WebElement two = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_otp_two"));
		two.sendKeys("2");
		WebElement three = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_otp_three"));
		three.sendKeys("3");
		WebElement four = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_otp_four"));
		four.sendKeys("4");
		
		Thread.sleep(3000);
		
		WebElement next = driver.findElement(By.id("com.cricketronics.sportsal:id/button_next_otp"));
		next.click();
		Thread.sleep(7000);
		
		WebElement jersey = driver.findElement(By.id("com.cricketronics.sportsal:id/customizeImageView"));
		jersey.click();
		Thread.sleep(15000);
		
		WebElement newG = driver.findElement(By.id("com.cricketronics.sportsal:id/create_new_button"));
		newG.click();
		Thread.sleep(3000);
		
		WebElement create = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView"));
		create.click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.cricketronics.sportsal:id/generateButton")).click();
		Thread.sleep(5000);
		WebElement tshirt = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout/android.widget.ImageView"));
		tshirt.click();
		
		WebElement selectT = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout/android.widget.ImageView"));
		selectT.click();
		
		WebElement nextt = driver.findElement(By.id("com.cricketronics.sportsal:id/nextButton"));
		nextt.click();
		Thread.sleep(12000);
		
		WebElement collor_S = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout"));
		collor_S.click();
		Thread.sleep(3000);
		System.out.println("done");
				
		WebElement sleeve_T = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Sleeve Type\"]"));
		sleeve_T.click();
		Thread.sleep(3000);
		
		WebElement sleeve = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
		sleeve.click();
		Thread.sleep(5000);
		
		WebElement next_C = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button"));
		next_C.click();
		
		Thread.sleep(5000);
		
		WebElement j_Back = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
		j_Back.click();
		Thread.sleep(5000);
		
		WebElement next_j = driver.findElement(By.id("com.cricketronics.sportsal:id/nextButton"));
		next_j.click();
		Thread.sleep(3000);
//		
		WebElement j_Logo = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.widget.LinearLayout/android.widget.ImageView"));
		j_Logo.click();
		Thread.sleep(3000);
		
		WebElement next_L = driver.findElement(By.id("com.cricketronics.sportsal:id/nextButton"));
		next_L.click();
		Thread.sleep(3000);
		
		WebElement logo_L = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
		logo_L.click();
		Thread.sleep(3000);
		System.out.println("success");
		
		WebElement logo_P = driver.findElement(By.id("com.cricketronics.sportsal:id/nextButton"));
		logo_P.click();
		Thread.sleep(5000);
		
		WebElement preview = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button"));
		preview.click();
		Thread.sleep(5000);
		
		WebElement j_Name = driver.findElement(By.id("com.cricketronics.sportsal:id/name_edit_text"));
		j_Name.sendKeys("elango");
		
		WebElement j_number = driver.findElement(By.id("com.cricketronics.sportsal:id/number_edit_text"));
		j_number.sendKeys("777");
		
		WebElement proceed = driver.findElement(By.id("com.cricketronics.sportsal:id/button_proceed"));
		proceed.click();
		Thread.sleep(25000);
		
		WebElement panel_T = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Image[2]"));
		panel_T.click();
		
		WebElement preview_t = driver.findElement(By.id("com.cricketronics.sportsal:id/nextButton"));
		preview_t.click();
		
		WebElement jersey_Title = driver.findElement(By.id("com.cricketronics.sportsal:id/jersey_name_edit_text"));
		jersey_Title.sendKeys("Appium one");
		
		WebElement preview_SN = driver.findElement(By.id("com.cricketronics.sportsal:id/save_name_button"));
		preview_SN.click();
		Thread.sleep(5000);
		
		WebElement created_Jersery = driver.findElement(By.id("com.cricketronics.sportsal:id/logo_image"));
		created_Jersery.click();
		Thread.sleep(22000);
		
		WebElement preview_Screen= driver.findElement(By.id("com.cricketronics.sportsal:id/nextButton"));
		preview_Screen.click();
		
		WebElement quantity = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView"));
		quantity.click();
		
		WebElement quantity_Outside = driver.findElement(By.id("com.cricketronics.sportsal:id/touch_outside"));
		quantity_Outside.click();
		
		WebElement player_Name = driver.findElement(By.id("com.cricketronics.sportsal:id/player_name_text_input"));
		player_Name.sendKeys("elango");
		
		WebElement player_Number = driver.findElement(By.id("com.cricketronics.sportsal:id/player_number_edit_text_input"));
		player_Number.sendKeys("007");
		
		WebElement shirt_Size = driver.findElement(By.id("com.cricketronics.sportsal:id/player_size_edit_text_input"));
		shirt_Size.click();
		
		
		WebElement shirt_Sizen = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.NumberPicker/android.widget.Button"));
		shirt_Sizen.click();
		
		WebElement preview_Done = driver.findElement(By.id("com.cricketronics.sportsal:id/updateQuantityButton"));
		preview_Done.click();
		
		WebElement place_Order = driver.findElement(By.id("com.cricketronics.sportsal:id/nextButton"));
		place_Order.click();
		Thread.sleep(3000);
		
		WebElement add_Address = driver.findElement(By.id("com.cricketronics.sportsal:id/button_add_new_address"));
		add_Address.click();
		
		WebElement set_Location = driver.findElement(By.id("com.cricketronics.sportsal:id/button_set_location"));
		set_Location.click();
		Thread.sleep(3000);
		
		WebElement yes_Button = driver.findElement(By.id("android:id/button1"));
		yes_Button.click();
		Thread.sleep(3000);
		
		WebElement allow = driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
		allow.click();
		Thread.sleep(3000);
		
		WebElement confirm_Location = driver.findElement(By.id("com.cricketronics.sportsal:id/location_confirm_button"));
		confirm_Location.click();
		
		WebElement others = driver.findElement(By.id("com.cricketronics.sportsal:id/location_name_others"));
		others.click();
		
		WebElement location_Name = driver.findElement(By.id("com.cricketronics.sportsal:id/location_name"));
		location_Name.sendKeys("land mark");
		
		WebElement check_Box_Save = driver.findElement(By.id("com.cricketronics.sportsal:id/check_box_tick"));
		check_Box_Save.click();
		
		WebElement address_Name = driver.findElement(By.id("com.cricketronics.sportsal:id/button_next"));
		address_Name.click();
		Thread.sleep(3000);
		
		WebElement select_Address = driver.findElement(By.id("com.cricketronics.sportsal:id/check_box_tick"));
		select_Address.click();
		Thread.sleep(3000);
		
		WebElement continue_Address = driver.findElement(By.id("com.cricketronics.sportsal:id/button_continue"));
		continue_Address.click();
		Thread.sleep(3000);
		
//		need to write scroll here
		WebElement order_Continue = driver.findElement(By.id("com.cricketronics.sportsal:id/continueButton"));
		order_Continue.click();
		Thread.sleep(3000);
		
//		WebElement place_Order_Summary = driver.findElement(By.id("com.cricketronics.sportsal:id/checkoutButton"));
//		place_Order.click();
//		Thread.sleep(3000);
		
		
		WebElement back_Payment = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
		back_Payment.click();
		
		WebElement back_Order = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
		back_Order.click();
		Thread.sleep(3000);
		
		WebElement back_Address = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
		back_Address.click();
		
		driver.quit();
		
		
		
		
		
		System.out.println("success");
		
		
		
		System.out.println("Executed successfully");
	}

}
