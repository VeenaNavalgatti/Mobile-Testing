package Amazon;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ShopBycategory {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Veena");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\SDET-2-SET-2-SP-B1\\chromedriver_win32 (2)\\chromedriver.exe");
		
			
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		driver.findElement(MobileBy.id("nav-hamburger-menu")).click();
		driver.findElement(MobileBy.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[6]/a")).click();
		driver.findElement(MobileBy.xpath("//*[@id=\"sbdCategory2\"]/div[1]/div[2]/span")).click();
		driver.findElement(MobileBy.xpath("//*[@id=\"sbdCategory2\"]/div[2]/div/div[1]/a/div/div/div[2]/span")).click();
		driver.findElement(MobileBy.xpath("//*[@id=\"configuration-button\"]/span/input")).click();
		driver.findElement(MobileBy.xpath("//*[@id=\"configuration_1\"]/span/input")).click();
		driver.findElement(MobileBy.xpath("//*[@class = 'a-sheet-close a-focus-hidden']")).click();
		driver.findElement(MobileBy.id("sfl-button")).click();

	}

}
