package tests;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    LoginPage loginPage;
    FeedPage feedPage;
    RateYourHappinessModalPage rateYourHappinessModalPage;
    MoodUpdatedModalPage moodUpdatedModalPage;
    UrgentPage urgentPage;
    AccountUpgradePage accountUpgradePage;
    MyUpdatesPage myUpdatesPage;

    @BeforeMethod
    public void setUp(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = 15000;
        Configuration.holdBrowserOpen = true;
        Configuration.headless = false;
        loginPage = new LoginPage();
        feedPage = new FeedPage();
        rateYourHappinessModalPage = new RateYourHappinessModalPage();
        moodUpdatedModalPage = new MoodUpdatedModalPage();
        urgentPage = new UrgentPage();
        accountUpgradePage = new AccountUpgradePage();
        myUpdatesPage = new MyUpdatesPage();
    }

    @AfterMethod
    public void closeBrowser(){
        getWebDriver().quit();
    }
}
