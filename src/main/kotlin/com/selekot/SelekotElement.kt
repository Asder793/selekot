package com.selekot

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

class SelekotElement(private val driver: WebDriver, private val locator: By) {

    fun getElement(): WebElement{
        return WebDriverWait(driver,4000).until(ExpectedConditions.visibilityOfElementLocated(locator))
    }

    fun sendKeys(key: String) {
       getElement().sendKeys(key)
    }

    fun click(){
        getElement().click()
    }

    val text: String
    get() = getElement().text

    fun pressEnter(){
        getElement().sendKeys(Keys.ENTER)
    }

}