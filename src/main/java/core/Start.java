package core;

import com.codeborne.selenide.Selenide;
import pages.InventoryPage;
import pages.LoginPage;

public class Start {

    public static InventoryPage start() {
        Selenide.open("https://www.saucedemo.com/");
        return new LoginPage()
                .auth("standard_user", "secret_sauce");
    }
}