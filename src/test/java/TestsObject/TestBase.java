package TestsObject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class TestBase {
    public static final String USERNAME = "stepanovasveta.ua@gmail.com";
    public static final String PASSWORD = "123456";
    public static final String NAME = "sveta";
    public static final String EMAIL_DOMAIN = "@gmail.com";
    public static final String PASSWORD_KEY = "123456";
    private final static String URL = "https://www.amazon.com/";
    public static final Logger LOG = Logger.getLogger (TestBase.class);



    WebDriver driver;
    pageObjects.BasePage BasePage;
    pageObjects.LoginPage LoginPage;
    pageObjects.ErrorPage ErrorPage;
    pageObjects.RegistrationPage RegistrationPage;
    pageObjects.ForgotPasswordPage ForgotPasswordPage;

    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver ();
        driver.manage ().timeouts ().implicitlyWait (20, TimeUnit.SECONDS);
        driver.get (URL);
        PropertyConfigurator.configure ( "src/log4j.properties" );

        BasePage = PageFactory.initElements (driver, pageObjects.BasePage.class);
        LoginPage = PageFactory.initElements (driver, pageObjects.LoginPage.class);
        ErrorPage = PageFactory.initElements (driver, pageObjects.ErrorPage.class);
        RegistrationPage = PageFactory.initElements (driver, pageObjects.RegistrationPage.class);
        ForgotPasswordPage = PageFactory.initElements (driver, pageObjects.ForgotPasswordPage.class);
    }

    private static String getRandomString(){
        Random randomGenerator = new Random();
        Integer randInt = randomGenerator.nextInt(10000);
        return randInt.toString();
    }

    public static String getNewUserName() {
        return NAME + getRandomString () + EMAIL_DOMAIN;
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit ();
    }
}


