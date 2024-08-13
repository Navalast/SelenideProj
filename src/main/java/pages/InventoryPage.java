package pages;

import com.codeborne.selenide.SelenideElement;
import selectors.InventorySelectors;

import static com.codeborne.selenide.Selenide.page;
import static java.lang.String.valueOf;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class InventoryPage {

    public InventoryPage addElemToCart(int index) {
        page(InventorySelectors.class).getAddToCart().get(index).click();
        return this;
    }

    public InventoryPage removeElemFromCart(int index) {
        page(InventorySelectors.class).getRemove().get(index).click();
        return this;
    }

    public InventoryPage assertCartElementIsVisible(){
        assertTrue(page(InventorySelectors.class).getCartElement().isDisplayed());
        return this;
    }

    public InventoryPage assertRemoveElementIsVisible() {
        assertTrue(page(InventorySelectors.class).getRemove().get(0).isDisplayed());
        assertTrue(page(InventorySelectors.class).getRemove().get(1).isDisplayed());
        int count = page(InventorySelectors.class).getRemove().size();
        String counter = valueOf(count);
        assertEquals(counter, page(InventorySelectors.class).getCartCounter().getText());
        return this;
    }

    public InventoryPage assertRemoveClickElement() {
        for (SelenideElement element: page(InventorySelectors.class).getAddToCart()) {
            assertTrue(element.isEnabled());
        }
        return this;
    }

    public CartPage openCart() {
        page(InventorySelectors.class).getCartElement().click();
        return new CartPage();
    }
}