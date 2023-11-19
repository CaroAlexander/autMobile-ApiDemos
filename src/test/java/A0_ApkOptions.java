
import java.io.File;
import java.util.Objects;

import io.appium.java_client.android.options.UiAutomator2Options;

public class A0_ApkOptions {

    public UiAutomator2Options getApiDemoApkOptions() {
        System.out.println("----------- Started: Api Demo Apk -----------");

        //to install the app
//        ClassLoader classLoader = getClass().getClassLoader();
//        File file = new File(Objects.requireNonNull(classLoader.getResource("builds/ApiDemos-debug.apk")).getFile());
//        String apkPath = file.getAbsolutePath();

        UiAutomator2Options options = new UiAutomator2Options();
        options
                .setPlatformName("Android")
                .setPlatformVersion("13")

                .setAutomationName("UIAutomator2")
                .setDeviceName("d63f548a")

                .setAppPackage("io.appium.android.apis")
                .setAppActivity(".ApiDemos");

//                .setApp(apkPath) // Optional, Drag n Drop can also be used
//                .setNoReset(true); // false: will install app if its already present
        return options;
    }

//    Public UiAutomator2Options getChromeOptions() {
//        System.out.println("----------- Started: Chrome Browser -----------");
//
//        UiAutomator2Options options = new UiAutomator2Options();
//        options
//                .setPlatformName("Android")
//                .setPlatformVersion("13")
//
//                .setAutomationName("UIAutomator2")
//                .setDeviceName("d63f548a")
//
//                .noReset()
//                .withBrowserName("Chrome");
//
//        return options;
//    }

}
