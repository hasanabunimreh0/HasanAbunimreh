package Pages;

import Common.Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepositoryResultsPage {

    @FindBy(xpath = "//h3[text()[normalize-space()='143 repository results']]")
    private WebElement repositoryResultsTitle;

    @FindBy(xpath = "(//a[@href='/python/cpython']//em)[2]")
    private WebElement firstResult;

    public RepositoryResultsPage(WebDriver webDriver) { PageFactory.initElements(webDriver, this); }

    public WebElement getRepositoryResultsTitle() { Common.explicitWait(repositoryResultsTitle);return this.repositoryResultsTitle; }

    public String getFirstResultText() { Common.explicitWait(firstResult);return this.firstResult.getText(); }

    public void clickOnFirstResult() { Common.explicitWait(firstResult);this.firstResult.click(); }
}
