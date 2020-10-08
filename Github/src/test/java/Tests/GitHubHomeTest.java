package Tests;

import Base.Base;
import Pages.GitHubHomePage;
import com.my.filereader.PropertiesReader;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GitHubHomeTest extends Base {
    private static String expected;
    private static String URL;
    private GitHubHomePage gitHubPage;

    @Test(description = "Check that Search Filed exists")
    public void verifySearchFiledExists() {
        getWebDriver().get(PropertiesReader.getValue("Url"));
        gitHubPage = new GitHubHomePage(getWebDriver());
        Assert.assertTrue(gitHubPage.getSearchFiled().isDisplayed());
    }

}






