package widget;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ItemHover {

    ElementsCollection collection =  $$(".figure");

    public void in() {

        collection.first().hover().find(By.className("figcaption")).shouldBe(Condition.visible);

    }

    public void inAllElements() {

        for (int i = 0; i < collection.size(); i++) {

            collection.get(i).hover().find(By.className("figcaption")).shouldBe(Condition.visible);

            //     System.out.println(collection.get(i));
        }

    }

    public void noEfect() {

        this.inAllElements();
        $("h3").hover().find(By.className("figcaption")).shouldBe(hidden);

    }
}
