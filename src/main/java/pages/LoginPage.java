package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class LoginPage {

    private SelenideElement loginField = $(By.id("user-name"));
    private SelenideElement passwordField = $(By.id("password"));
    private SelenideElement loginBtn = $(By.id("login-button"));

    public void auth(String login, String password) {

        getLoginField().sendKeys(login);
        getPasswordField().sendKeys(password);

        getLoginBtn().click();
    }
}