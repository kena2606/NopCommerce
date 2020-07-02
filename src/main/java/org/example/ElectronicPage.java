package org.example;

import org.openqa.selenium.By;

public class ElectronicPage extends Utils {


    private By _clickOnElectronic = By.xpath("//div[6]/div[2]/ul[1]/li[2]/a");

    public void clickOnElectronic(){
        Utils.clickOnElement(_clickOnElectronic);
    }
}
