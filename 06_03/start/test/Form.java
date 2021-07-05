import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.plugin.com.JavaClass;

import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/ahaber/Documents/Linkedin learning/Selenium Essential Training/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        JavaClass javaClass = new JavaClass();
       JavaClass.submitForm(driver);

        waitforAlertBanner (driver);

            assertEquals("The form was successfully submitted!", getAlertBannerText(driver));

        driver.quit();
    }



    public static void waitforAlertBanner (WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
       wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));

    }

    public static Object getAlertBannerText (WebDriver driver){
        return driver.findElement(By.className("alert")).getText();
    }
}
