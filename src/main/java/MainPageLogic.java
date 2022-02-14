import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic {
//    Открыть https://rozetka.com.ua/
//    Перейти в раздел «Компьютеры и ноутбуки»
//    Перейти в раздел « Ноутбуки»
//    Добавить первый товар в корзину
//    Проверить что в корзину добавился один товар
//    Перейти в корзину и проверить, что добавился правильный товар

    SelenideElement laptopAndCompSection = $(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));

    public LaptopsAndCompLogic openLaptopAndCompPage() {
        $(laptopAndCompSection).click();
        return page(LaptopsAndCompLogic.class);
    }
}
