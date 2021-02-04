package mavenpackageM;

import java.io.FileInputStream;
import java.util.Properties;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    private static final String LOG_FILE = "log4j.properties";
    @Test
    public void open()
    {

        Properties properties = new Properties();
        
        
        try{
            properties.load(new FileInputStream(LOG_FILE));
            PropertyConfigurator.configure(properties);
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        } 
        catch(Exception e){
            System.out.println("There must be a mistake at setProperty or log4j");
        }
        

        String url = "https://www.gittigidiyor.com/";
        String url2 = "https://www.gittigidiyor.com/uye-girisi";
        String url3 = "https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2";

        openWebsiteTest ows = new openWebsiteTest();
        loginProcess lp = new loginProcess();
        ows.testOpen(url);
        lp.login(url2);
        aramaTest at = new aramaTest();
        at.arıyorumAbi(url);
        sepeteEkleTest set = new sepeteEkleTest();
        set.senkoybendurdeyince(url3);
        
    }
}
