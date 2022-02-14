import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
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

        new MainPageLogic().openLaptopAndCompPage(new MainPageElements().laptopAndCompSection);

        new LaptopsAndCompLogic().openLaptopPage(new LaptopsAndCompElements().categoryLaptops);

        String productTitleTextFromLaptopsPage = laptopsPageLogic.productTitleText(new LaptopsPageElements().productTitle);

        laptopsPageLogic.addProductToBasket(new LaptopsPageElements().productBasket);

        String productNumberTextFromLaptopsPage = laptopsPageLogic.productNumberText(new LaptopsPageElements().basketCounter);

        assertEquals(productNumberTextFromLaptopsPage, "1", "Product isn't added");

        laptopsPageLogic.openBasketPage(new LaptopsPageElements().mainBasket);

        String productTitleTextInBasketFromMainBasketPage = new MainBasketPage().productTitleTextInBasket(new LaptopsPageElements().productTitle);

        assertEquals(productTitleTextFromLaptopsPage, productTitleTextInBasketFromMainBasketPage, "Incorrectly product is added to basket");
    }
}
