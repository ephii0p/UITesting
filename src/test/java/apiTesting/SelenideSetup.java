package apiTesting;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;

public class SelenideSetup {
    public void setup() {
        Selenide.open("https://yandex.ru/pogoda");
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920x1080";
    }

    @Before
    public void openSetup() {
        setup();
    }

    @After
    public void closeSetup() {
        Selenide.closeWebDriver();
    }
}
