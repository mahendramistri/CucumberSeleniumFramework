package saucelab;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;


import java.net.URL;

public class Connect {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setPlatform(Platform.VISTA);
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "selenium-build-5APUU");
       // sauceOptions.setCapability("name", "<your test name>");
        capabilities.setCapability("sauce:options", sauceOptions);
        // Create a RemoteWebDriver instance and connect to the local browser
        WebDriver driver1 = new RemoteWebDriver(new URL("https://oauth-user-bef8-b187c151a0f6@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), capabilities);
        // Perform the test using the driver instance
        driver1.get("https://mvnrepository.com/artifact/org.testng/testng");
        Thread.sleep(300);
        driver1.close();
        driver1.quit();
    }
}
