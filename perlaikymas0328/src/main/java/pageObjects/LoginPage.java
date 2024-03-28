package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    //surandam web elementa
    @FindBy(css = "input[name='uuname']")
    private WebElement inputName;

    @FindBy(css = "input[name='upass']")
    private WebElement inputPassword;

    @FindBy(css = "input[name='upass2']")
    private WebElement inputPassword2;

    @FindBy(css = "input[name='uemail']")
    private WebElement inputEmail;

    @FindBy(css = "input[value='Login']")
    private WebElement buttonLogin;

    @FindBy(css = "input[value='signup']")
    private WebElement buttonSignup;


    public LoginPage(WebDriver driver) { super(driver); }

        public void  typeName(String username) {
            inputName.sendKeys(username);
        }
        public void typePassword(String pass) {

        inputPassword.sendKeys(pass);
        }
        public void typePassword2(String pass) {

        inputPassword.sendKeys(pass);
        }

         public void typeEmail(String email) {

        inputEmail.sendKeys(email);
        }

        public void clickSignup() {

        buttonSignup.click();
        }

}
