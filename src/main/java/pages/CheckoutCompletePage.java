package pages;

import org.testng.Assert;
import selectors.CheckoutCompleteSelectors;

import static com.codeborne.selenide.Selenide.page;

public class CheckoutCompletePage {

    public CheckoutCompletePage assertElementIsDisplayed() {
        Assert.assertTrue(page(CheckoutCompleteSelectors.class).getBackHomeButton().isDisplayed());
        Assert.assertTrue(page(CheckoutCompleteSelectors.class).getCompleteImage().isDisplayed());
        return this;
    }
}