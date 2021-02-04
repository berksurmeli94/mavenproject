package mavenpackageM;

import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class loginProcess {

    private static final Logger logger = LogManager.getLogger(loginProcess.class);

    public void login(String url) {

        String url2 = "https://www.gittigidiyor.com/";
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        
        driver.findElement(By.xpath("//*[@id='L-UserNameField']")).sendKeys("test00123233@gmail.com");
        driver.findElement(By.xpath("//*[@id='L-PasswordField']")).sendKeys("Test+123456");

        WebElement result = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='gg-login-enter']")));
            logger.info(result);
        /* Şöyle bir şey olabilir miydi ? result.click(); */
        driver.findElement(By.xpath("//*[@id='gg-login-enter']")).click();
        
        if(url2 == driver.getCurrentUrl()){
            logger.info("Giriş Başarılı!" + url);
        }
        else logger.error("Eveeet burada birkaç senaryo söz konusu ama olmadı yani!");

        // Bu(logger.info(message);) arkadaşlardan serpiştirdim sonradan sorunu çözersem diye fakat sanırım şuan sadece console debugları yazıyor */

        driver.quit();
    }
}
