package com.ssappium;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Test_Basic {

    private AppiumDriver driver;

    public static void main(String[] args) {
        Test_Basic test = new Test_Basic();
        try {
            test.SSLogin(); // Call the login method
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void SSLogin() throws MalformedURLException {
        // Desired Capabilities
        AppiumDriverLocalService service = new AppiumServiceBuilder()
            .usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
            .withAppiumJS(new File("C:\\Users\\HP\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\appium.js"))
            .usingPort(4723) // Change port if necessary
            .withLogFile(new File("appium-server.log")) // Log file for debugging
            .build();

        service.start();

        if (!service.isRunning()) {
            System.err.println("Failed to start Appium server.");
            return;
        }

        System.out.println("Appium server started successfully!");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "realme narzo 50");
        cap.setCapability(MobileCapabilityType.UDID, "INSWMRHYKBL78DAE");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
        cap.setCapability("appPackage", "com.study.smart");
        cap.setCapability("appActivity", "com.study.smart.ui.activity.splash_activity.SplashActivity");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        // Initialize the Appium Driver
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        System.out.println("App launched successfully!");

        // Stop the Appium server after the test
        service.stop();
    }
}
