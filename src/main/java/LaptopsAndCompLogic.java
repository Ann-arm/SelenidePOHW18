import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LaptopsAndCompLogic {

    SelenideElement categoryLaptops = $(By.xpath("//a[@title = 'Ноутбуки')]"));

    public LaptopsPageLogic openLaptopPage() {
        $(categoryLaptops)
                .shouldBe(Condition.visible)
                .click();
        return page(LaptopsPageLogic.class);
    }
}
