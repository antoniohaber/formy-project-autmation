import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/ahaber/Documents/Linkedin learning/Selenium Essential Training/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalbutton = driver.findElement(By.id("modal-button"));
        modalbutton.click();

        WebElement closebutton = driver.findElement(By.id("close-button"));
        JavascriptExecutor JS = (JavascriptExecutor) driver;

        JS.executeScript("arguments [0].click();", closebutton);

        driver.quit();
    }
}
