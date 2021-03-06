package pages;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage{

    public static final String EMAIL_INPUT_CSS = "#ContentPlaceHolderContent_TextBoxEmail";
    public static final String PASSWORD_INPUT_CSS = "#ContentPlaceHolderContent_TextBoxPassword";
    public static final String LOGINBUTTON_CSS = "#ContentPlaceHolderContent_ButtonLogin";
    public static final String LOGIN_URL = "https://moodpanda.com/Login/";

    public LoginPage openPage(){
        open(LOGIN_URL);
        return this;
    }

    public FeedPage login(String email, String password){
        $(EMAIL_INPUT_CSS).sendKeys(email);
        $(PASSWORD_INPUT_CSS).sendKeys(password);
        $(LOGINBUTTON_CSS).click();
        return new FeedPage();
    }
}
