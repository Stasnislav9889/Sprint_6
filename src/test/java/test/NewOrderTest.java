package test;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObject.YandexScooterMainPage;

public class NewOrderTest extends BaseTest {

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

        System.out.println(actualResult);
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

        System.out.println(actualResult);
    }
}