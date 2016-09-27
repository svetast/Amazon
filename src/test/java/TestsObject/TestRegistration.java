package TestsObject;


import org.testng.annotations.Test;

public class TestRegistration extends TestBase {
    //создание нового юзера на странице регистрации
    @Test
    public void testRegisterUser(){
        LOG.info ("Begin create a new user");
        BasePage.startRegistration ();
        String userName = getNewUserName();
        RegistrationPage.newUserRegistration (userName,
                PASSWORD_KEY, PASSWORD_KEY);
        // Verify newly created used
        LoginPage.loginAction (userName, PASSWORD_KEY);
    }

    //вход в существующий аккаунт со страницы регистрации используя 'Sign in' link
    @Test
    public void signInLinkTest(){
        BasePage.startRegistration ();
        LOG.info ("Begin Sign In when already have an account");
        RegistrationPage.signInAllready ();
        LoginPage.loginAction (USERNAME, PASSWORD);
        BasePage.checkPassLoginAction ();
    }
}
