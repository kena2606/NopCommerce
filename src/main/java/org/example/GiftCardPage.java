package org.example;

import org.openqa.selenium.By;

public class GiftCardPage extends Utils{



    private By _clickOnGiftCards = By.xpath("//div[6]/div[2]/ul[1]/li[7]/a");


    public void clickOnGiftCards(){
        Utils.clickOnElement(_clickOnGiftCards);
    }
}

