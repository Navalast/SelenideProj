package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import selectors.InventorySelectors;

import static com.codeborne.selenide.Selenide.page;

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
        Assert.assertTrue(page(InventorySelectors.class).getCartElement().isDisplayed());
        return this;
    }

    public InventoryPage assertRemoveElementIsVisible() {
        Assert.assertTrue(page(InventorySelectors.class).getRemoveOfElements().get(0).isDisplayed());
        Assert.assertTrue(page(InventorySelectors.class).getRemoveOfElements().get(1).isDisplayed());

        int count = 0;
        for (WebElement element : page(InventorySelectors.class).getRemoveOfElements()) {
            count++;
        }
        String counter = String.valueOf(count);

        Assert.assertTrue(page(InventorySelectors.class).getCartCounter().getText().contains(counter));
        return this;
    }

    public InventoryPage assertRemoveClickElement() {
        for (WebElement element: page(InventorySelectors.class).getAddOfElements()) {
            Assert.assertTrue(element.isEnabled());
        }
        return this;
    }

    public CartPage openCart() {
        page(InventorySelectors.class).getCartElement().click();
        return new CartPage();
    }
}