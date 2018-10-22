package com.sample.testng.pageobjects;

import com.sample.testng.core.WebElementHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BpmPage extends Page {




    @FindBy(how = How.XPATH, using = "//*[@name='q']")
    private WebElement inputField;

    public BpmPage(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.visibilityOf(inputField));
    }

    public GoogleSearchResultPage searchFor(String textToSearchFor) {
        WebElementHelper.sendKeys(inputField, textToSearchFor, Keys.ENTER);
        return new GoogleSearchResultPage(driver);
    }

}