package core;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import pages.InventoryPage;
import pages.LoginPage;

public class Start {

    @Step("Авторизация пользователя")
    public static InventoryPage start() {
        Selenide.open("https://www.saucedemo.com/");
        return new LoginPage()
                .auth("standard_user", "secret_sauce");
    }
}