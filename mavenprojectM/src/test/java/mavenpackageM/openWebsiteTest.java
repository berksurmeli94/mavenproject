package mavenpackageM;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class openWebsiteTest {
    
    private static final Logger logger = LogManager.getLogger(openWebsiteTest.class);  
    public void testOpen(String url) {
        
        String url1 = "https://www.gittigidiyor.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try{
            
            driver.get(url);

            if(url1 == driver.getCurrentUrl()) {
                logger.debug("Siteye erişim başarılı!" + url);
            }
        }
        catch(Exception e){
            logger.error("Siteye erişilemedi." + e.getMessage());
        }

        driver.quit();
    }  
}
