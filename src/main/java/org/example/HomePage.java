package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {


    private By _selectCurrencyOption = By.id("customerCurrency");

    private By _register = By.className("ico-register");



    public void selectCurrencyOption(){
        Utils.getTextFromElement(_selectCurrencyOption);
        Utils.waitForElementToBeClickable(_selectCurrencyOption);
    }
    public void clickOnRegister(){
        Utils.clickOnElement(_register);
    }
}
