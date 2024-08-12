package pages;

import lombok.Getter;
import selec.Selectors;

@Getter
public class InventoryPage {

    private final Selectors selectors = new Selectors();

    public void clickElem(int index) {
        selectors.getAddOfElements().get(index).click();
    }

    public void removeClickElem(int index) {
        selectors.getRemoveOfElements().get(index).click();
    }
}