import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    private static long millis;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/ahaber/Documents/Linkedin learning/Selenium Essential Training/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("Intendente Neyer 1220, Béccar, Buenos Aires Province, Argentina");
        Thread.sleep( millis:1000);

        WebElement autocompleteresult = driver.findElement(By.className("pac-item"));
        autocompleteresult.click();

        driver.quit();
    }
}
