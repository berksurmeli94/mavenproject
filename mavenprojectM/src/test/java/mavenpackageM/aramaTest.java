package mavenpackageM;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class aramaTest {

    private static final Logger logger = Logger.getLogger(loginProcess.class);

    public void arıyorumAbi(String url) {
        
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        /* Bu xPath'ler hep copy-pasta */
        driver.findElement(By.xpath("//*[@id='main-header']/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("bilgisayar");

        WebElement result = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main-header']/div[3]/div/div/div/div[2]/form/div/div[2]/button")));
            logger.info(result);
        /* resul.click() olurdu sanki */
        driver.findElement(By.xpath("//*[@id='main-header']/div[3]/div/div/div/div[2]/form/div/div[2]/button")).click();

        String keyword = driver.findElement(By.xpath("//*[@id='search-result-info']/div[1]/div/div/h1/span")).getAttribute("search-result-keyword");
        if( keyword == "bilgisayar" ) {
            logger.info("Arama Başarılı!");
        } else logger.info("Arama Yapılamadı!");

        driver.quit();
    }
    
}
