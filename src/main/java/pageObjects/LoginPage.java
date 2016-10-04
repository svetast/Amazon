package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {

        super (driver);
    }


    @FindBy (id = "ap_email")
    private WebElement email;

    @FindBy (id = "ap_password")
    private WebElement password;

    @FindBy (linkText = "Forgot your password?")
    private WebElement forgotPassword;

    @FindBy (id = "signInSubmit")
    private WebElement submitButton;

    @FindBy (id = "createAccountSubmit")
    private WebElement createAccount;


    public void loginAction(String usernameKey, String passwordKey) {

        email.clear ();
        email.sendKeys (usernameKey);
        password.clear ();
        password.sendKeys (passwordKey);
        submitButton.click ();
    }

    public void forgotPasswordAction() {
        email.clear ();
        forgotPassword.click ();
    }


    public void startRegistration() {

        createAccount.click ();
    }
}

