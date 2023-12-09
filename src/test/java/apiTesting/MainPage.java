package apiTesting;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;


public class MainPage {

    public static String URL_MAIN_PAGE = "https://yandex.ru/pogoda";
    public static SelenideElement sendCity = $x("//input");
    public static SelenideElement choiceCity = $x("//*[@class='place-list__item']/a[1]");
    public static SelenideElement tenDays = $x(".//div/a[1][contains(text(),'Подробный прогноз на 10 дней')]");


    public void openWeatherPage() {
        Selenide.open(URL_MAIN_PAGE);
    }

    public void sendCityName(String cityName) {
        sendCity.sendKeys(cityName);
        sendCity.pressEnter();
    }

    public void choiceCityName() {
        choiceCity.click();
    }

    public void clickTenDaysWeather() {
        tenDays.click(ClickOptions.withTimeout(Duration.ofSeconds(60)));
    }
}