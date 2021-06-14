package pages;
import static com.codeborne.selenide.Selenide.$;
public class MoodUpdatedModalPage{

    public static final String GO_TO_MY_DIARY_BUTTON_CSS = ".ButtonMyDiary";
    public static final String URGENT_LINK_CSS =  "a[href='/urgent']";
    public static final String HOW_TO_BECOME_PATRON_BUTTON_CSS = ".btn-xss";
    public static String HOW_TO_BECOME_PATRON_INSTRUCTION_CSS = ".media.graph";

    public MyDiaryPage clickGoToMyDiaryButton(){
        $(GO_TO_MY_DIARY_BUTTON_CSS).click();
        return new MyDiaryPage();
    }

    public UrgentPage urgentHelpLink(){
        $(URGENT_LINK_CSS).click();
        return new UrgentPage();
    }

    public AccountUpgradePage howBecomePatronInstruction(){
        $(HOW_TO_BECOME_PATRON_BUTTON_CSS).click();
        return new AccountUpgradePage();
    }
}
