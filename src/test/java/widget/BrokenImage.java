package widget;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BrokenImage {

    ElementsCollection collection =  $$("img ");

    public void haveSrc() {

        for (int i = 0; i < collection.size(); i++) {

            collection.get(i).shouldHave(Condition.attribute("src")) ;
            System.out.println(collection.get(i).shouldHave(Condition.attribute("src")));

        }

   //     $("img ").shouldHave(Condition.attribute("src")) ;

    }
}
