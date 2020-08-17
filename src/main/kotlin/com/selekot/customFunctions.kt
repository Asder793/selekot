package com.selekot

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

fun WebDriver.xPathElement(xpathLocator: String): SelekotElement{
    return SelekotElement(this, By.xpath(xpathLocator))
}

fun WebDriver.cssElement(cssLocator: String): SelekotElement{
    return SelekotElement(this, By.cssSelector(cssLocator))
}

fun WebElement.shouldHaveText(text: String){
    assert(this.text == text)
}