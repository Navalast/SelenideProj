package selectors;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class CartSelectors {

    @FindBy(xpath = "//*[@class='title']")
    private WebElement yourCartElement;

    @FindBy(xpath = "//*[@class='cart_list']")
    private List<WebElement> cartLst;

    @FindBy(xpath = "//*[@class='btn btn_secondary btn_small cart_button']")
    private List<WebElement> removeButton;

    @FindBy(xpath = "//*[@class='btn btn_action btn_medium checkout_button ']")
    private WebElement checkoutButton;
}