
##AutomationScriptGitHub
Introduction
Maven project using java programeng languge  for Automation some Cases on GitHub with using page object model 

##Usage
See the Test Section and open the Test Classes 
to can Run the scripts 
##Examples
Github/src/test/java/Tests/GitHubHomeTest.java

##Note: when using this project , you are not required to add any code in your project.
just make sure to download java with SDK

See this example of how a test is runed, 



   @Test(description = "Check that Search Filed exists")
    public void verifySearchFiledExists() {
        getWebDriver().get(PropertiesReader.getValue("Url"));
        gitHubPage = new GitHubHomePage(getWebDriver());
        Assert.assertTrue(gitHubPage.getSearchFiled().isDisplayed());
    }