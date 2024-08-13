package selectors;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class CartSelectors {

    @FindBy(xpath = "//span[@class='title']")
    private SelenideElement yourCartElement;

    @FindBy(xpath = "//*[@class='cart_list']")
    private ElementsCollection cartLst;

    @FindBy(xpath = "//button[text() = 'Remove']")
    private ElementsCollection removeButton;

    @FindBy(xpath = "//button[text() = 'Checkout']")
    private SelenideElement checkoutButton;
}