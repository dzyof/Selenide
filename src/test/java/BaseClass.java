import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public class BaseClass {

    {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
    }

    public void open( String url ) {
        Selenide.open(url);
    }

    public void lastElementInString (char charset , String string  ){
        int index = string.lastIndexOf(charset);
        String lastString = string.substring(index +1);

        System.out.println(lastString);
    }






}
