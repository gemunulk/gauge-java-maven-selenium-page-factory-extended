package utils;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
    private static final String FIREFOX = "firefox";
    private static final String IE = "ie";
    private static final String DEFAULT = "chrome";
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeSuite
    public void Setup() {
        String browser = System.getenv("BROWSER");

        // Uses chrome driver by default
        if (browser == null) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        }

        switch (browser)
        {
            case "IE":
                InternetExplorerDriverManager.getInstance().setup();
                driver = new InternetExplorerDriver();
            case "FIREFOX":
                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
            default:
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();

        }
    }

    @AfterSuite
    public void TearDown() {
        driver.close();
        driver.quit();
    }
}
