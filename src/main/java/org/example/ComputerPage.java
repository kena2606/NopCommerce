package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends Utils {

    private By _clickOnComputer = By.xpath("//div[6]/div[2]/ul[1]/li[1]/a");


    public void clickOnComputer(){
        Utils.clickOnElement(_clickOnComputer);
    }
}
