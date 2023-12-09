package org.example;

import apiTesting.MainPage;
import apiTesting.WeatherDay;
import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static apiTesting.WeatherDay.date;

public class WeatherSteps {
    MainPage mainPage = new MainPage();
    WeatherDay weatherDay = new WeatherDay();

    @Given("^Открываю страницу погоды Яндекса$")
    public void openMainPage() {
        mainPage.openWeatherPage();

    }

    @When("^Ввожу город (.*)$")
    public void sendCityNames(String cityName) {
        mainPage.sendCityName(cityName);
    }

    @And("^Из всплывающего списка выбираю первый элемент$")
    public void choiceCityNames() {
        mainPage.choiceCityName();
    }


    @And("^Перехожу на страницу Подробный прогноз на 10 дней$")
    public void clickTenDay() {
        mainPage.clickTenDaysWeather();
    }

    @Then("^Смотрю погоду на (\\d+) дня и вывожу в консоль$")
    public void checkWeatherFirstDay(int days) {
        weatherDay.getDay(days);
    }

    @And("^Проверяю, что подробный прогноз погоды отображается$")
    public void checkTenDaysWeather() {
        for (int i = 0; i < date.size(); i++) {
            date.get(i).shouldBe(Condition.visible);
        }
    }
}
