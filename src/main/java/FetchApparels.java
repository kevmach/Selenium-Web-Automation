import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;
import java.util.List;


public class FetchApparels {
    String output1="";
    WebDriver driver = new FirefoxDriver();
    public String fetchapparels(String url, String Email, String Password) throws InterruptedException{
        driver.get(url);
        driver.manage().window().maximize();
        WebElement signin=driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a"));
        signin.click();
        WebElement element=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        element.sendKeys("testautomationmfs@gmail.com");
        Thread.sleep(1000);
        WebElement element2 = driver.findElement(By.id("passwd"));
        element2.sendKeys("TestAutomation@123");
        Thread.sleep(1000);
        //WebElement button = driver.findElement(By.id("kt_login_signing_submit"));
        WebElement button= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span"));
        button.click();
        Thread.sleep(1000);

        //Click Icon At Top Left
        WebElement logo= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/ul/li/a/span"));
        logo.click();

        //Identify prices

        List<WebElement>apparel_prices= (List<WebElement>) driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[1]/div/div[2]/span"));
        for(int i=0; i<apparel_prices.size(); i++){
            String text=apparel_prices.get(i).getText();
            System.out.println(text);
        }
//String Array
        String[] prices={"16.51","27.00","26.00","50.99","28.98","30.50","16.40"};
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));

        driver.close();
        return output1;
        }
}
