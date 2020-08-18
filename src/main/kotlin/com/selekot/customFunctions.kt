package com.selekot

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

fun WebDriver.xPathElement(xpathLocator: String): SelekotElement {
    return SelekotElement(this, By.xpath(xpathLocator))
}

fun WebDriver.cssElement(cssLocator: String): SelekotElement {
    return SelekotElement(this, By.cssSelector(cssLocator))
}

fun WebDriver.byId(id: String): SelekotElement {
    return SelekotElement(this, By.id(id))
}

fun WebDriver.byClassName(className: String): SelekotElement {
    return SelekotElement(this, By.className(className))
}

fun WebDriver.byLinkText(linkText: String): SelekotElement {
    return SelekotElement(this, By.linkText(linkText))
}

fun WebDriver.byName(name: String): SelekotElement {
    return SelekotElement(this, By.name(name))
}

fun WebDriver.byPartialLinkText(partialLinkText: String): SelekotElement {
    return SelekotElement(this, By.partialLinkText(partialLinkText))
}

fun WebDriver.byTagName(tagName: String): SelekotElement {
    return SelekotElement(this, By.tagName(tagName))
}

fun WebElement.shouldHaveText(text: String) {
    assert(this.text == text)
}