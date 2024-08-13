package pages;

import selectors.CheckoutCompleteSelectors;

import static com.codeborne.selenide.Selenide.page;
import static org.testng.Assert.assertTrue;

public class CheckoutCompletePage {

    public CheckoutCompletePage assertElementIsDisplayed() {
        assertTrue(page(CheckoutCompleteSelectors.class).getBackHomeButton().isDisplayed());
        assertTrue(page(CheckoutCompleteSelectors.class).getCompleteImage().isDisplayed());
        return this;
    }
}