import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic extends MainPageElements{


    public LaptopsAndCompLogic openLaptopAndCompPage(SelenideElement locator) {
        locator.click();
        return page(LaptopsAndCompLogic.class);
    }
}
