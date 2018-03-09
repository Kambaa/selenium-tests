package tr.com.yusufgunduz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class MyFirstSeleniumTest {

    public static void main(String[] args) {

//      download from https://github.com/mozilla/geckodriver/releases
        System.setProperty("webdriver.gecko.driver", args[0]);
        if (null != args[1]) {
            System.setProperty("webdriver.firefox.bin", args[1]);
        }

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.yusufgunduz.com.tr");

        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        driver.close();
    }


}
