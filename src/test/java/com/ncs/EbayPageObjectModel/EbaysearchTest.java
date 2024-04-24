package com.ncs.EbayPageObjectModel;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class EbaysearchTest {
    private WebDriver driver;
    private EbayHome homePage;
    private EbaySearchResult searchResultsPage;
 
    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        homePage = new EbayHome(driver);
        searchResultsPage = new EbaySearchResult(driver);
        homePage.openHomePage("https://www.ebay.com/");
    }
 
    @Test
    public void testEbaySearch() {
        homePage.enterSearchKeyword("laptop");
        homePage.clickSearchButton();
        int resultCount = searchResultsPage.getSearchResultsCount();
        Assert.assertTrue(resultCount > 0, "No search results found for the given keyword");
    }
    
 
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
