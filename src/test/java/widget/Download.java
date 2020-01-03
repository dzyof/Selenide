package widget;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Download {

    public void file() throws FileNotFoundException {
        //Через клік. - Зберігає файл в стандартну папку загрузки
        //$$(".example a").filterBy(Condition.text("ObjectivityTestAutomationCSHarpFramework.txt")).first().click();
        // Через давнлоад - зберігає файл в репорти проекта
        $$(".example a").get(0).download();
        //System.out.println($$(".example a").get(0).download());

    }
}
