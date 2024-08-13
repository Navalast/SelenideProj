package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import selectors.InventorySelectors;

import static com.codeborne.selenide.Selenide.page;
import static java.lang.String.*;
import static org.testng.Assert.*;

@Getter
public class InventoryPage {

    public InventoryPage clickElem(int index) {
        page(InventorySelectors.class).getAddOfElements().get(index).click();
        return this;
    }

    public InventoryPage removeClickElem(int index) {
        page(InventorySelectors.class).getRemoveOfElements().get(index).click();
        return this;
    }

    public InventoryPage assertCartElementIsVisible(){
        assertTrue(page(InventorySelectors.class).getCartElement().isDisplayed());
        return this;
    }

    public InventoryPage assertRemoveElementIsVisible() {
        assertTrue(page(InventorySelectors.class).getRemoveOfElements().get(0).isDisplayed());
        assertTrue(page(InventorySelectors.class).getRemoveOfElements().get(1).isDisplayed());
        String counter = valueOf(page(InventorySelectors.class).getRemoveOfElements().size());
        assertEquals(counter, page(InventorySelectors.class).getCartCounter().getText());
        return this;
    }

    public InventoryPage assertRemoveClickElement() {
        for (WebElement element: page(InventorySelectors.class).getAddOfElements()) {
            assertTrue(element.isEnabled());
        }
        return this;
    }

    public CartPage openCart() {
        page(InventorySelectors.class).getCartElement().click();
        return new CartPage();
    }
}