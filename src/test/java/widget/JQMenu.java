package widget;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;

public class JQMenu {

    public void backHome() {
        $("#ui-id-3").shouldBe(Condition.visible).hover().find(By.id("ui-id-8")).click();
        $(".description ul a").shouldHave(Condition.text("Menu"));
        //TODO можливо зробити  перевірку по урлу
        //String urlPage =  url();
        //System.out.println(urlPage);

    }
}
