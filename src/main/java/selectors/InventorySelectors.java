package selectors;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class InventorySelectors {

    @FindBy(id = "shopping_cart_container")
    private SelenideElement cartElement;

    @FindBy(xpath = "//div[@id='shopping_cart_container']//span")
    private SelenideElement cartCounter;

    @FindBy(xpath = "//button[text() = 'Add to cart']")
    private ElementsCollection addToCart;

    @FindBy(xpath = "//button[text() = 'Remove']")
    private ElementsCollection remove;
}