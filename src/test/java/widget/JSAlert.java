package widget;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class JSAlert {

    ElementsCollection collection =   $$(".example ul li button");

    public void open() {
        collection.filterBy(Condition.matchText("JS Alert")).first().click();
        Selenide.confirm();
        $("#result").shouldHave(Condition.matchText("ssfuly clicked an alert"));
    }

    public void confirm(boolean action) {
        collection.filterBy(Condition.matchText("JS Confirm")).first().click();

        if(action){
            Selenide.confirm();
            $("#result").shouldHave(Condition.matchText("You clicked: Ok"));
        }
        else{
            Selenide.dismiss();
            $("#result").shouldHave(Condition.matchText("You clicked: Cancel"));
        }
        // TODO переробити на тернарний оператор
       // action? Selenide.confirm() : Selenide.dismiss();
    }

    public void prompt( String string ) {
        collection.filterBy(Condition.matchText("Click for JS Prompt")).first().click();
        Selenide.prompt(string);
        $("#result").shouldHave(Condition.matchText(string));
    }
}
