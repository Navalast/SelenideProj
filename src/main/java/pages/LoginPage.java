package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

@Getter
public class LoginPage {

    @FindBy(id = "user-name")
    private SelenideElement loginField;

    @FindBy(id = "password")
    private SelenideElement passwordField;

    @FindBy(id = "login-button")
    private SelenideElement loginBtn;

    public LoginPage() {
        page(this);
    }

    public void auth(String login, String password) {

        getLoginField().sendKeys(login);
        getPasswordField().sendKeys(password);

        getLoginBtn().click();
    }
}