package com.juaracoding.posttestdelapabelas.pageobject;

import com.juaracoding.posttestdelapabelas.pageobject.drivers.DriverSingleton;
import com.juaracoding.posttestdelapabelas.pageobject.utils.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainApp {
    public static void main(String[] args) {

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
//        driver.get(Constants.URL);

//        WebTables webTables = new WebTables();
//        webTables.registrationForm("Text 1", "Text 2", "text@email.com", "20", "20000", "SQA");

        JavascriptExecutor js = (JavascriptExecutor) driver;

//        driver.get("https://demoqa.com/alerts");
//        Alerts alerts = new Alerts();
//        alerts.alertButton();
//        alerts.timerAlertButton();
//        alerts.confirmButton();
//        js.executeScript("window.scrollBy(0,300)");
//        alerts.promtButton();

//        driver.get("https://demoqa.com/modal-dialogs");
//        ModalDialogs modalDialogs = new ModalDialogs();
//        modalDialogs.showSmallModal();

//        driver.get("https://demoqa.com/frames");
//        Frames frames = new Frames();
//        frames.sampleFrame();

//        driver.get("https://demoqa.com/automation-practice-form");
//        PracticeForm practiceForm = new PracticeForm();
//        practiceForm.inputForm();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
