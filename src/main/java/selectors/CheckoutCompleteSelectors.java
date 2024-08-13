package selectors;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class CheckoutCompleteSelectors {

    @FindBy(xpath = "//*[@class='btn btn_primary btn_small']")
    private SelenideElement backHomeButton;

    @FindBy(xpath = "//*[@class='pony_express']")
    private SelenideElement completeImage;
}