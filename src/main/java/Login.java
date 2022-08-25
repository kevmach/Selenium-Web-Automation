import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {
        String output1="";
        WebDriver driver = new FirefoxDriver();
        public String login(String url, String Email, String Password) throws InterruptedException{
            driver.get(url);
            WebElement signin=driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a"));
            signin.click();
            WebElement element=driver.findElement(By.xpath("//*[@id=\"email\"]"));
            element.sendKeys("testautomationmfs@gmail.com");
            Thread.sleep(1000);
            WebElement element2 = driver.findElement(By.id("passwd"));
            element2.sendKeys("TestAutomation@123");
            Thread.sleep(1000);
            //
            WebElement button= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span"));
            button.click();
            Thread.sleep(1000);
            String text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/h1")).getText();
            output1=text;
            driver.close();
            return output1; }
    }

}
