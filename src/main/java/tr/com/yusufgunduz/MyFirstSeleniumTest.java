package tr.com.yusufgunduz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

class MyFirstSeleniumTest {

    public static void main(String[] args) throws Exception {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");


//        WebDriver webDriver = new ChromeDriver();
//        webDriver.get("http://yusufgunduz.com.tr");
////        new WebDriverWait(webDriver, 49L);
//        webDriver.navigate();
//        System.out.println(webDriver.getTitle());
//        webDriver.quit();

//
////        WebDriver driver = new ChromeDriver();
////        driver.navigate().to("https://www.google.com/xhtml");
////
////        System.out.println(driver.getPageSource());
////        driver.quit();


//        System.setProperty("webdriver.chrome.driver",
//                "C:\\Users\\ygndz\\Downloads\\chromedriver.exe");
//        ChromeOptions opt = new ChromeOptions();
//        opt.addArguments("disable-extensions");
//        opt.addArguments("--start-maximized");
//        WebDriver driver = new ChromeDriver(opt);
//        driver.navigate().to("http://www.yusufgunduz.com.tr");
//        new WebDriverWait(driver, 10L);
//        System.out.println(driver.getPageSource());
//        driver.quit();



//        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), DesiredCapabilities.firefox());

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ygndz\\Downloads\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
                driver.navigate().to("http://www.yusufgunduz.com.tr");
        System.out.println(driver.getPageSource());
        driver.close();
    }


}
