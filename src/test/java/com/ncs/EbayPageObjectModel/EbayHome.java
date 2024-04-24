package com.ncs.EbayPageObjectModel;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class EbayHome {
private WebDriver driver;
 
@FindBy(id = "gh-ac")
private WebElement searchBox;
 
@FindBy(id = "gh-btn")
private WebElement searchButton;
 
public EbayHome(WebDriver driver) {
     this.driver = driver;
     PageFactory.initElements(driver, this);
}
 
public void openHomePage(String url) {
     driver.get(url);
}
 
public void enterSearchKeyword(String keyword) {
     searchBox.clear();
     searchBox.sendKeys(keyword);
}
 
public void clickSearchButton() {
     searchButton.click();
}
 
}