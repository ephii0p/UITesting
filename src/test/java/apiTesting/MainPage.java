import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {


    public static String URL_MAIN_PAGE = "https://yandex.ru/pogoda";
    public static SelenideElement sendCity = $x("//input");
    public static ElementsCollection choiceCity = $$x(".//input[contains(@aria-controls, 'suggest-list')]");
    public static SelenideElement tenDays = $x(".//a[contains(text(),'Подробный прогноз на 10 дней')]");


    public void openWeatherPage() {

        Selenide.open(URL_MAIN_PAGE);

    }

    public void sendCityName() {
        sendCity.sendKeys("Ижевск");
    }

    public void choiceCityName() {
        choiceCity.first().click();

    }

    public void clickTenDays() {
        tenDays.click();
    }
}