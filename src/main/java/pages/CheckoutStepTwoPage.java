package pages;

import io.qameta.allure.Step;
import selectors.CheckoutStepTwoSelectors;

import static com.codeborne.selenide.Selenide.page;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CheckoutStepTwoPage {

    @Step("Проверка на корректное отображение суммы и налога")
    public CheckoutStepTwoPage assertVisibleText() {
        assertTrue(page(CheckoutStepTwoSelectors.class).getFinishButton().isDisplayed());

        String regex = "[A-z: $]";
        String itemTotal = page(CheckoutStepTwoSelectors.class).getItemTotal().getText().replaceAll(regex, "");
        double doubleItemTotal = Double.parseDouble(itemTotal);

        String taxTotal = page(CheckoutStepTwoSelectors.class).getTaxTotal().getText().replaceAll(regex, "");
        double doubleTaxTotal = Double.parseDouble(taxTotal);

        String sum = page(CheckoutStepTwoSelectors.class).getTotalSum().getText().replaceAll(regex, "");
        double sumTotal = Double.parseDouble(sum);

        double assertSum = doubleItemTotal + doubleTaxTotal;
        assertEquals(sumTotal, assertSum);

        return this;
    }

    @Step("Перейти на третий этап оформления заказа")
    public CheckoutCompletePage nextStepThree() {
        page(CheckoutStepTwoSelectors.class).getFinishButton().click();
        return new CheckoutCompletePage();
    }
}