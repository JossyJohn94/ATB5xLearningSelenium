package Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium02 {

    @Test
    @Description("Verify the currentURL ,Title of the VWO app")
    public void testvwologin()
    {
        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        WebElement EmailId=driver.findElement(By.id("login-username"));
        EmailId.sendKeys("admin@admin.com");

        //this way also we can use to findelement and send keys
        driver.findElement(By.id("login-password")).sendKeys("admin");

        WebElement submitbutton= driver.findElement(By.id("js-login-btn"));
        submitbutton.click();

        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        WebElement errormessage= driver.findElement(By.id("js-notification-box-msg"));
        String errormsgtext= errormessage.getText();
        String errormsgattribute=errormessage.getAttribute("class");
        System.out.println(errormsgattribute);
        Assert.assertEquals(errormsgtext,"Your email, password, IP address or location did not match");


        driver.quit();


    }
}
