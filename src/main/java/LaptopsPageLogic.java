import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LaptopsPageLogic {

    SelenideElement productTitle = $(By.xpath("//span[@class='goods-tile__title']"));
    SelenideElement productBasket = $(By.xpath("//button[contains(@class,'goods-tile__buy-button')]"));
    SelenideElement basketCounter = $(By.xpath("//span[contains(@class,'counter--green')]"));
    SelenideElement mainBasket = $(By.xpath("//button[contains(@class,'header__button--active')]"));

    public String productTitleText() {
        String titleText = $(productTitle).attr("outerText");
        return titleText;
    }

    public LaptopsPageLogic addProductToBasket() {
        $(productBasket).click();
        return this;
    }

    public String productNumberText() {
        String numberText = $(basketCounter).getText();
        return numberText;
    }

    public MainBasketPage openBasketPage() {
        $(mainBasket).click();
        return page(MainBasketPage.class);
    }
}
