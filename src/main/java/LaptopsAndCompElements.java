import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LaptopsAndCompElements {
    SelenideElement categoryLaptops = $(By.xpath("//a[contains(@class,'tile-cats__heading') and contains(text(),'Ноутбуки')]"));

}
