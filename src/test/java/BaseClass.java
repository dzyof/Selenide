import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public class BaseClass {

    {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
    }

    public void open( String url ) {
        Selenide.open(url);
    }






}
