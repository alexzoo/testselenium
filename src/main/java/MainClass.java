import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by itdev4 on 27.03.2018.
 */
public class MainClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/alexzoo/Documents/projects/testselenium/drivers/chromedriver 2");

        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://market.yandex.ru");

        driver.findElement(By.xpath("//a[@class=\"link topmenu__link\" and text()='Бытовая техника']")).click();
        driver.findElement(By.xpath("//div[a[text()='Техника для дома']]/div/a[text()='Стиральные машины']")).click();

        System.out.println(driver.findElement(By.xpath("//span[text()='ATLANT']")).isSelected());

        driver.findElement(By.xpath("//span[text()='ATLANT']")).click();
        driver.findElement(By.xpath("//span[text()='Самовывоз']")).click();

        System.out.println(driver.findElement(By.xpath("//span[text()='ATLANT']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//span[text()='Самовывоз']")).isSelected());
        //driver.quit();

    }

    public static void selectRadioButton(String name){
        
    }
}
