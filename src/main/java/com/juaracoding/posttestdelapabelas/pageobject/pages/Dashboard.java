package com.juaracoding.posttestdelapabelas.pageobject.pages;

import com.juaracoding.posttestdelapabelas.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    private WebDriver driver;

    public Dashboard() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='woocommerce-store-notice__dismiss-link']")
    WebElement txtDismis;
    @FindBy(xpath = "//a[@class='noo-search']")
    WebElement btnSearch;
    @FindBy(name = "s")
    WebElement typeSearch;
    @FindBy(xpath = "//h4[@class='widget-title']")
    WebElement txtWarna;
    @FindBy(xpath = "//p[@class='woocommerce-info woocommerce-no-products-found']")
    WebElement txtInvalidSearch;

    public void btnDismis (){
        txtDismis.click();
    }
    public void search (String typeSearch){
        btnSearch.click();
        this.typeSearch.sendKeys(typeSearch);
        this.typeSearch.sendKeys(Keys.ENTER);
    }
    public String txtWarnaShop() {
        return txtWarna.getText();
    }

    public String txtWarnaInvalid() {
        return txtInvalidSearch.getText();
    }

}
