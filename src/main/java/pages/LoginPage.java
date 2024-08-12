package pages;

import lombok.Getter;
import selec.Selectors;

import static com.codeborne.selenide.Selenide.page;

@Getter
public class LoginPage {

    private Selectors selectors = new Selectors();

    private void enterLogin(String login) {
        selectors.getLoginPage().sendKeys(login);
    }

    private void enterPassword(String password) {
        selectors.getPasswordField().sendKeys(password);
    }

    private void clickLoginButton() {
        selectors.getLoginBtn().click();
    }

    public LoginPage auth(String login, String password) {
        enterLogin(login);
        enterPassword(password);
        clickLoginButton();
        return page(LoginPage.class);
    }
}