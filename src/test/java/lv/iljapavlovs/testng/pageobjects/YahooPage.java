package lv.iljapavlovs.testng.pageobjects;

import lv.iljapavlovs.testng.core.WebElementHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YahooPage extends Page{

    @FindBy(how = How.NAME, using = "p")
    private WebElement inputField;

    @FindBy(how = How.ID, using = "uh-search-button")
    private WebElement submitButton;



    public YahooPage(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.visibilityOf(inputField));
    }

    public YahooSearchResultPage searchFor(String textToSearchFor) {
        WebElementHelper.sendKeys(inputField, textToSearchFor, Keys.ENTER);
        WebElementHelper.click(submitButton);
        return new YahooSearchResultPage(driver);
    }

}
