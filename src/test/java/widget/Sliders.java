package widget;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class Sliders {
    public void maxValue(){
        Selenide.sleep(3000);
        $(".sliderContainer input").click();

        executeJavaScript( "alert(123); " );
     //   $(".sliderContainer input").setValue("5");
        Selenide.sleep(3000);


    }
}
