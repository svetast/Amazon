package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super (driver);
    }

    @FindBy (how = How.ID, using = "ap_customer_name")
    private WebElement name;


    @FindBy (how = How.ID, using = "ap_email")
    private WebElement email;


    @FindBy (how = How.ID, using = "ap_password")
    private WebElement password;


    @FindBy (how = How.ID, using = "ap_password_check")
    private WebElement confirm_password;


    @FindBy (how = How.ID, using = "continue")
    private WebElement submit;


    @FindBy (how = How.LINK_TEXT, using = "Sign in")
    private WebElement signin;


    public void newUserRegistration(String usernameKey,
                                    String passwordKey,
                                    String confirmPassword) {


        name.clear ();
        name.sendKeys (usernameKey);
        password.clear ();
        password.sendKeys (passwordKey);
        confirm_password.clear ();
        confirm_password.sendKeys (confirmPassword);
        submit.click ();


    }

    public void signInAllready() {

        signin.click ();
    }


}

