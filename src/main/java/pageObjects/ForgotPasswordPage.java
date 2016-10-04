package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ForgotPasswordPage extends BasePage {

    @FindBy (id = "ap_email")
    private WebElement email;

    @FindBy (id = "continue")
    private WebElement continueButton;


    public void startAssistance() {

        continueButton.click ();

    }

    public ForgotPasswordPage(WebDriver driver) {
        super (driver);

    }
}

    

