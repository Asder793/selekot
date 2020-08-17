package com.selekot

import io.github.bonigarcia.wdm.WebDriverManager
import org.junit.jupiter.api.Test
import org.openqa.selenium.chrome.ChromeDriver

class MainPage {
  @Test
  fun openPage(){
      WebDriverManager.chromedriver().setup()
      var  driver = ChromeDriver()
      driver.get("https://www.google.ru/")
      driver.xPathElement("").click()
  }
}