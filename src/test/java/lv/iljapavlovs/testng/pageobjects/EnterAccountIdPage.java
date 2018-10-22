package lv.iljapavlovs.testng.pageobjects;
import lv.iljapavlovs.testng.core.WebElementHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EnterAccountIdPage extends Page{


    @FindBy(how = How.ID, using = "customerIDField")
    private WebElement inputField;

    @FindBy(how = How.ID, using = "nextBtn")
    private WebElement submitButton;



    public EnterAccountIdPage(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.visibilityOf(inputField));
    }

    public LogInPage enterAccountId(String textToSearchFor) {
        WebElementHelper.sendKeys(inputField, textToSearchFor);
        WebElementHelper.click(submitButton);
        return new LogInPage(driver);
    }
}
