package test;

import base.BaseTest;
import enam.ListOfResponseFromBlockOfQuestions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import pageObject.YandexScooterMainPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YandexScooterParameterizationTest extends BaseTest {

    @ParameterizedTest
    @DisplayName("Тест проверки ответов в блоке \"Вопросы о важном\"")
    @EnumSource(ListOfResponseFromBlockOfQuestions.class)
    public void checkAnswersInTheListOfQuestions(ListOfResponseFromBlockOfQuestions expectResponse) {
        YandexScooterMainPage mainPage = new YandexScooterMainPage(driver);
        String actualAnswer = mainPage.getTextFromListOfResponse(expectResponse.getNumberRequest());
        assertEquals(expectResponse.getAnswer(), actualAnswer);
    }
}