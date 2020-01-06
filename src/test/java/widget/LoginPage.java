package widget;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private void enterData (String login, String password) {
        $("#username").setValue(login);
        $("#password").setValue(password);
        $(".radius").click();
    }

    public void login(String login, String password) {
        this.enterData(login, password);
        $(".success").shouldHave(Condition.text("You logged into a secure area!"));
    }

    public void logout(String login, String password) {
        $(".secondary").click();
        $(".success").shouldHave(Condition.text("You logged out of the secure area!"));
    }
}
