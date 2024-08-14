package pages;

import io.qameta.allure.Step;
import selectors.CheckoutStepOneSelectors;

import static com.codeborne.selenide.Selenide.page;
import static org.testng.Assert.assertTrue;

public class CheckoutStepOnePage {

    @Step("Проверить поля в корзине")
    public CheckoutStepOnePage checkFieldOnPage() {
        assertTrue(page(CheckoutStepOneSelectors.class).getCancelButton().isDisplayed());
        assertTrue(page(CheckoutStepOneSelectors.class).getSubmitButton().isDisplayed());
        assertTrue(page(CheckoutStepOneSelectors.class).getFirstName().isDisplayed());
        assertTrue(page(CheckoutStepOneSelectors.class).getLastName().isDisplayed());
        assertTrue(page(CheckoutStepOneSelectors.class).getPostalCode().isDisplayed());
        return this;
    }

    @Step("Вписать данные о покупателе")
    public CheckoutStepOnePage insertInfoAboutPerson(String firstname, String lastname, String code) {
        page(CheckoutStepOneSelectors.class).getFirstName().sendKeys(firstname);
        page(CheckoutStepOneSelectors.class).getLastName().sendKeys(lastname);
        page(CheckoutStepOneSelectors.class).getPostalCode().sendKeys(code);
        return this;
    }

    @Step("Перейти на второй пункт оформления заказа")
    public CheckoutStepTwoPage nextStepTwo() {
        page(CheckoutStepOneSelectors.class).getSubmitButton().click();
        return new CheckoutStepTwoPage();
    }
}