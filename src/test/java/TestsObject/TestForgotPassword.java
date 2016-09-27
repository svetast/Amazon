package TestsObject;


import org.testng.annotations.Test;





public class TestForgotPassword extends TestBase{
    @Test
    public void inputRealEmail() {
        LOG.info ("Begin input real E-mail");
        BasePage.startLogin ();
        LOG.info ("Begin click 'Forgot password ?'");
        BasePage.startForgotPassword ();
        ForgotPasswordPage.passwordAssistance(USERNAME);
        BasePage.checkConfirmEmail ();
    }

    @Test
    public void inputEmptylEmail() {
        LOG.info ("Begin input an empty Email ");
        BasePage.startLogin ();
        LOG.info ("Begin click 'Forgot password ?'");
        BasePage.startForgotPassword ();
        ForgotPasswordPage.passwordAssistance("");
        BasePage.checkForgotPasswEmpty ();
    }
}
