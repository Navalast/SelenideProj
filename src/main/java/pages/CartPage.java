package pages;

import com.codeborne.selenide.SelenideElement;
import selectors.CartSelectors;

import static com.codeborne.selenide.Selenide.page;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CartPage {

    public CartPage clickRemoveBtn(int index) {
        page(CartSelectors.class).getRemoveButton().get(index).click();
        return this;
    }

    public CartPage assertTextAndElemIsVisible() {
        assertEquals(page(CartSelectors.class).getYourCartElement().getText(), "Your Cart");
        for (SelenideElement elem : page(CartSelectors.class).getCartLst()) {
            assertTrue(elem.isDisplayed());
        }
        return this;
    }

    public CartPage assertGetCartListLength() {
        int len = page(CartSelectors.class).getCartLst().size();
        assertEquals(len, page(CartSelectors.class).getCartLst().size());
        return this;
    }

    public CartPage assertCheckoutBtnIsVisible() {
        assertTrue(page(CartSelectors.class).getCheckoutButton().isDisplayed());
        assertEquals(page(CartSelectors.class).getCheckoutButton().getText(), "Checkout");
        return this;
    }

    public CheckoutStepOnePage goCheckout() {
        page(CartSelectors.class).getCheckoutButton().click();
        return new CheckoutStepOnePage();
    }
}