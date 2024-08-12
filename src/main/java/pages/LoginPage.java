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

    public LoginPage auth(String login, String password) {
        $(By.id("user-name")).sendKeys(login);
        $(By.id("password")).sendKeys(password);
        $(By.id("login-button")).click();
        return page(LoginPage.class);
    }
}