import com.codeborne.selenide.Selenide;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import steps.HomeSteps;

public class BaseTests {
    HomeSteps homeSteps = new HomeSteps();

    @BeforeTest
    protected void startUp() {
        Selenide.open("http://www.uitestingplayground.com/");
    }

    @AfterTest
    protected void shutDown() {
        Selenide.closeWebDriver();
    }
}
