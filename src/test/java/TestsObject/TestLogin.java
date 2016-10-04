package TestsObject;


import org.testng.Assert;
import org.testng.annotations.Test;


public class TestLogin extends TestBase {

    //Login Success
    @Test
    public void testLoginSuccess() throws InterruptedException {
        LOG.info ("Begin Login Success");
        BasePage.startLogin ();
        LoginPage.loginAction (USERNAME, PASSWORD);
        LoginSuccessPage.goToUserAccount ();
        Assert.assertEquals (LoginSuccessPage.getTitle (), "Amazon.com - Your Account");
    }

    //Login Unsuccess - Wrong Username
    @Test
    public void testWrongUsername() {
        LOG.info ("Begin enter wrong username");
        BasePage.startLogin ();
        LoginPage.loginAction (USERNAME + "a", PASSWORD);
        Assert.assertEquals (BasePage.getTitle (), "Amazon Sign In");
    }

    // Login unsuccess - Empty Email
    @Test
    public void testEmptyEmail() {
        LOG.info ("Begin enter an empty Email");
        BasePage.startLogin ();
        LoginPage.loginAction ("", PASSWORD);
        Assert.assertEquals (BasePage.getTitle (), "Amazon Sign In");
    }

    //Login unsuccess - Empty Password
    @Test
    public void testEmptyPassword() {
        LOG.info ("Begin enter an empty password");
        BasePage.startLogin ();
        LoginPage.loginAction (USERNAME, "");
        Assert.assertEquals (BasePage.getTitle (), "Amazon Sign In");
    }

    // Login unsuccess - Invalid Data
    @Test
    public void testInvalidData() {
        LOG.info ("Begin input invalid data");
        BasePage.startLogin ();
        LoginPage.loginAction ("#$%^&*.ua@gmail.com", "?><");
        Assert.assertEquals (BasePage.getTitle (), "Amazon Sign In");
    }


    //LogOut
    @Test
    public void testLogOut() throws InterruptedException {
        LOG.info ("Begin LogOut");
        BasePage.startLogin ();
        LoginPage.loginAction (USERNAME, PASSWORD);
        LoginSuccessPage.goToUserAccount ();
        LoginSuccessPage.goToLogOut ();
        LoginSuccessPage.waitFor ();
        Assert.assertEquals (LoginPage.getTitle (), "Amazon Sign In");
    }
}



