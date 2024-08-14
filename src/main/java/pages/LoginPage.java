package pages;

import io.qameta.allure.Step;
import selectors.LoginSelectors;

import static com.codeborne.selenide.Selenide.page;

public class LoginPage {

    @Step("Авторизация пользователя")
    public InventoryPage auth(String login, String password) {
        page(LoginSelectors.class).getLoginPage().sendKeys(login);
        page(LoginSelectors.class).getPasswordField().sendKeys(password);
        page(LoginSelectors.class).getLoginBtn().click();
        return new InventoryPage();
    }
}