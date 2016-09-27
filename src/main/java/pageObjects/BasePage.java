package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertEquals;


public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver)

    {

        this.driver = driver;
    }

    //большая кнопка
    @FindBy (how = How.ID, using = "nav-link-yourAccount")
    private WebElement start;


    @FindBy (id = "nav-flyout-ya-signin")
    private WebElement sign_in;


    @FindBy (how = How.LINK_TEXT, using = "Start here")
    private WebElement start_here;


    @FindBy (id = "auth-fpp-link-bottom")
    private WebElement forgotPassword;


    //регистрация нового юзера
    public void startRegistration() {
        start_here.click ();


    }


    //залогинивание юзера
    public void startLogin() {
        start.click ();
        //sign_in.click ();

    }

    // проверка что юзер успешно залогинен
    public void checkPassLoginAction() {
        assertEquals ("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more", driver.getTitle ());

    }

    // проверка что залогинивание юзера зафейлилось
    public void checkFailLoginAction() {
        assertEquals ("Amazon Sign In", driver.getTitle ());


    }

    public void startForgotPassword() {
        forgotPassword.click ();
    }


    // проверка
    public void checkForgotPassword() {
        assertEquals ("Amazon Forgot Your Password", driver.getTitle ());


    }

    // проверка
    public void checkForgotPasswEmpty() {
        assertEquals ("Amazon Forgot Your Password", driver.getTitle ());


    }

    // подтвеждение email для воостановления пароля
    public void checkConfirmEmail() {
        assertEquals ("Amazon Forgot Your Password", driver.getTitle ());


    }

}


