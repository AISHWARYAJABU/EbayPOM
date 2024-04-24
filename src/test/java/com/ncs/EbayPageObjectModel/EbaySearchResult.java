package com.ncs.EbayPageObjectModel;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class EbaySearchResult {
	 private WebDriver driver;
	
	     @FindBy(xpath = "//h1[contains(@class,'srp-controls__count-heading')]") // Locator for the search results count
	     private WebElement searchResultsCount;
	
	     @FindBy(xpath = "//ul[@class='srp-results']/li") // Locator for the list of search results
	     private List<WebElement> searchResultItems;
	
	     public EbaySearchResult(WebDriver driver) {
	         this.driver = driver;
	         PageFactory.initElements(driver, this); // Initializing page elements using PageFactory
	     }
	
	     public int getSearchResultsCount() {
	         String countText = searchResultsCount.getText();
	         return Integer.parseInt(countText.replaceAll("\\D+", ""));
	     }
	
	     public int getNumberOfSearchResultItems() {
	         return searchResultItems.size();
	     }
}
