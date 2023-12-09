package apiTesting;

import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$x;

public class WeatherDay {

    public static final ElementsCollection date = $$x(".//p[contains(@class, 'sc-77074498-0')]");
    public final ElementsCollection morningTemperature = $$x(".//div[contains(@style, 'temperature-morning')]");
    public final ElementsCollection dayTemperature = $$x(".//div[contains(@style, 'temperature-day')]");
    public final ElementsCollection eveningTemperature = $$x(".//div[contains(@style, 'temperature-evening')]");
    public final ElementsCollection nightTemperature = $$x(".//div[contains(@style, 'temperature-night')]");

    public void getDay(int days) {
        for (int i = 0; i < days; i++) {
            System.out.println(date.get(i).getText());
            System.out.println("Погода " + morningTemperature.get(i).getText());
            System.out.println("Погода " + dayTemperature.get(i).getText());
            System.out.println("Погода " + eveningTemperature.get(i).getText());
            System.out.println("Погода " + nightTemperature.get(i).getText());
        }
    }
}