package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // The method which uses for all pages
    public String getTitle() {
        return (getDriver ().getTitle ());
    }


    public WebDriver getDriver() {

        return driver;
    }

    //Your Account link
    @FindBy (id = "nav-link-yourAccount")
    private WebElement start;


    @FindBy (id = "nav-flyout-ya-signin")
    private WebElement sign_in;


    @FindBy (linkText = "Start here")
    private WebElement start_here;


    //Search field
    @FindBy (id = "twotabsearchtextbox")
    private WebElement searchField;

    @FindBy (css = "input.nav-input")
    private WebElement searchButton;


    //a New user Registration
    public void startRegistration() {
        start_here.click ();
    }


    //Login action
    public void startLogin() {

        start.click ();
    }

    //Checking the Search function  for unregistered user
    public void searchItems(String item) {
        searchField.click ();
        searchField.sendKeys (item);
        searchButton.click ();
    }
}


