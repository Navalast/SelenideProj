package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class InventoryPage {

    @FindBy(id = "//*[@class='shopping_cart_container']")
    private SelenideElement cartElement;

    @FindBy(id = "//*[@class='shopping_cart_container']/a/span")
    private SelenideElement cartCounter;

    @FindBy(id = "//*[@class='btn btn_primary btn_small btn_inventory ']")
    private ElementsCollection addOfElements;

    @FindBy(id = "//*[@class='btn btn_secondary btn_small btn_inventory ']")
    private ElementsCollection removeOfElements;

    public void clickElem(int index) {
        getAddOfElements().get(index).click();
    }

    public void removeClickElem(int index) {
        getRemoveOfElements().get(index).click();
    }
}
