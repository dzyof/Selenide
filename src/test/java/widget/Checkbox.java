package widget;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$;


public class Checkbox {

    ElementsCollection collection =  $$("#checkboxes input");

    public void checkIn() {
    //   $("#checkboxes input").shouldHave(text("checkbox 1")).parent().click();
       //$("#checkboxes input").shouldHave(type("checkbox")).click();
       $$("#checkboxes input").first().click();
       // Selenide.sleep(3000);
    }

    public void checkStateAll() {

        for (int i = 0; i < collection.size(); i++) {

            collection.get(i).shouldBe(checked);
            //     System.out.println(collection.get(i));
        }
        Selenide.sleep(3000);
    }


    public void checkStateAll( boolean status) {

        if ( status ){
            for (int i=0; i < collection.size(); i++)
            {
                collection.get(i).shouldBe(checked);
            }
        }
        else
            for (int i=0; i < collection.size(); i++)
            {
                collection.get(i).shouldNot(checked);
            }
    }

}
