
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SalesAgent_Login {
    String output1="";
    String customers="";
    String Addcustomers="";
    WebDriver driver = new FirefoxDriver();
    public String login(String url, String Username, String Password){

        // FirefoxDriver driver=new FirefoxDriver();
        driver.get(url);
        WebElement element=driver.findElement(By.xpath("//input[@name='email']"));
        element.sendKeys(Username);
        WebElement element2 = driver.findElement(By.xpath("//input[@name='password']"));
        element2.sendKeys(Password);
        //WebElement button = driver.findElement(By.id("kt_login_signing_submit"));
        WebElement button = driver.findElement(By.xpath("//*[@id='kt_login_signin_submit']"));
        //WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
        String text = driver.findElement(By.cssSelector("h5")).getText();
        if(text.contains("Dashboard"))
        {
            output1="Pass";
        }
        else{
            output1="Failed";
        }
        driver.close();
        return output1;

    }
}


