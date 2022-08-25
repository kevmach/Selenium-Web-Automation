
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SalesAgent_Customers {
    String customers="";
    String Addcustomers="";
    WebDriver driver = new FirefoxDriver();
    public String ViewCustomers(String url, String Username, String Password) {

        driver.get(url);
        WebElement element=driver.findElement(By.xpath("//input[@name='email']"));
        element.sendKeys(Username);
        WebElement element2 = driver.findElement(By.xpath("//input[@name='password']"));
        element2.sendKeys(Password);
        //WebElement button = driver.findElement(By.id("kt_login_signin_submit"));
        WebElement button = driver.findElement(By.xpath("//*[@id='kt_login_signin_submit']"));
        //WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
        WebElement dropDownMenu = driver.findElement(By.id("customer-parent-menu"));
        dropDownMenu.click();
        WebElement subMenu = driver.findElement(By.xpath("//ul[@class='menu-subnav']//li[@id='customer-view-menu']"));
        subMenu.click();
        String text = driver.findElement(By.cssSelector("h3")).getText();
        if(text.contains("Customers"))
        {
            customers="Pass";
        }
        else{
            customers="Failed";
        }
        driver.close();
        return customers;
    }

    public String AddCustomers(String url, String Username, String Password) {

        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        WebElement element=driver.findElement(By.xpath("//input[@name='email']"));
        element.sendKeys(Username);
        WebElement element2 = driver.findElement(By.xpath("//input[@name='password']"));
        element2.sendKeys(Password);
        //WebElement button = driver.findElement(By.id("kt_login_signin_submit"));
        WebElement button = driver.findElement(By.xpath("//*[@id='kt_login_signin_submit']"));
        //WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
        WebElement dropDownMenu = driver.findElement(By.id("customer-parent-menu"));
        dropDownMenu.click();
        WebElement subMenu1 = driver.findElement(By.id("customer-add-menu"));
        subMenu1.click();
        String text = driver.findElement(By.cssSelector("h3")).getText();
        //System.out.println("My text is " +text);
        if(text.contains("Customer Details"))
        {
            Addcustomers="Pass";
        }
        else{
            Addcustomers="Failed";
        }
        driver.close();
        return Addcustomers;
    }
}



