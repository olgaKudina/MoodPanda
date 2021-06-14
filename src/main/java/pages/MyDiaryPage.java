package pages;
import static com.codeborne.selenide.Selenide.$$;

public class MyDiaryPage{

    public String getBadgeText() {
        return $$(".badge.pull-right").get(0).getText();
    }
}
