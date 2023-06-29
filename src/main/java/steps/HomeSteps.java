package steps;

import com.codeborne.selenide.Condition;

import pages.HomePage;

public class HomeSteps extends BaseSteps {
    HomePage homePage = new HomePage();
    public DynamicIdSteps openDynamicId() {
        homePage.dynamicIdPage.shouldBe(Condition.visible);
        String href = homePage.dynamicIdPage.attr("href");
        homePage.dynamicIdPage.click();
        homePage.dynamicIdPage.shouldBe(Condition.hidden);
        waitPageContainUrlPart(href);
        return new DynamicIdSteps();
    }
}
