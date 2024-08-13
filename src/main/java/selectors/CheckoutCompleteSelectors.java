package selectors;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class CheckoutCompleteSelectors {

    @FindBy(id = "back-to-products")
    private SelenideElement backHomeButton;

    @FindBy(css = ".pony_express")
    private SelenideElement completeImage;
}