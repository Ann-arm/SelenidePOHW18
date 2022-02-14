import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPageElements {
    SelenideElement laptopAndCompSection = $(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));

}
