package org.example;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCase02 {

    @Test
    @Description("Verify the title of TestingAcademy Website")
    public void vwLogin()
    {
        WebDriver driver=new EdgeDriver();
        driver.get("https://thetestingacademy.com");
        System.out.println(driver.getTitle());
    }

}
