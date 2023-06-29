package interfaces;

import com.codeborne.selenide.Selenide;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public interface PageReloadable {
    default void waitPageToLoad() {
        Selenide.Wait().withTimeout(Duration.ofSeconds(15)).until(webDriver -> ((JavascriptExecutor) webDriver).
                executeScript("return document.readyState").equals("complete"));
        Selenide.Wait().withTimeout(Duration.ofSeconds(10)).until(webDriver -> ((JavascriptExecutor) webDriver).
                executeScript("return $.active").equals(0L));
    }

    default void waitPageContainUrlPart(String urlEnd) {
        Selenide.Wait().until(ExpectedConditions.urlContains(urlEnd));
        waitPageToLoad();
    }
}
