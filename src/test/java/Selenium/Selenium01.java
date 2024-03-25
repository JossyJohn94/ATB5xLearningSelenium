package Selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium01 {
    public static void main(String[] args) {
        EdgeOptions edgeoptions=new EdgeOptions();
        edgeoptions.addArguments("--incognito");
        edgeoptions.addArguments("---start maximized");
        edgeoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        EdgeDriver driver=new EdgeDriver(edgeoptions);

        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
