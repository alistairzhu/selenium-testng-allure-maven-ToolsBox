package lv.iljapavlovs.testng.base;

import lv.iljapavlovs.testng.core.DriverBase;
import lv.iljapavlovs.testng.listeners.ScreenshotListener;
import lv.iljapavlovs.testng.utils.Utility;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import static lv.iljapavlovs.testng.constants.Constants.APP_URL;
import static lv.iljapavlovs.testng.core.DriverBase.getDriver;

@Listeners(ScreenshotListener.class)

public class TestBase {


    @BeforeClass(alwaysRun = true)
    public void instantiateDriverObject() {
        DriverBase.instantiateDriverObject();
        String sessionId = ((RemoteWebDriver) getDriver()).getSessionId().toString();
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        getDriver().get(APP_URL);

    }

    @AfterClass(alwaysRun = true)
    public void closeDriverObjects() {
        //DriverBase.closeDriverObjects();
    }
}