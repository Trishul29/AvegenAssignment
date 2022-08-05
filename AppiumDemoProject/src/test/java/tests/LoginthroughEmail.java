package tests;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import java.net.URL;
import java.time.Duration;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class LoginthroughEmail {
 public static  AppiumDriver<MobileElement> driver;

  DesiredCapabilities dc = new DesiredCapabilities();
  //WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(10));
  
 @BeforeTest(alwaysRun=true)
  public void setUp() throws MalformedURLException {
  //    dc.setCapability("reportDirectory", reportDirectory);
      dc.setCapability("platformName", "ANDROID");
      dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy S20FE 5G" );
      dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12" );
      dc.setCapability("appPackage","com.android.vending");
      
      dc.setCapability("appActivity","com.avegen.together.MainActivity");
      dc.setCapability("testName", "testLoginthroughEmail");
      dc.setCapability(MobileCapabilityType.UDID, "RZCR904VKSF");
     // driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), dc);
      URL url=new URL("http://localhost:4723/wd/hub");
      driver=new AppiumDriver<MobileElement>(url,dc);
      driver.setLogLevel(Level.INFO);
  }

  @Test
  public void testLoginthroughEmail() {
      driver.findElement(By.xpath("//*[@text='Together']")).click();
      new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Next']")));
      driver.findElement(By.xpath("//*[@text='Next']")).click();
      driver.findElement(By.xpath("//*[@text='P']")).click();
      driver.findElement(By.xpath("//*[@text='a']")).click();
      driver.findElement(By.xpath("//*[@text='y']")).click();
      driver.findElement(By.xpath("//*[@text='a']")).click();
      driver.findElement(By.xpath("//*[@text='l']")).click();
      driver.findElement(By.xpath("//*[@text='Next']")).click();
      driver.findElement(By.xpath("//*[@class='android.widget.TextView' and (./preceding-sibling::* | ./following-sibling::*)[@text='Play'] and ./parent::*[@class='android.view.View']]")).click();
      driver.findElement(By.xpath("//*[@text='NEXT']")).click();
      driver.findElement(By.xpath("//*[@id='contentPanel']")).click();
      driver.findElement(By.xpath("//*[@text='Sign in with Google']")).click();
      driver.findElement(By.xpath("//*[@text='giritrishul51@gmail.com']")).click();
      new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Skip']")));
      driver.findElement(By.xpath("//*[@text='Skip']")).click();
  }

  @AfterMethod(alwaysRun=true)
  public void tearDown() {
      driver.quit();
  }
}