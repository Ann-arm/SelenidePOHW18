import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic {

    SelenideElement laptopAndCompSection = $(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));

    public LaptopsAndCompLogic openLaptopAndCompPage() {
        $(laptopAndCompSection).click();
        return page(LaptopsAndCompLogic.class);
    }
}
