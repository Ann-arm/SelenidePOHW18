import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainBasketPageElements {

    SelenideElement productTitleInBasket = $(By.xpath("//a[@class='cart-product__title']"));

}
