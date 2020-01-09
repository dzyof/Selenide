import com.codeborne.selenide.Selenide;


import com.codeborne.selenide.commands.Hover;
import org.junit.Before;
import org.junit.Test;
import widget.*;

import java.io.FileNotFoundException;


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
        element.addFiveElement();
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
    public void createTestJQMenu() throws FileNotFoundException{
        JQMenu menu = new JQMenu();

        this.open("/jqueryui/menu");
        menu.backHome();

        this.open("/jqueryui/menu");
        menu.downloadExcel();
    }

    @Test
    public void createTestJSAlert(){
        JSAlert jsalert = new JSAlert();

        this.open("/javascript_alerts");


       // Можливий визов з двома параметрами
       jsalert.confirm(true);
       jsalert.confirm(false);

       jsalert.prompt("123 - test");

    }

    @Test
    public  void createTestBrokenImage(){
        BrokenImage brokenImage = new BrokenImage();

        this.open("/broken_images");
        brokenImage.haveSrc();

    }

    @Test
    public  void  createTestEntryAd(){
        EntryAd modal = new EntryAd();

        this.open("/entry_ad");
        modal.mustBeVisible();
     //   modal.mustBeHiden();

    }


}
