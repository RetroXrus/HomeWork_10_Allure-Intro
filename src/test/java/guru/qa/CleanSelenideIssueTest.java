package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;

public class CleanSelenideIssueTest {

    @Test
    public void testIssueSearch() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com");

        $(".header-search-input").click();
        $(".header-search-input").sendKeys("RetroXrus/HomeWork_10_Allure-Intro");
        $(".header-search-input").submit();

        $(linkText("RetroXrus/HomeWork_10_Allure-Intro")).click();
        $(withText("Issue")).should(Condition.exist);
        //sleep(3000); //Для дебага
    }
}
