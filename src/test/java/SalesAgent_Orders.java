
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SalesAgent_Orders {
    String output1="";
    String orders="";
    String PlaceOrders="";
    public String ViewOrders(String url, String Username, String Password) {

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
        WebElement dropDownMenu = driver.findElement(By.id("customer-order-parent-menu"));
        dropDownMenu.click();
        WebElement subMenu = driver.findElement(By.id("customer-order-view-menu"));
        subMenu.click();
        String text = driver.findElement(By.cssSelector("h3")).getText();
        if(text.contains("Customer Orders"))
        {
            orders="Pass";
        }
        else{
            orders="Failed";
        }
        driver.close();
        return orders;
    }

    public String PlaceOrder(String url, String Username, String Password) {

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
        WebElement dropDownMenu = driver.findElement(By.id("customer-order-parent-menu"));
        dropDownMenu.click();
        //WebElement subMenu1 = driver.findElement(By.xpath("//ul[@class='menu-subnav']//li[@id='customer-add-menu']//a[@class='menu-link']"));
        WebElement subMenu1 = driver.findElement(By.id("customer-place-order-menu"));
        subMenu1.click();
        String text = driver.findElement(By.cssSelector("h4")).getText();
        //System.out.println("My text is " +text);
        if(text.contains("Customer Name"))
        {
            PlaceOrders="Pass";
        }
        else{
            PlaceOrders="Failed";
        }
        driver.close();
        return PlaceOrders;
    }
}



