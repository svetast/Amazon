package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sveta on 04.10.16.
 */
public class PasswordAssistancePage extends BasePage {
    public PasswordAssistancePage(WebDriver driver) {

        super (driver);
    }

    @FindBy (id = "ap_email")
    private WebElement emailForgot;

    @FindBy (id = "continue")
    private WebElement countinueButton;


    public void forgotCountinue(String username){
        emailForgot.click ();
        emailForgot.sendKeys (username);
        countinueButton.click ();



    }


}
