package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sveta on 02.10.16.
 */
public class ConfirmForgotPasswordPage extends BasePage {
    public ConfirmForgotPasswordPage(WebDriver driver) {

        super (driver);
    }

    @FindBy (linkText = "Continue")
    private WebElement continueButton;
}
