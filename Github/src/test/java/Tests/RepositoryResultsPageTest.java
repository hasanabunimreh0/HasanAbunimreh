package Tests;

import Base.Base;
import Pages.GitHubHomePage;
import Pages.RepositoryResultsPage;
import com.my.filereader.PropertiesReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RepositoryResultsPageTest extends Base {

    private static String expected;
    private static String URL;
    private GitHubHomePage gitHubPage;
    private RepositoryResultsPage repositoryResultsPage;

    @Test(description = "Check the first result is python/cpython")
    public void verifyTheFirstResult() {
        getWebDriver().get(PropertiesReader.getValue("Url"));
        gitHubPage = new GitHubHomePage(getWebDriver());
        repositoryResultsPage = new RepositoryResultsPage(getWebDriver());
        gitHubPage.searchingForRepo("python/cpython");
        expected = "python/cpython";
        Assert.assertEquals(repositoryResultsPage.getFirstResultText(), expected);
    }

    @Test(description = "Check the repository search results")
    public void verifyTheRepositorySearchResults() {
        getWebDriver().get(PropertiesReader.getValue("Url"));
        gitHubPage = new GitHubHomePage(getWebDriver());
        repositoryResultsPage = new RepositoryResultsPage(getWebDriver());
        gitHubPage.searchingForRepo("python/cpython");
        Assert.assertTrue(repositoryResultsPage.getRepositoryResultsTitle().isDisplayed());
    }

    @Test(description = "Check the Url")
    public void verifyTheUrl() {
        getWebDriver().get(PropertiesReader.getValue("Url"));
        gitHubPage = new GitHubHomePage(getWebDriver());
        gitHubPage.searchingForRepo("python/cpython");
        URL = getWebDriver().getCurrentUrl();
        expected = "https://github.com/search?q=python%2Fcpython";
        Assert.assertEquals(URL, expected);
    }
}
