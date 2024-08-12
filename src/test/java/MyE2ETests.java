import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;
import selec.Selectors;
import setup.Setup;

public class MyE2ETests extends Setup {

    private final Selectors selectors = new Selectors();

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage();

        loginPage.auth("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage();
        Assert.assertTrue(inventoryPage.getSelectors().getCartElement().isDisplayed());
    }

    @Test(dependsOnMethods = "loginTest")
    public void addAndRemoveInCartTest() {
        InventoryPage inventoryPage = new InventoryPage();

        inventoryPage.clickElem(0);
        inventoryPage.clickElem(1);

        Assert.assertTrue(inventoryPage.getSelectors().getRemoveOfElements().get(0).isDisplayed());
        Assert.assertTrue(inventoryPage.getSelectors().getRemoveOfElements().get(1).isDisplayed());

        int count = 0;
        for (WebElement element : inventoryPage.getSelectors().getRemoveOfElements()) {
            count++;
        }
        String counter = String.valueOf(count);

        Assert.assertTrue(inventoryPage.getSelectors().getCartCounter().getText().contains(counter));

        inventoryPage.removeClickElem(0);
        inventoryPage.removeClickElem(0);

        for (WebElement element: inventoryPage.getSelectors().getAddOfElements()) {
            Assert.assertTrue(element.isEnabled());
        }
    }
}