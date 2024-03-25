package Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium3 {

    @Test
    @Description("Verify the currentURL ,Title of the VWO app")
    public void TestLogin()

    {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");

        WebElement startlink=driver.findElement(By.linkText("Start a free trial"));
        //WebElement startlink=driver.findElement(By.partialLinkText("Start"));
        System.out.println(startlink.getAttribute("href"));
        startlink.click();

        driver.close();
    }

}
