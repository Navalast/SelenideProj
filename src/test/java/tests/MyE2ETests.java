package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import setup.TestBase;

import static core.Start.start;

public class MyE2ETests extends TestBase  {

    @Test
    @Description("E2E Тест с добавлением товара в корзину и оформлением покупки")
    public void e2eTest() {
        start()
                .assertCartElementIsVisible()
                .addElemToCart(0)
                .addElemToCart(1)
                .assertRemoveElementIsVisible()
                .assertRemoveClickElement()
                .openCart()
                .assertTextAndElemIsVisible()
                .clickRemoveBtn(0)
                .assertGetCartListLength(1)
                .assertCheckoutBtnIsVisible()
                .goCheckout()
                .checkFieldOnPage()
                .insertInfoAboutPerson("Tony", "SkinnyMan", "2281337")
                .nextStepTwo()
                .assertVisibleText()
                .nextStepThree()
                .assertElementIsDisplayed();
    }

    @Test
    @Description("Тест добавление и удаления товара из корзины")
    public void addAndRemoveElementTest() {
        start()
                .assertCartElementIsVisible()
                .addElemToCart(0)
                .addElemToCart(1)
                .assertRemoveElementIsVisible()
                .removeElemFromCart(1)
                .removeElemFromCart(0)
                .assertRemoveClickElement();
    }
}