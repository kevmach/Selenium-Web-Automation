import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class Mytest {

        //-----------------------------------Global Variables-----------------------------------
        //Declare a Webdriver variable
        public WebDriver driver;
        String url = "";
        String Email = "";
        String Password = "";
        //-----------------------------------Test Setup-----------------------------------
        @BeforeMethod
        public void setupTest() {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\kelvin.machinda\\Desktop\\MAVEN\\geckodriver.exe");
            //Create a new FireFox
            //driver = new FirefoxDriver();
            url = "http://automationpractice.com/index.php";
            Email = "testautomationmfs@gmail.com";
            Password = "TestAutomation@123";
        }

        @Test
        public void Login() throws InterruptedException {
            Login User= new Login();
            Assert.assertEquals("MY ACCOUNT", User.login(url, Email, Password));
        }

        @Test
        public void FetchApparels()throws InterruptedException{
            FetchApparels User= new FetchApparels();
            Assert.assertEquals("MY ACCOUNT", User.fetchapparels(url, Email, Password));
        }

        @Test
        public void AddtoCart()throws InterruptedException{
            AddtoCart User= new AddtoCart();
            Assert.assertEquals("Product successfully added to your shopping cart", User.addtocart(url, Email, Password));
        }

        @Test
        public void VerifyTotalCost() throws InterruptedException {
            VerifyTotalCost Login= new VerifyTotalCost();
            Assert.assertEquals("Correct Calculation", Login.verifytotalcost(url, Email, Password));
        }



        @AfterMethod
        public void teardownTest() {
            //Close browser and end the session
            //driver.quit();
        }
    }



