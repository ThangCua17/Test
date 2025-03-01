import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumTest {
    ChromeDriver driver;
    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @Test
    public void test() {
//        driver.get("https://vitimex.com.vn/");
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        WebElement btnIcon = driver.findElement(By.xpath("//div[@class='li_log']"));
//        btnIcon.click();
//        WebElement inpSDT = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='account']")));
//        inpSDT.sendKeys("0987194692");
//        WebElement inpPass = driver.findElement(By.xpath("//input[@id='pass']"));
//        inpPass.sendKeys("123456");
//        WebElement btnDN = driver.findElement(By.xpath("//a[@id='signin-btn']"));
//        btnDN.click();
        //Them vao gio hang
        driver.get("https://vitimex.com.vn/ao-polo-pc14.html");
        Actions action = new Actions(driver);
        WebElement btnAnh = driver.findElement(By.xpath("//a[7]//div[1]//img[2]"));
       action.moveToElement(btnAnh).click().perform();
        WebElement btnSize = driver.findElement(By.xpath("//a[@id='size4']"));
        btnSize.click();
        WebElement btnGH = driver.findElement(By.xpath("//a[@id='addCart_page0']"));
        action.moveToElement(btnGH).click().perform();





    }
}
