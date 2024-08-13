package core;

import pages.InventoryPage;
import pages.LoginPage;

public class Start {

    public static InventoryPage start() {
        return new LoginPage()
                .auth("standard_user", "secret_sauce");
    }
}
