package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

//surandam web elementa
    @FindBy(css = "a[href='login.php']")
    private WebElement linkLogin;

    @FindBy(xpath = "//a[normalize-space()='signup here']")
    private WebElement linkSignup;
    public MainPage(WebDriver driver) {

        super(driver);
    }

    public void clickLinkLogin() {
        linkLogin.click();
    }

    public void clickLinkSignup() {

        linkSignup.click();
    }
}
