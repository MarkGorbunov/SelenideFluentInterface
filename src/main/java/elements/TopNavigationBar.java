package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import interfaces.PageReloadable;
import steps.HomeSteps;

import static com.codeborne.selenide.Selenide.$x;

public class TopNavigationBar implements PageReloadable {
    SelenideElement homePage = $x("//a[@href='/home']");
    SelenideElement resourcesPage = $x("//a[@href='/resources']");
    SelenideElement navigationToggler = $x("//button[contains(@class, 'navbar-toggler')]");

    public HomeSteps clickOnHomeNavigationButton() {
        if (homePage.is(Condition.visible)) {
            homePage.click();
        } else {
            navigationToggler.click();
            homePage.shouldBe(Condition.visible).click();
        }
        return new HomeSteps();
    }

    public HomeSteps clickOnResourcesNavigationButton() {
        visibilityCheck(resourcesPage);
        return new HomeSteps();
    }

    private void visibilityCheck(SelenideElement elem) {
        if (elem.is(Condition.hidden)) {
            navigationToggler.click();
        }
        elem.shouldBe(Condition.visible).click();
        waitPageContainUrlPart(elem.attr("href"));

    }
}
