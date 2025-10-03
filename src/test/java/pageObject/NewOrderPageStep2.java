package pageObject;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static utils.DataGenerator.generatePhoneNumberFromList;

public class NewOrderPageStep2 extends BasePage {

    private By mainTitle = By.xpath(".//div[@class='Order_Header__BZXOb' and text()='Про аренду']");
    // Поле выбора даты доставки
   private By fieldOrderDeliveryDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    // Поле срок аренды
   private By fieldLeaseTerm = By.className("Dropdown-arrow");
    // Выпадающий список с временем аренды
   private By listLeaseTerm = By.cssSelector(".Dropdown-option");
   // Кнопка перехода на следующую страницу
   private By buttonSubmit = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public NewOrderPageStep2(WebDriver driver) {
        super(driver);
    }

    public NewOrderPageStep2 enterRandomDataIntoTheForm(){
       WebElement deliveryDate = driver.findElement(fieldOrderDeliveryDate);
       actions.moveToElement(deliveryDate)
               .click()
               .sendKeys(Keys.ARROW_DOWN)
               .sendKeys(Keys.ENTER)
               .perform();
       driver.findElement(fieldLeaseTerm).click();
       driver.findElements(listLeaseTerm).get(generatePhoneNumberFromList())
               .click();
       return this;
    }

    public By getMainTitle() {
        return mainTitle;
    }

    public PopUpOrderConfirmation clickCreateOrder(){
        driver.findElement(buttonSubmit).click();
        PopUpOrderConfirmation orderConfirmation = new PopUpOrderConfirmation(driver);
        waitVisibilityElement(orderConfirmation.getTitle());
        return orderConfirmation;
    }
}