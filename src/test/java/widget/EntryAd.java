package widget;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class EntryAd {
    //TODO зробити зкидання куків і перевірку на перезагрузку
    public void firstLoad() {
        Selenide.sleep(2000);
        $(".modal").shouldBe(Condition.visible);
    }

    public void clearCookies() {
        Selenide.sleep(2000);
        $(".modal-footer").click();
        Selenide.clearBrowserCookies();
        Selenide.refresh();
        $(".modal").waitUntil(Condition.visible, 2000).shouldBe(Condition.visible);

    }
}
