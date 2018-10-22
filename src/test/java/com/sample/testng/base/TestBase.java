package com.sample.testng.base;

import com.sample.testng.constants.Constants;
import com.sample.testng.core.DriverBase;
import com.sample.testng.listeners.ScreenshotListener;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

@Listeners(ScreenshotListener.class)

public class TestBase {


    @BeforeClass(alwaysRun = true)
    public void instantiateDriverObject() {
        DriverBase.instantiateDriverObject();
        String sessionId = ((RemoteWebDriver) DriverBase.getDriver()).getSessionId().toString();
        DriverBase.getDriver().manage().deleteAllCookies();
        DriverBase.getDriver().manage().window().maximize();
        DriverBase.getDriver().get(Constants.APP_URL);

    }

    @AfterClass(alwaysRun = true)
    public void closeDriverObjects() {
        //DriverBase.closeDriverObjects();
    }
}