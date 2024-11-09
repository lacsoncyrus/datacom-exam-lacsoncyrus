package utils;


import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;


public class PageBase {
    public static WebDriver driver = null;

    public static void waitFor(int timeInSeconds) {
        long time1, time2;
        time1 = System.currentTimeMillis();

        do {
            time2 = System.currentTimeMillis();
        } while ((time2 - time1) < timeInSeconds * 1000);
    }

    public static boolean waitElementWithLocator(String elementName, By locatorOfElement, int duration,
                                                 int numberOfIteration, String expectationForElement) {
        WebElement element = null;
        boolean result = false;
        int attempts = 1;
        while (attempts <= numberOfIteration) {
            try {
                element = new WebDriverWait(driver, Duration.ofSeconds(duration))
                        .ignoring(StaleElementReferenceException.class).ignoring(NoSuchElementException.class)
                        .until(ExpectedConditions.visibilityOfElementLocated(locatorOfElement));
                result = true;
            } catch (Exception e) {
                result = false;
                System.out.println(e.getMessage());
            }
            attempts++;
        }
        switch (expectationForElement.toUpperCase()) {
            case "DISPLAYED":
                if (result == true) {
                    System.out.println(elementName + " successfully displayed with locator : " + locatorOfElement);
                    return true;
                } else {
                    System.out.println(elementName + " failed to display with locator : " + locatorOfElement);
                    // assert error
                }
                break;
            case "NOTDISPLAYED":
                if (result == false) {
                    System.out.println(elementName + " is not displayed with locator : " + locatorOfElement);
                    return true;
                } else {
                    System.out.println(elementName + " is displayed with locator : " + locatorOfElement);
                    // assert error
                }
                break;
            case "IGNOREIFDISPLAYED":
                if (result == true) {
                    System.out.println(elementName + " is displayed with locator : " + locatorOfElement);
                    return true;
                } else {
                    System.out.println(elementName + " is not displayed with locator : " + locatorOfElement);
                }
                break;
        }
        return false;
    }

    public void click(String elementName, By locatorOfElement, int duration,
                      int numberOfIteration) {
        waitElementWithLocator(elementName, locatorOfElement, duration, numberOfIteration, "DISPLAYED");
        driver.findElement(locatorOfElement).click();
    }
    public void scrollDownIntoElement(String elementName, By locatorOfElement, int duration,
                                      int numberOfIteration) {
        waitElementWithLocator(elementName, locatorOfElement, duration, numberOfIteration, "DISPLAYED");
        WebElement element = driver.findElement(locatorOfElement);
        try {


            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;


            int elementHeight = element.getSize().getHeight();
            int windowHeight = Integer.parseInt(jsExecutor.executeScript("return window.innerHeight").toString());

            int scrollPosition = element.getLocation().getY() - (windowHeight / 2) + (elementHeight / 2);

            jsExecutor.executeScript("window.scrollTo(0, arguments[0]);", scrollPosition);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
