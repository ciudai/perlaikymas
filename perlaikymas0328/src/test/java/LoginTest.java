import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import pageObjects.MainPage;


public class LoginTest extends BaseTest {

    MainPage mainPage;

    LoginPage loginPage;

    @Test
    void  userCanLogin() {
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);

        mainPage.clickLinkLogin();
        mainPage.clickLinkSignup();
        loginPage.typeName("gabijakon");
        loginPage.typePassword("perlaikymas0328");
        loginPage.typePassword2("perlaikymas0328");
        loginPage.typeEmail("gabijakondra@kondra.lt");
        loginPage.clickSignup();
        System.out.println("");

    }
}
