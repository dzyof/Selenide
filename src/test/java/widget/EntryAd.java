package widget;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class EntryAd {

    public void mustBeVisible() {
        $(".modal").shouldBe(Condition.visible);
    }

    public void mustBeHiden() {

        $(".modal .modal-footer").click();

        Selenide.refresh();
        Selenide.sleep(2000);
        $(".modal").shouldNotBe(Condition.visible);
        Selenide.sleep(2000);
    }
}
