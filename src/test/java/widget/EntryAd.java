package widget;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class EntryAd {
    //TODO зробити зкидання куків і перевірку на перезагрузку
    public void mustBeVisible() {
        Selenide.sleep(2000);
        $(".modal").shouldBe(Condition.visible);
        //$(".modal").waitUntil(Condition.hidden, 2000);


       // $("#modal").shouldNot(Condition.hidden);
    }

   // public void mustBeHiden() {

        //$(".modal-footer p").click();
       // $("h3").click();
       // Selenide.refresh();

      //  Selenide.clearBrowserCookies();
      //  Selenide.sleep(2000);

     // $(".modal").shouldBe(Condition.visible);
    // $(".modal").shouldNot(Condition.visible);
     //shouldNotBe(Condition.visible);


      //  Selenide.sleep(3000);
   // }
}
