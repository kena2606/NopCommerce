package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends Utils {


    private By _registerText = By.xpath("//div[6]/div[3]//div[1]/h1");
    private By _clickOnRadioButton = By.xpath("//input[@id=\"gender-female\"]");
    private By _firstName = By.xpath("//input[@id=\"FirstName\"]");
    private By _lastName = By.xpath("//input[@id=\"LastName\"]");
    private By _dayOfBirth = By.xpath("//*[@name=\"DateOfBirthDay\"]");
    private By _dayOfMonth = By.xpath("//*[@name=\"DateOfBirthMonth\"]");
    private By _dayOfYear  = By.xpath("//*[@name=\"DateOfBirthYear\"]");
    private By _email   =By.xpath("//input[@id=\"Email\"]");
    private  By _company   = By.xpath("//input[@id=\"Company\"]");
    private  By _newsLetter =By.xpath("//input[@id=\"Newsletter\"]");
    private  By _password = By.xpath("//input[@id=\"Password\"]");
    private By _confirmPassword =By.xpath("//input[@id=\"ConfirmPassword\"]");
    private  By _registerButton = By.xpath("//input[@id=\"register-button\"]");
    private  By _yourRegistrationCompleted = By.xpath("//div/div/form/div/div[2]/div[1]");
    private By _clickOnContinueButton =By.xpath("//*[@name=\"register-continue\"]");

    public void registerText(){
        Utils.getTextFromElement(_registerText);
    }

    public void clickOnRadioButton (){
       /*WebDriverWait wait=new WebDriverWait(driver,60);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("gender-female")));
        driver.findElement(_clickOnRadioButton).click();*/
       Utils.waitForElementToBeClickable(_clickOnRadioButton);
        Utils.clickOnElement(_clickOnRadioButton);

    }
    public void firstName(){
       // driver.findElement(_firstName).sendKeys("Kena");
        Utils.enterText(_firstName,"kena");
    }
    public void lastName(){
        //driver.findElement(_lastName).sendKeys("Acharya");
        Utils.enterText(_lastName,"Acharya");

    }
    public void dayOfBirth(){
        Utils.selectIndex();
    }
    public void dayOfMonth(){
        Utils.selectString();
    }
    public void dayOfYear(){
        Utils.selectValue();
        Utils.waitUntilElementIsDisplayed(_dayOfYear);
    }
    public void email(){
        Utils.waitForElementToBeClickable(_email);
        Utils.enterText(_email,"kena.acharya26"+Math.random()+"@gmail.com");
       // WebDriverWait wait= new WebDriverWait(driver,60);
        //driver.findElement(_email).sendKeys("kena.acharya26"+Math.random()+"@gmail.com");
    }
    public void company(){
        Utils.enterText(_company,"soft solution ltd");
    }
    public void newsLetter(){
        Utils.clickOnElement(_newsLetter);
    }
    public void password(){
        Utils.enterText(_password, "Abcd123");
    }
    public void confirmPassword(){
        Utils.enterText(_confirmPassword, "Abcd123");
    }

}
