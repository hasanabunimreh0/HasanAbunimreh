package Pages;

import Common.Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GitHubHomePage {

    @FindBy(name = "q")
    private WebElement searchFiled;

    @FindBy(xpath = "(//div[contains(@class,'jump-to-suggestion-name js-jump-to-suggestion-name')])[3]")
    private WebElement searchButton;


    public GitHubHomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }


    public WebElement getSearchFiled() { return this.searchFiled; }

    public void searchingForRepo(String repoName) { this.fillSearchFiled(repoName);this.clickSearchButton(); }

    private void clickSearchButton() { Common.explicitWait(searchButton);this.searchButton.click(); }

    private void fillSearchFiled(String repoName) { this.searchFiled.sendKeys(repoName); }

}



