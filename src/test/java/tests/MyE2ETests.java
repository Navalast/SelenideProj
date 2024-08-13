package tests;

import org.testng.annotations.Test;
import pages.*;
import setup.Setup;

public class MyE2ETests extends Setup {

    @Test
    public void loginTest() {
        new LoginPage()
                .auth("standard_user", "secret_sauce")
                .assertCartElementIsVisible();
    }

    @Test(dependsOnMethods = "loginTest")
    public void addAndRemoveInCartTest() {
        new InventoryPage()
                .clickElem(0)
                .clickElem(1)
                .assertRemoveElementIsVisible()
                .removeClickElem(0)
                .removeClickElem(0)
                .assertRemoveClickElement();
    }

    @Test(dependsOnMethods = "addAndRemoveInCartTest")
    public void shareInCartTest() {
        new InventoryPage()
                .clickElem(0)
                .clickElem(1)
                .assertRemoveElementIsVisible()
                .assertRemoveClickElement()
                .openCart();

        new CartPage()
                .assertTextAndElemIsVisible()
                .clickRemoveBtn(0)
                .assertGetCartListLength()
                .assertCheckoutBtnIsVisible()
                .nextStep();
    }

    @Test(dependsOnMethods = "shareInCartTest")
    public void checkoutInfoTest() {
        new CheckoutStepOnePage()
                .checkFieldOnPage()
                .insertInfo("Tony", "SkinnyMan", "2281337")
                .nextStep();
    }

    @Test(dependsOnMethods = "checkoutInfoTest")
    public void checkoutOverviewTest() {
        new CheckoutStepTwoPage()
                .assertVisibleText()
                .nextStep();
    }

    @Test(dependsOnMethods = "checkoutOverviewTest")
    public void checkoutCompleteTest() {
        new CheckoutCompletePage()
                .assertElementIsDisplayed();
    }
}