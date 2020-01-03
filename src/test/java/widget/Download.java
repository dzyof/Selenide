package widget;

import com.codeborne.selenide.Condition;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Download {

    public void file() {
        //Через клік.
         $$(".example a").filterBy(Condition.text("text.txt")).first().click();
        // Через давнлоад
     //   $(".example a").shouldHave(Condition.text("Test-data-samples-2.jpg")).download();

    }
}
