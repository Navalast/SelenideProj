package selectors;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class CheckoutStepOneSelectors {

    @FindBy(id = "cancel")
    private SelenideElement cancelButton;

    @FindBy(id = "continue")
    private SelenideElement submitButton;

    @FindBy(id = "first-name")
    private SelenideElement firstName;

    @FindBy(id = "last-name")
    private SelenideElement lastName;

    @FindBy(id = "postal-code")
    private SelenideElement postalCode;
}