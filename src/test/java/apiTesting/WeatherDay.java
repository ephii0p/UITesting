import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class WeatherDay {

    public final ElementsCollection dataToDay = $$x(".//span[contains(@class, 'sc-77074498-1')]");
    public final ElementsCollection month = $$x(".//span[contains(@class, 'sc-77074498-3')]");
    public final ElementsCollection today = $$x(".//span[contains(text(),'сегодня')]");
    // ElementsCollection date = $$x(".//p[contains(@class, 'sc-77074498-0')]");
    public final ElementsCollection morningTemperature = $$x(".//div[contains(@style, 'temperature-morning')]");
    public final ElementsCollection dayTemperature = $$x(".//div[contains(@style, 'temperature-day')]");
    public final ElementsCollection eveningTemperature = $$x(".//div[contains(@style, 'temperature-evening')]");
    public final ElementsCollection nightTemperature = $$x(".//div[contains(@style, 'temperature-night')]");
    public void getFirstDay () {
        System.out.print(today.get(0).getText() + " ");
        System.out.print(dataToDay.get(0).getText() + " ");
        System.out.println(month.get(0).getText());
        // System.out.println(date.get(0).getText());
        System.out.println("Погода " + morningTemperature.get(0).getText());
        System.out.println("Погода " + dayTemperature.get(0).getText());
        System.out.println("Погода " + eveningTemperature.get(0).getText());
        System.out.println("Погода " + nightTemperature.get(0).getText());

    }

    public void getSecondDay (){
        System.out.print(today.get(1).getText() + " ");
        System.out.print(dataToDay.get(1).getText() + " ");
        System.out.println(month.get(1).getText());
        System.out.println("Погода " + morningTemperature.get(1).getText());
        System.out.println("Погода " + dayTemperature.get(1).getText());
        System.out.println("Погода " + eveningTemperature.get(1).getText());
        System.out.println("Погода " + nightTemperature.get(1).getText());

    }
    }

