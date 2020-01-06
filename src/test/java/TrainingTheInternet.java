import com.codeborne.selenide.Selenide;


import com.codeborne.selenide.commands.Hover;
import org.junit.Before;
import org.junit.Test;
import widget.*;

import java.io.FileNotFoundException;
import java.util.stream.Stream;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;


public class TrainingTheInternet extends BaseClass{

    @Before
    public void clearCache() {
        clearBrowserCache();
    }

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
    public  void  createTestDownload() throws FileNotFoundException {
        Download download  =  new Download();
        this.open("/download");

        download.file();
    }

    @Test
    public void  createTestUpload(){
        Upload upload = new Upload();
        this.open("/upload");
        upload.uploadByName("build/reports/tests/1578051068131.0.png");
    }

    //@Test
    public  void  createTestsSlider(){

        Sliders slider = new Sliders();
        this.open("/horizontal_slider");
        slider.maxValue();
        Selenide.sleep(3000);

    }

    @Test
    public  void  createTestLogin(){
        LoginPage page = new LoginPage();
        this.open("/login");

        page.login(loginn, password);
        page.logout(loginn ,  password);
    }

    @Test
    public void createTestHover(){
        ItemHover hover = new ItemHover();
        this.open("/hovers");

        hover.in();
        hover.inAllElements();
        hover.noEfect();
    }
    @Test
    public void createTestJQMenu(){
        JQMenu menu = new JQMenu();
        this.open("/jqueryui/menu");

        menu.backHome();
    }

}
