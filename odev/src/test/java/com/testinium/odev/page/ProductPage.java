package com.testinium.odev.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.Random;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage(){
        methods = new Methods();
    }

    public void scrollAndSelect(){
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.waitBySec(2);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySec(5);

        //7.ürüne scroll yapar.
        methods.scrollWithAction(By.xpath("//div[@class='product-list']/div[7]"));
        methods.waitBySec(5);

    }


    public void scrollAndSelectFavorilereEkle() {
        for (int i = 5; i < 9; i++)
        {
            methods.click(By.xpath("//div[@id='product-table']/div[" + i +
                    "]/div[2]/div[3]/a[4]"));
            methods.waitBySec(4);
        }
    }
    public void AnaSayfa() {
        methods.click(By.cssSelector(".logo-text"));
        methods.waitBySec(5);


    }

    public void PuanKatalogu() {
        methods.click(By.xpath("//div[@class='lvl1catalog']/a"));
        methods.waitBySec(5);
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySec(5);

        methods.click(By.xpath("//div[@class='sort']/*"));
        methods.waitBySec(5);
        methods.scrollWithAction(By.xpath("//div[@class='sort']/*"));
        methods.waitBySec(3);
        methods.selectByText(By.xpath("//select[@onchange='location = this.value;']"),
                "Yüksek Oylama");
        methods.waitBySec(2);
        //Tüm kitaplar
        methods.click(By.xpath("//ul[@class='js-ajaxCt js-bookCt']/li[3]/span"));
        methods.waitBySec(2);
        //hobi
        methods.click(By.xpath("//a[@href='kategori/kitap-hobi/1_212.html']"));
        methods.waitBySec(2);
    }


    public void RandomHobiUrunuSecmePage() {
        methods.click(By.xpath("//ul[@class='js-ajaxCt js-bookCt']/li[3]/span"));
        methods.waitBySec(3);
        methods.click(By.xpath("//a[@href='kategori/kitap-hobi/1_212.html']"));
        methods.waitBySec(3);
        Random r=new Random();
        int a=r.nextInt(6);
        while(true)
        {
            if(a != 0)
                break;
            a = r.nextInt(6);
        }
        methods.click(By.xpath(
                "//ul[@class='product-grid jcarousel-skin-opencart']/li[" + a + "]"));
        methods.waitBySec(3);
    }
    public void sepeteEkle(){
        methods.click(By.id("button-cart"));
        methods.waitBySec(5);
    }
    public void listelerimVeFavorilerim(){
        //Listelerim
        methods.click(By.xpath("//div[@class='menu top my-list']/ul/li/a"));
        methods.waitBySec(5);
        //Favorilerim
        methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']"));
        methods.waitBySec(5);
    }

   public void SepeteGit(){
        methods.click(By.id("js-cart"));
   }
}