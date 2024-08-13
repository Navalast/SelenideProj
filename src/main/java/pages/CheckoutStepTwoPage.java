package pages;

import org.testng.Assert;
import selectors.CheckoutStepTwoSelectors;

import static com.codeborne.selenide.Selenide.page;

public class CheckoutStepTwoPage {

    public CheckoutStepTwoPage assertVisibleText() {
        Assert.assertTrue(page(CheckoutStepTwoSelectors.class).getFinishButton().isDisplayed());

        String regex = "[A-z: $]";
        String itemTotal = page(CheckoutStepTwoSelectors.class).getItemTotal().getText().replaceAll(regex, "");
        double doubleItemTotal = Double.parseDouble(itemTotal);

        String taxTotal = page(CheckoutStepTwoSelectors.class).getTaxTotal().getText().replaceAll(regex, "");
        double doubleTaxTotal = Double.parseDouble(taxTotal);

        String sum = page(CheckoutStepTwoSelectors.class).getTotalSum().getText().replaceAll(regex, "");
        double sumTotal = Double.parseDouble(sum);

        double assertSum = doubleItemTotal + doubleTaxTotal;
        Assert.assertEquals(sumTotal, assertSum);

        return this;
    }

    public CheckoutCompletePage nextStepThree() {
        page(CheckoutStepTwoSelectors.class).getFinishButton().click();
        return new CheckoutCompletePage();
    }
}