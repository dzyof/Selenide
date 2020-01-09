package widget;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;

public class Element {

    public void addElement() {
        $(".example button").click();
        $(".added-manually").shouldBe(Condition.visible);
    }

    public void addFiveElement() {
       for (int i = 5; i > 0; i--){
           this.addElement();
       }
        $(".added-manually").click();
        $$(".added-manually").shouldHave(size(5));
    }


    public void remuveAllElement() {
        int length =  $$("#elements .added-manually").size();

        for (int i=0; i < length; i++)
        {
            $(".added-manually").click();
        }
        $("#elements").shouldBe(Condition.empty);
        Selenide.sleep(3000);
    }
}
