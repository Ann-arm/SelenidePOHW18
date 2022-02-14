import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LaptopsPageElements {
    SelenideElement productTitle = $(By.xpath("//span[@class='goods-tile__title']"));
    SelenideElement productBasket = $(By.xpath("//button[contains(@class,'goods-tile__buy-button')]"));
    SelenideElement basketCounter = $(By.xpath("//span[contains(@class,'counter--green')]"));
    SelenideElement mainBasket = $(By.xpath("//button[contains(@class,'header__button--active')]"));
}
