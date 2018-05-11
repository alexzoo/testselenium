import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * Created by itdev4 on 27.03.2018.
 */
public class MainClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/alexzoo/Documents/projects/testselenium/drivers/chromedriver 2");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://ebay.com");

        WebElement link = driver.findElement(By.xpath("//tr[@role='list']//a[text()='Электроника']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(link).build().perform();



        //driver.quit();

    }

}
