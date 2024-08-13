package tests;

import org.testng.annotations.Test;
import setup.TestBase;

import static core.Start.start;

public class MyE2ETests extends TestBase {

    @Test
    public void e2eTest() {
        start()
                .assertCartElementIsVisible()
                .addElemToCart(0)
                .addElemToCart(1)
                .assertRemoveElementIsVisible()
                .removeElemFromCart(1)
                .removeElemFromCart(0)
                .assertRemoveClickElement()
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
    public void openCartTest() {
        start()
                .openCart();
    }
}