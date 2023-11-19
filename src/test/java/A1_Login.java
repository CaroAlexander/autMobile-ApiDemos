import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;

/*
    * Appium 2.0
    * Java-client 8
    *
    * This class will work with ApiDemos-debug.apk
    *
 */

public class A1_Login {

    static AndroidDriver driver; //Working in 8.3.3 //create the android driver from Java client

    //App > Activity > Animation > Back to home page
    public void testBasicFlow(){
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='App']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Activity']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Animation']")).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();

    }

    public static void main (String[] args) throws MalformedURLException {

        A0_ApkOptions options = new A0_ApkOptions(); // create the object of the class
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), // Initialize the driver
                options.getApiDemoApkOptions());

        A1_Login obj = new A1_Login();
        obj.testBasicFlow();

        System.out.println("----------- Run Finished -----------");
    }
}
