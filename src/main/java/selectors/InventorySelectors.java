package selectors;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class InventorySelectors {

    @FindBy(xpath = "//*[@class='shopping_cart_container']")
    private SelenideElement cartElement;

    @FindBy(xpath = "//*[@class='shopping_cart_container']/a/span")
    private SelenideElement cartCounter;

    @FindBy(xpath = "//*[@class='btn btn_primary btn_small btn_inventory ']")
    private ElementsCollection addToCart;

    @FindBy(xpath = "//*[@class='btn btn_secondary btn_small btn_inventory ']")
    private ElementsCollection remove;
}