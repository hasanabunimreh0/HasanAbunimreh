package Common;
import Base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Created By Hasan Abu Nimreh

public class Common {
    public static void explicitWait(WebElement number) {
        WebDriverWait wait = new WebDriverWait(Base.getWebDriver(), 40);
        wait.until(ExpectedConditions.visibilityOf(number));
    }
}
