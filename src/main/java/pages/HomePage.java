package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    public SelenideElement dynamicIdPage = Selenide.$x("//a[@href='/dynamicid']");
}
