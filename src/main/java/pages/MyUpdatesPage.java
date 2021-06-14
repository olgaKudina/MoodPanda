package pages;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MyUpdatesPage{

    public static final String DROPDOWN_CSS = ".navbar-hidesmall";
    public static final String MY_UPDATES_VALUE_IN_DROPDOWN_CSS = "a[href *='/Feed/?Me=1']";
    public static final String INPUT_REPLY_CSS = ".InputReply";
    public static final String INPUT_REPLY_BUTTON_CSS = ".btn-sm.ButtonReply.mcr1";
    public static final String MY_UPDATES_SECTION_CSS = ".media-body-comment-tag";

    public void addMyUpdates(String text) {
        $$(DROPDOWN_CSS).findBy(text("Me")).click();
        $(MY_UPDATES_VALUE_IN_DROPDOWN_CSS).click();
        $(INPUT_REPLY_CSS).sendKeys(text);
        $(INPUT_REPLY_BUTTON_CSS).click();
    }
}
