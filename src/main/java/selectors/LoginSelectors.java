package selectors;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginSelectors {

    @FindBy(id = ("user-name"))
    private SelenideElement loginPage;

    @FindBy(id = ("password"))
    private SelenideElement passwordField;

    @FindBy(id = ("login-button"))
    private SelenideElement loginBtn;
}