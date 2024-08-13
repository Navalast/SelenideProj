package pages;

import selectors.CheckoutStepOneSelectors;

import static com.codeborne.selenide.Selenide.page;
import static org.testng.Assert.assertTrue;

public class CheckoutStepOnePage {

    public CheckoutStepOnePage checkFieldOnPage() {
        assertTrue(page(CheckoutStepOneSelectors.class).getCancelButton().isDisplayed());
        assertTrue(page(CheckoutStepOneSelectors.class).getSubmitButton().isDisplayed());
        assertTrue(page(CheckoutStepOneSelectors.class).getFirstName().isDisplayed());
        assertTrue(page(CheckoutStepOneSelectors.class).getLastName().isDisplayed());
        assertTrue(page(CheckoutStepOneSelectors.class).getPostalCode().isDisplayed());
        return this;
    }

    public CheckoutStepOnePage insertInfoAboutPerson(String firstname, String lastname, String code) {
        page(CheckoutStepOneSelectors.class).getFirstName().sendKeys(firstname);
        page(CheckoutStepOneSelectors.class).getLastName().sendKeys(lastname);
        page(CheckoutStepOneSelectors.class).getPostalCode().sendKeys(code);
        return this;
    }

    public CheckoutStepTwoPage nextStepTwo() {
        page(CheckoutStepOneSelectors.class).getSubmitButton().click();
        return new CheckoutStepTwoPage();
    }
}