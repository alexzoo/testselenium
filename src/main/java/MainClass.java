import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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

        driver.get("https://www.w3schools.com/html/html_tables.asp");

        WebElement tableElement = driver.findElement(By.xpath("//table[@id=\"customers\"]"));

        Table table = new Table(tableElement, driver);

        System.out.println("Rows number is: " + table.getRowsWithColumns());
        System.out.println(table.getValueFromCell(2,3));
        System.out.println(table.getValueFromCell(4,"Company"));
        System.out.println(table.getValueFromCell(2,"Contact"));








        //driver.quit();

    }

}
