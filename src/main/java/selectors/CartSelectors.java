package selectors;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class CartSelectors {

    @FindBy(xpath = "//*[@class='title']")
    private SelenideElement yourCartElement;

    @FindBy(xpath = "//*[@class='cart_list']")
    private List<SelenideElement> cartLst;

    @FindBy(xpath = "//*[@class='btn btn_secondary btn_small cart_button']")
    private List<SelenideElement> removeButton;

    @FindBy(xpath = "//*[@class='btn btn_action btn_medium checkout_button ']")
    private SelenideElement checkoutButton;
}