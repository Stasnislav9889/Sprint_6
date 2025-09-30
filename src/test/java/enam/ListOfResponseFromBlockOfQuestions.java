package enam;

public enum ListOfResponseFromBlockOfQuestions {
    FIRST_ANSWER("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", 0),
    SECOND_ANSWER("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями," +
            " можете просто сделать несколько заказов — один за другим.", 1),
    THIRD_ANSWER("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. " +
            "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. " +
            "Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",2),
    FOURTH_ANSWER("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", 3),
    FIFTH_ANSWER("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку" +
            " по красивому номеру 1010.", 4),
    SIXTH_ANSWER("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже" +
            " если будете кататься без передышек и во сне. Зарядка не понадобится.",5),
    SEVENTH_ANSWER("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим." +
            " Все же свои.",6),
    EIGHTH_ANSWER("Да, обязательно. Всем самокатов! И Москве, и Московской области.",7);

    private final String answer;
    private final Integer numberRequest;

    ListOfResponseFromBlockOfQuestions(String answer, Integer numberRequest) {
        this.answer = answer;
        this.numberRequest= numberRequest;
    }

    public String getAnswer() {
        return answer;
    }

    public Integer getNumberRequest() {
        return numberRequest;
    }
}