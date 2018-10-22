package lv.iljapavlovs.testng.pageobjects;

import lv.iljapavlovs.testng.core.WebElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LogInPage extends Page{

    @FindBy(how = How.NAME, using = "p")
    private WebElement inputField;

    @FindBy(how = How.ID, using = "uh-search-button")
    private WebElement submitButton;


    @FindBy(how = How.ID, using = "readonlyCustomerIDStr")
    private List<WebElement> searchResultElements;



    public LogInPage (WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("readonlyCustomerIDStr")));
    }

    public YahooSearchResultPage searchFor(String textToSearchFor) {
 //       WebElementHelper.sendKeys(inputField, textToSearchFor, Keys.ENTER);
//        WebElementHelper.click(submitButton);
         return new YahooSearchResultPage(driver);
    }


    public List<WebElement> getSearchResultElements() {
        return searchResultElements;
    }



}
