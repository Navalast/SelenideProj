package selectors;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class CheckoutStepTwoSelectors {

    @FindBy(id = "finish")
    private SelenideElement finishButton;

    @FindBy(css = ".summary_subtotal_label")
    private SelenideElement itemTotal;

    @FindBy(css = ".summary_tax_label")
    private SelenideElement taxTotal;

    @FindBy(css = ".summary_total_label")
    private SelenideElement totalSum;
}