import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCart {
    String output1="";
    WebDriver driver = new FirefoxDriver();
    public String addtocart(String url, String Email, String Password) throws InterruptedException{
        driver.get(url);
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

        WebElement women = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
        women.click();

        WebElement dresses = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[1]/div[1]/div/ul/li[2]/a"));
        dresses.click();

        WebElement eveningdresses = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[1]/div[1]/div/ul/li[2]/a"));
        eveningdresses.click();

        //Choose Medium
        WebElement medium = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[1]/div[1]/div[1]/form/div/div[2]/ul/li[2]/label/a"));
        medium.click();

        //Selecting Color
        WebElement color = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[1]/div[1]/div[1]/form/div/div[2]/ul/li[2]/label/a"));
        color.click();

        WebDriverWait wait1 = new WebDriverWait(driver,60);
        WebElement priceslider = wait1.until(ExpectedConditions.visibilityOfElementLocated(new By.ByClassName("ui-slider-handle")));
        Thread.sleep(1000);
        priceslider.click();

        WebElement priceslider2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[1]/div[1]/div[1]/form/div/div[10]/ul/div/div/a[2]"));
        Thread.sleep(1000);

        Actions action = new Actions(driver);
        action.dragAndDropBy(priceslider, 50,0).perform();
        action.dragAndDropBy(priceslider, -8,0).perform();

        //Instantiate Action Class
        Actions actions1 = new Actions(driver);
//Retrieve WebElement 'Women' to perform mouse hover
        WebElement menuOption1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img"));
//Mouse hover menuOption 'Groceries'
        //actions.moveToElement(menuOption1).perform();
        System.out.println("Done Mouse hover on 'Women' from Menu"+menuOption1.getText());
//Now Select '' from sub menu which has got displayed on mouse hover of 'Staples and Grains'
        WebElement subMenuOption1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[2]/spa"));
//Mouse hover menuOption 'Rock'
        subMenuOption1.click();

        driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]")).sendKeys(("3"+ Keys.ENTER));

        WebElement dropdown= driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
        Select select = new Select(dropdown);
        select.selectByIndex(1);

        //Select Color
        WebElement pink = driver.findElement(By.xpath("//*[@id=\"color_24\"]"));
        pink.click();

        //add to cart
        WebElement addtocart = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span"));
        addtocart.click();

        String text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[1]/h2")).getText();
        output1=text;
        driver.close();
        return output1; }

}
