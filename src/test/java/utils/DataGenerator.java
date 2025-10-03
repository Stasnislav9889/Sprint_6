package utils;

import org.openqa.selenium.By;

import java.util.Random;

public class DataGenerator {

    private static Random random = new Random();

    public static String generateFirstName() {
        // Здесь можно сделать генерацию случайных имён, пока простой пример
        String[] names = {"Иван", "Алексей", "Пётр", "Николай", "Дмитрий"};
        return names[random.nextInt(names.length)];
    }

    public static String generateLastName() {
        String[] lastNames = {"Петров", "Сидоров", "Иванов", "Кузнецов", "Смирнов"};
        return lastNames[random.nextInt(lastNames.length)];
    }

    public static String generateDeliveryAddress() {
        String[] addresses = {"Москва", "Санкт-Петербург", "Казань", "Новосибирск", "Екатеринбург"};
        return addresses[random.nextInt(addresses.length)];
    }

    public static String generatePhone() {
        // Генерация телефона в формате 8900xxxxxxx
        return "8900" + (1000000 + random.nextInt(9000000));
    }

    public static int generatePhoneNumberFromList(){
        return 1 + random.nextInt(6);
    }
}
