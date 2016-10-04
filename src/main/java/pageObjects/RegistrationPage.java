package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {

        super (driver);
    }

    @FindBy (id = "ap_customer_name")
    private WebElement name;


    @FindBy (id = "ap_email")
    private WebElement email;


    @FindBy (id = "ap_password")
    private WebElement password;


    @FindBy (id = "ap_password_check")
    private WebElement confirm_password;


    @FindBy (id = "continue")
    private WebElement submit;


    @FindBy (linkText = "Sign in")
    private WebElement signin;


    public void newUserRegistration(String userName,
                                    String usernameKey,
                                    String passwordKey,
                                    String confirmPassword) {
        name.clear ();
        name.sendKeys (userName);
        email.clear ();
        email.sendKeys (usernameKey);
        password.clear ();
        password.sendKeys (passwordKey);
        confirm_password.sendKeys (confirmPassword);
        submit.click ();
    }

    public void signInAllready() {

        signin.click ();
    }
}

