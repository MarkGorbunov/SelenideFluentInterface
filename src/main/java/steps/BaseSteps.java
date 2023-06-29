package steps;

import elements.TopNavigationBar;
import interfaces.PageReloadable;
import pages.BasePage;

abstract public class BaseSteps implements PageReloadable {
    private BasePage basePage = new BasePage();
    public TopNavigationBar getTopNavigationBar() {
        return basePage.topNavigationBar;
    }
}
