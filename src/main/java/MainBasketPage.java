import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainBasketPage {

    SelenideElement productTitleInBasket = $(By.xpath("//a[@class='cart-product__title']"));

    public String productTitleTextInBasket() {
        String titleText = $(productTitleInBasket).attr("outerText");
        return titleText;
    }
}
