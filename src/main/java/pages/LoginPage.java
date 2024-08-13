package pages;

import selectors.LoginSelectors;

import static com.codeborne.selenide.Selenide.page;

public class LoginPage {

    public InventoryPage auth(String login, String password) {
        page(LoginSelectors.class).getLoginPage().sendKeys(login);
        page(LoginSelectors.class).getPasswordField().sendKeys(password);
        page(LoginSelectors.class).getLoginBtn().click();
        return new InventoryPage();
    }
}