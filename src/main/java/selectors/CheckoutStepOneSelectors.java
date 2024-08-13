package selectors;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class CheckoutStepOneSelectors {

    @FindBy(xpath = "//*[@class='btn btn_secondary back btn_medium cart_cancel_link']")
    private WebElement cancelButton;

    @FindBy(xpath = "//*[@class='submit-button btn btn_primary cart_button btn_action']")
    private WebElement submitButton;

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(id = "postal-code")
    private WebElement postalCode;
}