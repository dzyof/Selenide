import com.codeborne.selenide.Selenide;
import org.junit.Test;
import widget.*;

import java.util.stream.Stream;


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
        //checkbox.checkStateAll(true);
    }

    @Test
    public  void  createTestDropdown(){
        Dropdown dropdown  =  new  Dropdown();
        this.open("/dropdown");

        dropdown.haveOption();

        //Можливий вибір по значеню і тексту
        dropdown.selectVal("1");
    //    dropdown.selectText("Option 2");
    }

    @Test
    public  void  createTestDownload(){
        Download download  =  new Download();
        this.open("/download");

        download.file();
    }

    @Test
    public void  createTestUpload(){
        Upload upload = new Upload();
        this.open("/upload");

        upload.uploadByName("build/reports/tests/1578051068131.0.png");

        Selenide.sleep(3000);
    }

}
