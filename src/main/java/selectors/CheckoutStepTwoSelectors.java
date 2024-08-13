package selectors;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class CheckoutStepTwoSelectors {

    @FindBy(xpath = "//*[@class='btn btn_action btn_medium cart_button']")
    private SelenideElement finishButton;

    @FindBy(xpath = "//*[@class='summary_subtotal_label']")
    private SelenideElement itemTotal;

    @FindBy(xpath = "//*[@class='summary_tax_label']")
    private SelenideElement taxTotal;

    @FindBy(xpath = "//*[@class='summary_total_label']")
    private SelenideElement totalSum;
}