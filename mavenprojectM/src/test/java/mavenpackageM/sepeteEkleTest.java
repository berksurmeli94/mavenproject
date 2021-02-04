package mavenpackageM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sepeteEkleTest {
    
    public void senkoybendurdeyince(String url) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.id("product_id_634881560")).click();


        /* Burada Selenium'da ja js execute edebildiğimi farkettim. Unclikable elementleri handle edilebiliyor. Kısa zamanda çok yoğunluk yaşadığım için uygulamanın kalanına uygulamadım.  */
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor)driver).executeScript("document.getElementById('add-to-basket').click();");
        } else {
            throw new IllegalStateException("This driver does not support JavaScript!");
        }

        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor)driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[4]/div[3]/a/div[1]/span[2]"))).executeScript("mouseover();");
        } else {
            throw new IllegalStateException("This driver does not support JavaScript!");
        }

        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor)driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[4]/div[3]/div/div/div/div[2]/div[4]/div[1]/a"))).executeScript("click();");
        } else {
            throw new IllegalStateException("This driver does not support JavaScript!");
        }
       
        
        

        // String priceText = driver.findElement(By.xpath("//*[@id='sp-price-highPrice']")).getText();
        // String[] pieces = priceText.split("TL");
        // Double price = Double.parseDouble(pieces.toString());

        // driver.findElement(By.xpath("//*[@id='add-to-basket']")).click();
        // driver.findElement(By.xpath("//*[@id='header_wrapper']/div[4]/div[3]/a")).click();

        // String sepet = driver.findElement(By.xpath("//*[@id='cart-items-container']/div[1]/table/tbody/tr/td[2]/div/h1")).getText();

        // if( sepet == "Alışveriş Sepetim" ) {
        //     logger.info("Sepet sayfasına giriş başarılı!");
        // } else logger.info("Sepet sayfasına giriş başarısız!");
        
        // String cartPriceText = driver.findElement(By.xpath("//*[@id='cart-item-456177973']/div[2]/div[5]/div[1]/div[1]/strong")).getText();
        // String[] pieces2 = cartPriceText.split("TL");

        // Double cartPrice = Double.parseDouble(pieces2.toString());

        // if(price == cartPrice) {
        //     logger.info("Fiyatlar tutuyor!");
        // } 
        // else if(price > cartPrice) { logger.info("İndirim mi yoksa o_o"); }
        // else { logger.info("Saniyede zam geldi, puu!"); }

        // driver.findElement(By.xpath("//*[@id='cart-item-456177973']/div[2]/div[4]/div/span[2]")).click();


        // String biseyler = driver.findElement(By.xpath("//*[@id='cart-item-456177973']/div[2]/div[5]/div[1]/div[1]/strong")).getText();
        // String[] birseyler = biseyler.split("TL"); /* şey ayrı yazılır */
        // Double birfiyat = Double.parseDouble(birseyler.toString());

        // if(cartPrice == birfiyat) {
        //     logger.info("Sepetteki ürün sayısı artmadı!");
        // } 
        // else if(cartPrice > birfiyat) { logger.info("Sepetteki ürün sayısı azalmış!"); }
        // else { logger.info("Sepetteki ürün sayısı arttı!"); }

        // driver.findElement(By.xpath("//*[@id='cart-item-456178927']/div[2]/div[3]/div/div[2]/div/a[1]")).click();

        // String birUrunYok = "Sepetinizde ürün bulunmamaktadır.";

        // if(birUrunYok == driver.findElement(By.xpath("//*[@id='empty-cart-container']/div[1]/div[1]/div/div[2]/h2")).getText()) {
        //     logger.info("Sepet temizledi!");
        // } else logger.info("Sepet temizlenmedi!");

        
    }
}
