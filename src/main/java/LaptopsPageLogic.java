import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LaptopsPageLogic extends LaptopsPageElements{

    public String productTitleText(SelenideElement locator) {
        String titleText = locator.attr("outerText");
        return titleText;
    }

    public LaptopsPageLogic addProductToBasket(SelenideElement locator) {
        locator.click();
        return this;
    }

    public String productNumberText(SelenideElement locator) {
        String numberText = locator.getText();
        return numberText;
    }

    public MainBasketPage openBasketPage(SelenideElement locator) {
        locator.click();
        return page(MainBasketPage.class);
    }
}
