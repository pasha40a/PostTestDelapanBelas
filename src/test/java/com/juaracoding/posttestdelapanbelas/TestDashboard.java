package com.juaracoding.posttestdelapanbelas;

import com.github.dockerjava.core.dockerfile.DockerfileStatement;
import com.juaracoding.posttestdelapabelas.pageobject.drivers.DriverSingleton;
import com.juaracoding.posttestdelapabelas.pageobject.pages.AddToCart;
import com.juaracoding.posttestdelapabelas.pageobject.pages.Dashboard;
import com.juaracoding.posttestdelapabelas.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDashboard {
    public static WebDriver driver;
    private Dashboard dashboard;
    private AddToCart addToCart;



    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
    }

    @BeforeMethod
    public void pageObject() {
        dashboard = new Dashboard();
        addToCart = new AddToCart();

    }

    @AfterClass
    public void closeBrowser() {
        delay(5);
        //DriverSingleton.closeObjectInstance();
    }

    @Test(priority = 3)
    public void testSearchValid() {
        delay(3);
        dashboard.search("PINK");
        // PreCondition
        delay(5);
        // Step
        Assert.assertEquals(dashboard.txtWarnaShop(), "OPENING TIME");
        System.out.println("Test Case Search Product");
    }

    @Test(priority = 1)
    public void testSearchInvalid() {
        delay(3);
        dashboard.btnDismis();
        dashboard.search("PINK1");
        // PreCondition
        delay(5);
        // Step
        Assert.assertEquals(dashboard.txtWarnaInvalid(), "No products were found matching your selection.");
        System.out.println("Test Case Search Product Invalid");
    }

    @Test(priority = 2)
    public void testSearchKosong() {
        delay(3);
        dashboard.search("");
        // PreCondition
        delay(5);
        // Step
        Assert.assertEquals(dashboard.txtWarnaShop(), "OPENING TIME");
        System.out.println("Test Case Search Product Kosong");
    }

    @Test(priority = 4)
    public void testAddToCart() {
        delay(3);
        addToCart.pilihWarnaBaju();
        // PreCondition
        delay(5);
        // Step
        Assert.assertEquals(addToCart.txtBerhasil(), "PINK DROP SHOULDER OVERSIZED T SHIRT");
        System.out.println("Test Case Add Product");
    }

    @Test(priority = 5)
    public void testAddToCartKedua() {
        delay(3);
        addToCart.pilihWarnaBajuKedua();
        // PreCondition
        delay(5);
        // Step
        Assert.assertEquals(addToCart.txtBerhasilKedua(), "CART");
        System.out.println("Test Case Add Product Kedua");
    }

    static void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
