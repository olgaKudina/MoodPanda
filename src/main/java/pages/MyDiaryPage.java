package pages;
import static com.codeborne.selenide.Selenide.$$;

public class MyDiaryPage implements IConstants{

    public String getText() {
        return $$(".badge.pull-right").get(0).getText();
    }
}
