package tests;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static pages.MoodUpdatedModalPage.HOW_TO_BECOME_PATRON_INSTRUCTION_CSS;
import static pages.MyUpdatesPage.MY_UPDATES_SECTION_CSS;

public class MoodPandaTest extends BaseTest implements IConstants{

    @Test(description = "Login, update Mood and ensure How to become patron present")
    public void loginTest(){
        loginPage
                .openPage()
                .login(LOGIN, PASSWORD)
                .waitForMoodButtonVisible()
                .clickOnUpdateMoodButton()
                .updateMood(10);
        moodUpdatedModalPage.howBecomePatronInstruction();
        $(HOW_TO_BECOME_PATRON_INSTRUCTION_CSS).shouldHave(text("Become a MoodPanda Patron"));
    }

    @Test(description = "Add a new update and check it is displayed")
    public void myUpdatesTest(){
        loginPage
                .openPage()
                .login(LOGIN, PASSWORD);
        myUpdatesPage.addMyUpdates("Have a good Day!");
        $(MY_UPDATES_SECTION_CSS).shouldHave(text("Have a good Day"));
    }
}
