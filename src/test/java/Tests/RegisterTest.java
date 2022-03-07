package Tests;

import Base.Hooks;
import Pages.HomePage;
import Pages.RegisterPage;
import org.junit.Test;

public class RegisterTest extends Hooks {

    public HomePage homePage;
    public RegisterPage registerPage;


    @Test
    public void testExistingUserRegister(){
        homePage = new HomePage(getDriver());
        registerPage = new RegisterPage(getDriver());

        homePage.clickSignUp();
        registerPage.invalidUserCreateAccount(inputData);
    }

    @Test
    public void testInvalidEmailRegister(){
        homePage = new HomePage(getDriver());
        registerPage = new RegisterPage(getDriver());

        homePage.clickSignUp();
        registerPage.invalidEmailCreateAccount(inputData);
    }

    @Test
    public void testUnmatchPasswordRegister(){
        homePage = new HomePage(getDriver());
        registerPage = new RegisterPage(getDriver());

        homePage.clickSignUp();
        registerPage.invalidUnmatchCreateAccount(inputData);
    }


}
