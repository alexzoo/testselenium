import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by itdev4 on 27.03.2018.
 */
public class MainClass {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumhq.org");

    }
}
