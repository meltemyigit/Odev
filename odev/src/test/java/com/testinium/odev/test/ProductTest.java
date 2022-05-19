package com.testinium.odev.test;

import com.testinium.odev.driver.BaseTest;
import com.testinium.odev.page.LoginPage;
import com.testinium.odev.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.Login();
        ProductPage productPage=new ProductPage();
        productPage.scrollAndSelect();
        productPage.scrollAndSelectFavorilereEkle();
        productPage.AnaSayfa();
        productPage.PuanKatalogu();
        productPage.RandomHobiUrunuSecmePage();
        productPage.sepeteEkle();
        productPage.listelerimVeFavorilerim();
        productPage.SepeteGit();
    }




}



