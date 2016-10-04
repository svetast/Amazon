package TestsObject;


import org.testng.Assert;
import org.testng.annotations.Test;


public class TestForgotPassword extends TestBase {


    //case when input valid Email
    @Test
    public void testInputRealEmail() {
        LOG.info ("Begin forgot password action when input real email");
        BasePage.startLogin ();
        LoginPage.forgotPasswordAction ();
        PasswordAssistancePage.forgotCountinue (USERNAME);
        Assert.assertEquals (ConfirmForgotPasswordPage.getTitle (), "Please confirm your identity");
    }

    //case when input invalid Email
    @Test
    public void testInputInvalidEmail() {
        LOG.info ("Begin forgot password action when input invalid email");
        BasePage.startLogin ();
        LoginPage.forgotPasswordAction ();
        PasswordAssistancePage.forgotCountinue ("asdfgh");
        Assert.assertEquals (RegistrationPage.getTitle (), "Amazon Forgot Your Password");
    }

    //case when input Empty Email field
    @Test
    public void testInputEmptyEmail() {
        LOG.info ("Begin forgot password action when input empty email");
        BasePage.startLogin ();
        LoginPage.forgotPasswordAction ();
        PasswordAssistancePage.forgotCountinue ("");
        Assert.assertEquals (RegistrationPage.getTitle (), "Amazon Forgot Your Password");
    }
}

