import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class KeyboardAndMouseInput{
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        WebElement create=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        create.click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("snehitha");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Reddy");
        driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("snehitha@gmail.com");
        driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("snehitha@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("Snehi5678@");
        Thread.sleep(1000);
        Select day=new Select(driver.findElement(By.id("day")));
        Thread.sleep(1000);
        day.selectByIndex(24);
        Select month=new Select(driver.findElement(By.id("month")));
        Thread.sleep(1000);
        month.selectByVisibleText("Aug");
        Select year=new Select(driver.findElement(By.id("year")));
        Thread.sleep(1000);
        year.selectByValue("2002");
        driver.findElement(By.cssSelector("input[value='1']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("button[name='websubmit']")).click();
        Thread.sleep(10000);

        driver.quit();



    }
}