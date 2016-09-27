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

    @FindBy (id = "signInSubmit")
    private WebElement submit;


    public void loginAction(String usernameKey, String passwordKey) {

        email.clear ();
        email.sendKeys (usernameKey);
        password.clear ();
        password.sendKeys (passwordKey);
        submit.click ();

    }

}

