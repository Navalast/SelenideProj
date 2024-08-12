package selec;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

@Getter
public class Selectors {

    public Selectors() {
        page(this);
    }

    @FindBy(id = ("user-name"))
    private SelenideElement loginPage;

    @FindBy(id = ("password"))
    private SelenideElement passwordField;

    @FindBy(id = ("login-button"))
    private SelenideElement loginBtn;

    @FindBy(xpath = "//*[@class='shopping_cart_container']")
    private SelenideElement cartElement;

    @FindBy(xpath = "//*[@class='shopping_cart_container']/a/span")
    private SelenideElement cartCounter;

    @FindBy(xpath = "//*[@class='btn btn_primary btn_small btn_inventory ']")
    private ElementsCollection addOfElements;

    @FindBy(xpath = "//*[@class='btn btn_secondary btn_small btn_inventory ']")
    private ElementsCollection removeOfElements;

}