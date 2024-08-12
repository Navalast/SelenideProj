package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class InventoryPage {

    private SelenideElement cartElement = $x("//*[@class='shopping_cart_container']");
    private SelenideElement cartCounter = $x("//*[@class='shopping_cart_container']/a/span");
    private ElementsCollection addOfElements = $$x("//*[@class='btn btn_primary btn_small btn_inventory ']");
    private ElementsCollection removeOfElements = $$x("//*[@class='btn btn_secondary btn_small btn_inventory ']");

    public void clickElem(int index) {
        getAddOfElements().get(index).click();
    }

    public void removeClickElem(int index) {
        getRemoveOfElements().get(index).click();
    }
}
