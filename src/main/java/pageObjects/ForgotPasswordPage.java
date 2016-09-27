package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ForgotPasswordPage extends BasePage {

    @FindBy (id = "ap_email")
    private WebElement email;

    @FindBy (id = "continue")
    private WebElement continueButton;


    public void passwordAssistance(String emailKey) {
        email.clear ();
        email.sendKeys (emailKey);
        continueButton.click ();

    }

    public ForgotPasswordPage(WebDriver driver) {
        super (driver);
        setPageUrl ("Amazon Forgot Your Password");

    }

    private void setPageUrl(String s) {
    }


}

    

