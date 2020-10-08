package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

import java.lang.reflect.Method;

public class Base {
    private static ChromeDriver chromeDriver;

    public static org.openqa.selenium.WebDriver getWebDriver() {

        if (chromeDriver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.setHeadless(true);
            options.addArguments("--start-maximized");
            options.addArguments("--headless");
            options.addArguments("--window-size=1044,x784");
            options.addArguments("--no-sandbox");
            options.addArguments("--allow-insecure-localhost");
            chromeDriver = new ChromeDriver(options);
            return chromeDriver;

        }
        return chromeDriver;
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown(Method method) {

        getWebDriver().quit();
    }

}

