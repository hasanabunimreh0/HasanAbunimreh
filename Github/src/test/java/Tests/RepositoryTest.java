package Tests;

import Base.Base;
import Common.Common;
import Pages.GitHubHomePage;
import Pages.RepositoryPage;
import Pages.RepositoryResultsPage;
import com.my.filereader.PropertiesReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RepositoryTest extends Base {
    private static String URL;
    private static String expected;
    private GitHubHomePage gitHubPage;
    private RepositoryPage repositoryPage;
    private RepositoryResultsPage repositoryResultsPage;

    @Test(description = "Check the Url  after open the first result (python/cpython)")
    public void verifyTheUrlForTheRepository() {
        getWebDriver().get(PropertiesReader.getValue("Url"));
        gitHubPage = new GitHubHomePage(getWebDriver());
        repositoryPage = new RepositoryPage(getWebDriver());
        repositoryResultsPage = new RepositoryResultsPage(getWebDriver());
        gitHubPage.searchingForRepo("python/cpython");
        repositoryResultsPage.clickOnFirstResult();
        URL = getWebDriver().getCurrentUrl();
        expected = "https://github.com/python/cpython";
        Assert.assertEquals(URL, expected);

    }

    @Test(description = "Check Build Passing Button is exist")
    public void verifyBuildPassingExists() {
        getWebDriver().get(PropertiesReader.getValue("Url"));
        gitHubPage = new GitHubHomePage(getWebDriver());
        repositoryResultsPage = new RepositoryResultsPage(getWebDriver());
        repositoryPage = new RepositoryPage(getWebDriver());
        gitHubPage.searchingForRepo("python/cpython");
        repositoryResultsPage.clickOnFirstResult();
        Assert.assertTrue(repositoryPage.getBuildPassingButton().isDisplayed());
    }

    @Test(description = "Check Test Passing Button is exist")
    public void verifyTestPassingExists() {
        getWebDriver().get(PropertiesReader.getValue("Url"));
        gitHubPage = new GitHubHomePage(getWebDriver());
        repositoryResultsPage = new RepositoryResultsPage(getWebDriver());
        repositoryPage = new RepositoryPage(getWebDriver());
        gitHubPage.searchingForRepo("python/cpython");
        repositoryResultsPage.clickOnFirstResult();
        Assert.assertTrue(repositoryPage.getTestPassingButton().isDisplayed());
    }


}
