package pages;

import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

@Getter
public class LoginPage {

    public LoginPage() {
        page(this);
    }

    private void enterLogin(String login) {
        $(By.id("user-name")).sendKeys(login);
    }

    private void enterPassword(String password) {
        $(By.id("password")).sendKeys(password);
    }

    private void clickLoginButton() {
        $(By.id("login-button")).click();
    }

    public LoginPage auth(String login, String password) {
        enterLogin(login);
        enterPassword(password);
        clickLoginButton();
        return page(LoginPage.class);
    }
}