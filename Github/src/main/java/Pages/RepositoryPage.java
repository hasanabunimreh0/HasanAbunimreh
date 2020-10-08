package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepositoryPage {

    @FindBy(xpath = "//img[@alt='CPython build status on Travis CI']")
    private WebElement buildPassingButton;

    @FindBy(xpath = "//img[@alt='CPython build status on GitHub Actions']")
    private WebElement testPassingButton;


    public RepositoryPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public WebElement getBuildPassingButton() { return this.buildPassingButton; }
    public WebElement getTestPassingButton() { return this.testPassingButton;
    }
}
