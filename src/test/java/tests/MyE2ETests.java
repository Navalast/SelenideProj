package tests;

import org.testng.annotations.Test;
import setup.Setup;

import static core.Start.start;

public class MyE2ETests extends Setup {

    @Test
    public void e2eTest() {
        start()
                .assertCartElementIsVisible()
                .clickElem(0)
                .clickElem(1)
                .assertRemoveElementIsVisible()
                .removeClickElem(0)
                .removeClickElem(0)
                .assertRemoveClickElement()
                .clickElem(0)
                .clickElem(1)
                .assertRemoveElementIsVisible()
                .assertRemoveClickElement()
                .openCart()
                .assertTextAndElemIsVisible()
                .clickRemoveBtn(0)
                .assertGetCartListLength()
                .assertCheckoutBtnIsVisible()
                .nextStep()
                .checkFieldOnPage()
                .insertInfo("Tony", "SkinnyMan", "2281337")
                .nextStep()
                .assertVisibleText()
                .nextStep()
                .assertElementIsDisplayed();

    }

    @Test
    public void openTest() {
        start()
                .openCart();
    }
}