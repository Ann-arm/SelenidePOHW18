import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainBasketPage extends MainPageElements {

    public String productTitleTextInBasket(SelenideElement locator) {
        String titleText = locator.attr("outerText");
        return titleText;
    }
}
