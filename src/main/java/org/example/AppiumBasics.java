package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBasics {
    
    @Test
    public void appiumTest() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 5 API 32");
        options.setApp("C:\\Users\\rajdeep.dodiya\\CerenceProjects\\Renault\\git_repos\\AppiumFirstProject\\src\\main\\java\\org\\example\\resources\\ApiDemos-debug.apk");

        AndroidDriver androidDriver= new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

        
    }
}
