//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class FirstAndroidTest {
//
//    AppiumDriver driver;
//
//    @BeforeTest
//    public void setUp() throws MalformedURLException {
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platformName","Android");
//        caps.setCapability("automationName", "UiAutomator2");
//        caps.setCapability("platformVersion", "12");
//        caps.setCapability("deviceName", "d63f548a");
//        caps.setCapability("app", System.getProperty("User.dir")+"/apps/ApiDemos-debug.apk");
//
//        driver = new AndroidDriver(new URL("http://192.168.1.61:4723/"),caps);
//    }
//
//    @Test
//    public void click_App_Button(){
//        //code
//    }
//
//    //close the conection after we finish
//    @AfterTest
//    public void tearDown(){
//        if (null != driver){
//            driver.quit();
//        }
//    }
//
//}
