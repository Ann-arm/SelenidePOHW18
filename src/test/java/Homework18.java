import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;

public class Homework18 {

    @BeforeTest
    public void before() {
        Configuration.startMaximized = true;
        open("https://rozetka.com.ua/");
    }

    @Test
    public void test() {
        LaptopsPageLogic laptopsPageLogic = new LaptopsPageLogic();

        new MainPageLogic().openLaptopAndCompPage();

        new LaptopsAndCompLogic().openLaptopPage();

        String productTitleTextFromLaptopsPage = laptopsPageLogic.productTitleText();

        laptopsPageLogic.addProductToBasket();

        String productNumberTextFromLaptopsPage = laptopsPageLogic.productNumberText();

        assertEquals(productNumberTextFromLaptopsPage, "1", "Product isn't added");

        laptopsPageLogic.openBasketPage();

        String productTitleTextInBasketFromMainBasketPage = new MainBasketPage().productTitleTextInBasket();

        assertEquals(productTitleTextFromLaptopsPage, productTitleTextInBasketFromMainBasketPage, "Incorrectly product is added to basket");
    }
}
