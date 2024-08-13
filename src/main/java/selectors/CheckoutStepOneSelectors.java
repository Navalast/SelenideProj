package selectors;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class CheckoutStepOneSelectors {

    @FindBy(xpath = "//*[@class='btn btn_secondary back btn_medium cart_cancel_link']")
    private SelenideElement cancelButton;

    @FindBy(xpath = "//*[@class='submit-button btn btn_primary cart_button btn_action']")
    private SelenideElement submitButton;

    @FindBy(id = "first-name")
    private SelenideElement firstName;

    @FindBy(id = "last-name")
    private SelenideElement lastName;

    @FindBy(id = "postal-code")
    private SelenideElement postalCode;
}