package org.example;

import org.junit.Test;

public class TestSuit extends BrowserSetup {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    ComputerPage computerPage = new ComputerPage();
    ElectronicPage electronicPage = new ElectronicPage();
    GiftCardPage giftCardPage = new GiftCardPage();

    @Test
    public void OpenPage() {

        homePage.selectCurrencyOption();
        homePage.clickOnRegister();
        registerPage.registerText();
        registerPage.clickOnRadioButton();
        registerPage.firstName();
        registerPage.lastName();
        registerPage.dayOfBirth();
        registerPage.dayOfMonth();
        registerPage.dayOfYear();
        registerPage.email();
        registerPage.company();
        registerPage.newsLetter();
        registerPage.password();
        registerPage.confirmPassword();
        computerPage.clickOnComputer();
        electronicPage.clickOnElectronic();
        giftCardPage.clickOnGiftCards();

    }
}