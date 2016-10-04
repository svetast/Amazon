package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sveta on 30.09.16.
 */
public class LoginSuccessPage extends BasePage {
    public LoginSuccessPage (WebDriver driver) {

        super (driver);
    }


    @FindBy (id ="nav-link-yourAccount")
    private WebElement yourAccount;



    @FindBy (id ="nav-item-signout")
    private WebElement signOut;





//go to user's account page
    public void goToUserAccount(){

        yourAccount.click ();
    }

    public void goToLogOut() throws InterruptedException {

//find invisible element SignOut link
        final Actions actions = new Actions (driver).
                moveToElement (yourAccount);
                        actions.perform ();
        waitFor ();

                signOut.click();
    }

    public void waitFor() throws InterruptedException {

        Thread.sleep (500);
    }
}
