package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import selectors.CartSelectors;

import static com.codeborne.selenide.Selenide.page;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CartPage {

    @Step("Нажать на кнопку Remove")
    public CartPage clickRemoveBtn(int index) {
        page(CartSelectors.class).getRemoveButton().get(index).click();
        return this;
    }

    @Step("Проверка, что надпись Your Cart и элементы добавленные в корзину видны")
    public CartPage assertTextAndElemIsVisible() {
        assertEquals(page(CartSelectors.class).getYourCartElement().getText(), "Your Cart");
        for (SelenideElement elem : page(CartSelectors.class).getCartLst()) {
            assertTrue(elem.isDisplayed());
        }
        return this;
    }

    @Step("Проверка размера корзины")
    public CartPage assertGetCartListLength(int size) {
        assertEquals(size, page(CartSelectors.class).getCartLst().size());
        return this;
    }

    @Step("Проверка на видимость кнопку Checkout")
    public CartPage assertCheckoutBtnIsVisible() {
        assertTrue(page(CartSelectors.class).getCheckoutButton().isDisplayed());
        assertEquals(page(CartSelectors.class).getCheckoutButton().getText(), "Checkout");
        return this;
    }

    @Step("Переход на страницу проверки")
    public CheckoutStepOnePage goCheckout() {
        page(CartSelectors.class).getCheckoutButton().click();
        return new CheckoutStepOnePage();
    }
}