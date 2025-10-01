package test;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObject.YandexScooterMainPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewOrderTest extends BaseTest {

    private static final String EXPECT_RESULT = "Заказ оформлен";

    @Test
    @DisplayName("Проверка возможности создания заказа кнопкой в хедере")
    public void checkCreateOrderHeaderButtonTest() {
        YandexScooterMainPage mainPage = new YandexScooterMainPage(driver);
        String actualResult = mainPage.clickCreateNewOrderButtonInHeader()
                .enterRandomDataIntoTheForm()
                .clickNextStepButton()
                .enterRandomDataIntoTheForm()
                .clickCreateOrder()
                .clickConfirmOrder();
        assertEquals(EXPECT_RESULT, actualResult);
    }

    @Test
    @DisplayName("Проверка возможности создания заказа в середине")
    public void checkCreateOrderTestMidlButton() {
        YandexScooterMainPage mainPage = new YandexScooterMainPage(driver);
        String actualResult = mainPage.clickCreateNewOrderButtonInMiddle()
                .enterRandomDataIntoTheForm()
                .clickNextStepButton()
                .enterRandomDataIntoTheForm()
                .clickCreateOrder()
                .clickConfirmOrder();
        assertEquals(EXPECT_RESULT, actualResult);
    }
}