package widget;

import com.codeborne.selenide.CollectionCondition;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Dropdown {

    public void haveOption() {
        //dropdown
        $$("#dropdown option").shouldHave(sizeGreaterThan(0));
    }

    public void selectVal(String value) {
        $("#dropdown").selectOptionByValue(value);
        $("#dropdown").shouldHave(value(value)).shouldBe(visible);

    }

    public void selectText(String texts) {
        $("#dropdown").selectOptionContainingText(texts);
        $("#dropdown").shouldHave(text(texts)).shouldBe(visible);
    }
}
