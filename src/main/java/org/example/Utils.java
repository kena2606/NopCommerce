package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Utils extends BasePage
{

    //To click on element
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //To enter text
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //To get text from elements
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //Assert Validation
    public static void validateText(By actualResult, String expectedResult, String errorMessage){
        Assert.assertEquals(actualResult,expectedResult,errorMessage);

    }
    public static void isElementDisplayed(By by){
        driver.findElement(by).isDisplayed();
    }
    public static void sendKeys(By by){
        driver.findElement(by).sendKeys();
    }
    public static void selectIndex(){
        Select day = new Select(driver.findElement(By.xpath("//*[@name=\"DateOfBirthDay\"]")));
        day.deselectByIndex(25);
    }
    public static void selectString(){
        Select month =new Select(driver.findElement(By.xpath("//*[@name=\"DateOfBirthMonth\"]")));
        month.selectByVisibleText("June");
    }
    public static void selectValue(){
        Select year = new Select(driver.findElement(By.xpath("//*[@name=\"DateOfBirthYear\"]")));
        year.selectByValue("1990");
    }
    public static void waitUntilElementIsDisplayed(By by){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static void waitForElementToBeClickable(By by){
        WebDriverWait wait= new WebDriverWait(driver, 60);// variable assigned
        wait.until(ExpectedConditions.elementToBeClickable(by));// expected condition for the wait
    }
    public static void waitForInvisibilityOfElementsLocated (By by, int time){
        WebDriverWait wait=new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
}
