package pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import selectors.CartSelectors;

import static com.codeborne.selenide.Selenide.page;

public class CartPage {

    public CartPage clickRemoveBtn(int index) {
        page(CartSelectors.class).getRemoveButton().get(index).click();
        return this;
    }

    public CartPage assertTextAndElemIsVisible() {
        Assert.assertTrue(page(CartSelectors.class).getYourCartElement().getText().contains("Your Cart"));
        for (SelenideElement elem : page(CartSelectors.class).getCartLst()) {
            Assert.assertTrue(elem.isDisplayed());
        }
        return this;
    }

    public CartPage assertGetCartListLength() {
        int len = page(CartSelectors.class).getCartLst().size();
        Assert.assertEquals(len, 1);
        return this;
    }

    public CartPage assertCheckoutBtnIsVisible() {
        Assert.assertTrue(page(CartSelectors.class).getCheckoutButton().isDisplayed());
        return this;
    }

    public CheckoutStepOnePage nextStep() {
        page(CartSelectors.class).getCheckoutButton().click();
        return new CheckoutStepOnePage();
    }
}