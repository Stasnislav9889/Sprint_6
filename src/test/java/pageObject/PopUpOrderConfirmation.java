package pageObject;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUpOrderConfirmation extends BasePage {

    // Заголовок выбора в поп-ап
    private By title = By.cssSelector(".Order_ModalHeader__3FDaJ");
    // Кнопка подтверждения заказа
    private By buttonYes = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    // Текст подтверждения заказа
    private By orderCreateText = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ'and text()='Заказ оформлен']");

    public PopUpOrderConfirmation(WebDriver driver) {
        super(driver);
    }

    public By getTitle() {
        return title;
    }

    public String clickConfirmOrder(){
        driver.findElement(buttonYes).click();
        waitVisibilityElement(orderCreateText);
       return driver.findElement(orderCreateText).getText();
    }
}