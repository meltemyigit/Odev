package com.testinium.odev.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Wait;

public class LoginPage {

    Methods methods;

    public LoginPage() {
        methods = new Methods();
    }

    public void Login() {
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySec(5);
        methods.sendKeys(By.id("login-email"), "meltemyigitt@gmail.com");
        methods.waitBySec(5);
        methods.sendKeys(By.xpath("//input[@id='login-password']"), "12345678");
        methods.waitBySec(5);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySec(3);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//a[@class='common-sprite']/b[text()='meltem yiğit']")));
        System.out.println("sayfaya login olmasi saglandi");
        methods.waitBySec(8);

    }
}