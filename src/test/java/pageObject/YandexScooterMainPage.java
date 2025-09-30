package pageObject;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class YandexScooterMainPage extends BasePage {

    //Список вопросов
    private By listOfQuestions = By.className("accordion__item");
    //Часть локатора для списка ответов
    private static final String textRequestIdLocator = "accordion__panel-%d";
    //Кнопка создания заказа в заголовке
    private By buttonOrderInHeader = By.className("Button_Button__ra12g");
    //Кнопка создания заказа в середине
    private By buttonOrderInMiddle = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");


    public YandexScooterMainPage(WebDriver driver) {
        super(driver);
    }

    private By getLocatorRequest(int number) {
        return By.id(String.format(textRequestIdLocator, number));
    }

    public String getTextFromListOfResponse(int numberInList) {
        List<WebElement> listElements = driver.findElements(listOfQuestions);
        if (listElements.size() > numberInList) {
            WebElement question = listElements.get(numberInList);
            scrollToElement(question);
            question.click();
            waitVisibilityElement(getLocatorRequest(numberInList));
            return driver.findElement(getLocatorRequest(numberInList)).getText();
        } else return null;
    }

    public NewOrderPageStep1 clickCreateNewOrderButtonInHeader() {
        driver.findElement(buttonOrderInHeader).click();
        return new NewOrderPageStep1(driver);
    }

    public NewOrderPageStep1 clickCreateNewOrderButtonInMiddle() {
        WebElement button = driver.findElement(buttonOrderInMiddle);
        scrollToElement(button);
        driver.findElement(buttonOrderInMiddle).click();
        return new NewOrderPageStep1(driver);
    }
}
