package pageObject;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static utils.DataGenerator.*;

public class NewOrderPageStep1 extends BasePage {

    private By mainTitle = By.xpath(".//div[@class='Order_Header__BZXOb' and text()='Для кого самокат']");
    //Поля имя
    private By fieldName = By.xpath(".//input[@placeholder='* Имя']");
    //Поле фамилия
    private By fieldLastName = By.xpath(".//input[@placeholder='* Фамилия']");
    //Поле адрес доставки
    private By fieldDeliveryAdress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    // Поле Станция метро
    private By fieldUndergroundAdress = By.xpath(".//input[@placeholder='* Станция метро']");
    // Номер телефона
    private By fieldPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    // Кнопка перехода на следующую страницу
    private By buttonSubmit = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public NewOrderPageStep1(WebDriver driver) {
        super(driver);
    }

    public NewOrderPageStep1 enterRandomDataIntoTheForm(){
        driver.findElement(fieldName).sendKeys(generateFirstName());
        driver.findElement(fieldLastName).sendKeys(generateLastName());
        driver.findElement(fieldDeliveryAdress).sendKeys(generateDeliveryAddress());
        driver.findElement(fieldPhone).sendKeys(generatePhone());
        WebElement input = driver.findElement(fieldUndergroundAdress);
        actions.moveToElement(input).click()
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .perform();
        return this;
    }

    public NewOrderPageStep2 clickNextStepButton() {
        NewOrderPageStep2 step2 = new NewOrderPageStep2(driver);
        driver.findElement(buttonSubmit).click();
        waitVisibilityElement(step2.getMainTitle());
        return step2;
    }
}