import com.codeborne.selenide.Selenide;
import org.junit.Test;
import widget.Checkbox;
import widget.Element;


public class TrainingTheInternet extends BaseClass{
    @Test
    public void createTestTheAddDel(){

        Element element = new Element();

        this.open("/add_remove_elements/");
        element.addElement();
        element.remuveOneElement();
        element.remuveAllElement();
    }

    @Test
    public void createTestTheCheckboxes(){

        Checkbox checkbox = new Checkbox();
        this.open("/checkboxes");

        checkbox.checkIn();
        checkbox.checkStateAll();
        // Також може викликатися з параметрами
        //checkbox.checkStateAll(false);
        //checkbox.checkStateAll(true);
    }

}
