import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LaptopsAndCompLogic extends LaptopsAndCompElements {

    public LaptopsPageLogic openLaptopPage(SelenideElement locator) {
        locator.shouldBe(Condition.visible)
                .click();
        return page(LaptopsPageLogic.class);
    }
}
