package selectors;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class CheckoutStepTwoSelectors {

    @FindBy(xpath = "//*[@class='btn btn_action btn_medium cart_button']")
    private WebElement finishButton;

    @FindBy(xpath = "//*[@class='summary_subtotal_label']")
    private WebElement itemTotal;

    @FindBy(xpath = "//*[@class='summary_tax_label']")
    private WebElement taxTotal;

    @FindBy(xpath = "//*[@class='summary_total_label']")
    private WebElement totalSum;
}