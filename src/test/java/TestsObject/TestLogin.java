package TestsObject;


import org.testng.annotations.Test;

public class TestLogin extends TestBase {

    //успешное залогиниванние
    @Test
    public void testLoginSuccess() {
        LOG.info ( "Begin login testLoginSuccess" );
        BasePage.startLogin ();
        LoginPage.loginAction (USERNAME, PASSWORD);
        BasePage.checkPassLoginAction ();// проверка успешного ввода
    }

    //неуспешное залогинивание - неверные данные ввода
    @Test
    public void testWrongUsername() {
        LOG.info ( "Begin login inputUnSuccess" );
        BasePage.startLogin ();
        LoginPage.loginAction (USERNAME + "a",PASSWORD);
        BasePage.checkFailLoginAction ();// проверка результатов неуспешного ввода
    }

    // неуспешное залогинивание - пустой email
    @Test
    public void testEmptyEmail() {
        LOG.info ( "Begin login testEmptyEmail" );
        BasePage.startLogin ();
        LoginPage.loginAction ( "", PASSWORD);
        BasePage.checkFailLoginAction ();// проверка результатов ввода пустого емейлф

    }

    // неуспешное залогинивание - пустой password
    @Test
    public void testEmptyPassword() {
        LOG.info ( "Begin login testEmptyPassword" );
        BasePage.startLogin ();
        LoginPage.loginAction (USERNAME, "");
        BasePage.checkFailLoginAction ();// проверка результатов ввода пустого пароля
    }

    // неуспешное залогинивание - невалидный ввод данных
    @Test
    public void testInvalidData() {
        LOG.info ( "Begin login inputInvalidData" );
        BasePage.startLogin ();
        LoginPage.loginAction ("#$%^&*.ua@gmail.com", "?><" );
        BasePage.checkFailLoginAction ();// проверка результатов ввода пустого пароля
    }
}



