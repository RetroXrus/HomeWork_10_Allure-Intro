package guru.qa;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class WebStepsIssueTest {

    private static final String REPOSITORY = "RetroXrus/HomeWork_10_Allure-Intro";
    private static final String ISSUE = "Issue";

    @Test
    public void testAnnotatedStep() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        StepAnnotation steps = new StepAnnotation();

        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.clickOnRepositoryLink(REPOSITORY);
        steps.shouldSeeIssue(ISSUE);

    }
}
