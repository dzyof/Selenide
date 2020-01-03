package widget;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class Upload {
    public void uploadByName(String name) {
        File file =  new File(name);

        $("#file-upload").uploadFile(file);
        $("#file-submit").click();
        $("h3").shouldHave(Condition.text("File Uploaded!"));

        //TODO винести в окрему функцію розбивку строки
        int index = name.lastIndexOf("/");
        String lastString = name.substring(index +1);
        $("#uploaded-files").shouldHave(Condition.text(lastString));
    }

    //public void lastElementInString(char charset , String string){
    //    int index = string.lastIndexOf(charset);
    //    String lastString = string.substring(index +1);
    //    System.out.println(lastString);
    //}
}


