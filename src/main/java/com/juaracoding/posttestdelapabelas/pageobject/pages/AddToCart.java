package com.juaracoding.posttestdelapabelas.pageobject.pages;

import com.juaracoding.posttestdelapabelas.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class AddToCart {

    private WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;


    public AddToCart() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);

    }
        @FindBy(xpath = "//*[@id=\"nav-menu-item-cart\"]/a")
        WebElement btnCart;
        @FindBy(xpath = "//div[@class='noo-product-item one noo-product-sm-4 not_featured post-1497 product type-product status-publish has-post-thumbnail product_cat-t-shirt product_tag-t-shirt product_tag-women has-featured first instock shipping-taxable purchasable product-type-variable']//div[@class='noo-product-inner']")
        WebElement chooseBaju;
        @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[2]/div/h3")
        WebElement chooseBajuKedua;
        @FindBy(id = "pa_color")
        WebElement chooseColor;
        @FindBy(id = "pa_size")
        WebElement chooseSizes;
        @FindBy(xpath = "//*[@id=\"product-1497\"]/div[1]/div[2]/form/div/div[2]/button")
        WebElement btnAddToCart;
        @FindBy(xpath = "//*[@id=\"product-1491\"]/div[1]/div[2]/form/div/div[2]/button")
        WebElement btnAddToCartKedua;
        @FindBy(xpath = "//*[@id=\"product-1497\"]/div[1]/div[2]/h1")
        WebElement success;
        @FindBy(xpath = "//*[@id=\"noo-site\"]/section/div/div/h1")
        WebElement SuccessKedua;




        public void pilihWarnaBaju(){
            chooseBaju.click();
            Select color = new Select(chooseColor);
            Select size = new Select(chooseSizes);
            color.selectByIndex(1);
            size.selectByIndex(1);
        }

        public void pilihWarnaBajuKedua(){
            for (int i=1; i<=2; i++){
                driver.navigate().back();
            }
            chooseBajuKedua.click();
            Select colorDua = new Select(chooseColor);
            Select sizeDua = new Select(chooseSizes);
            colorDua.selectByIndex(1);
            sizeDua.selectByIndex(2);
            btnAddToCartKedua.click();
            driver.navigate().refresh();
            btnCart.click();
        }


         public String txtBerhasil(){
            return success.getText();
         }

         public String txtBerhasilKedua(){
              return SuccessKedua.getText();
         }




}
