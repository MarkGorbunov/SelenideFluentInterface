import com.codeborne.selenide.Selenide;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import config.Config;
import config.manager.DriverManager;
import steps.HomeSteps;

public class BaseTests {
    HomeSteps homeSteps = new HomeSteps();

    @BeforeTest
    protected void startUp() {
        DriverManager.setupBrowser();
        String baseUrl = Config.getEnv().getProperty("baseUrl");
        Selenide.open(baseUrl);
    }

    @AfterTest
    protected void shutDown() {
        Selenide.closeWebDriver();
    }
}
