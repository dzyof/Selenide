package widget;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class JSAlert {

    public void open() {
        $$(".example ul li button").filterBy(Condition.matchText("JS Alert")).first().click();
        Selenide.confirm();
        $("#result").shouldHave(Condition.matchText("ssfuly clicked an alert"));
    }

    public void confirm(boolean action) {
        $$(".example ul li button").filterBy(Condition.matchText("JS Confirm")).first().click();

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
        Selenide.sleep(2000);
    }
}
