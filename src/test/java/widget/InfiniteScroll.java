package widget;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class InfiniteScroll {

    public void findByText(String text) {
        $(".jscroll-added").scrollIntoView(text);
        Selenide.sleep(3000);
    }
}
