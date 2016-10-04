package TestsObject;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRegistration extends TestBase {

    //Success create a New User on 'Registration Page'

    @Test
    public void testRegisterUser() {
        LOG.info ("Begin create a new user");
        BasePage.startRegistration ();
        String userName = getNewUserName ();
        RegistrationPage.newUserRegistration (userName, getNewUserName (),
                PASSWORD_KEY, PASSWORD_KEY);
        Assert.assertEquals (LoginSuccessPage.getTitle (), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }


    //Unsuccess create a New User on 'Registration Page' -for case when 'confirm Password' is wrong
    @Test
    public void testRegisterUserWrongConfirmPassord() {
        LOG.info ("Begin create a new user when wrong confirm password  ");
        BasePage.startRegistration ();
        String userName = getNewUserName ();
        RegistrationPage.newUserRegistration (userName, getNewUserName (),
                PASSWORD_KEY, "12345");
        Assert.assertEquals (RegistrationPage.getTitle (), "Amazon Registration");
    }

    //Unsuccess create a New User on 'Registration Page' -for case when 'confirm Password' is empty
    @Test
    public void testRegisterUserWhenEmptyConfirmPassword() {
        LOG.info ("Begin create a new user when empty confirm password  ");
        BasePage.startRegistration ();
        String userName = getNewUserName ();
        RegistrationPage.newUserRegistration (userName, getNewUserName (),
                PASSWORD_KEY, "");
        Assert.assertEquals (RegistrationPage.getTitle (), "Amazon Registration");
    }

    //Unsuccess create a New User on 'Registration Page' -for case when 'confirm Password' and 'Password' are empty
    @Test
    public void testRegisterUserWhenEmptyPasswordAndConfirmPassword() {
        LOG.info ("Begin create a new user when empty confirm password  ");
        BasePage.startRegistration ();
        String userName = getNewUserName ();
        RegistrationPage.newUserRegistration (userName, getNewUserName (),
                "", "");
        Assert.assertEquals (RegistrationPage.getTitle (), "Amazon Registration");
    }


    //Unsuccess create a New User on 'Registration Page' - for case when 'Name' and 'Email' are empty
    @Test
    public void testRegisterUserEmptyNameAndEmailFields() {
        LOG.info ("Begin create a new user when empty email and name");
        BasePage.startRegistration ();
        String userName = getNewUserName ();
        RegistrationPage.newUserRegistration ("", "",
                PASSWORD_KEY, PASSWORD_KEY);
        Assert.assertEquals (RegistrationPage.getTitle (), "Amazon Registration");
    }

    //Unsuccess create a New User on 'Registration Page' - for case when 'Email' is empty
    @Test
    public void testRegisterUserEmptyEmail() {
        LOG.info ("Begin create a new user when empty email");
        BasePage.startRegistration ();
        String userName = getNewUserName ();
        RegistrationPage.newUserRegistration (userName, "",
                PASSWORD_KEY, PASSWORD_KEY);
        Assert.assertEquals (RegistrationPage.getTitle (), "Amazon Registration");
    }

    //Unsuccess create a New User on 'Registration Page' - for case when 'Name' is empty
    @Test
    public void testRegisterUserEmptyName() {
        LOG.info ("Begin create a new user when empty name");
        BasePage.startRegistration ();
        String userName = getNewUserName ();
        RegistrationPage.newUserRegistration ("", getNewUserName (),
                PASSWORD_KEY, PASSWORD_KEY);
        Assert.assertEquals (RegistrationPage.getTitle (), "Amazon Registration");
    }

    //LogIn in account by use 'Sign in' link on 'Registration Page'
    @Test
    public void signInLinkTest() {
        BasePage.startRegistration ();
        LOG.info ("Begin Sign In when already have an account");
        RegistrationPage.signInAllready ();
        LoginPage.loginAction (USERNAME, PASSWORD);
        Assert.assertEquals (LoginSuccessPage.getTitle (), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }
}
