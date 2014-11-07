  
package start;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

/**
 * Created by PiriformAcer on 05/11/2014.
 */
public class LoginTest {

    //private WebDriver driver = new FirefoxDriver();




      @Test
    public void startTest() {

          System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("http://bravo.agomo.com");
          WebElement loginbtn1 = driver.findElement(By.id("topLoginButton"));
          loginbtn1.click();
          WebElement username1 = driver.findElement(By.className("textInputNew"));
          username1.sendKeys("senthil.kumar@test-direct.com");
          WebElement pass1 = driver.findElement(By.cssSelector("input[id='loginPassword']"));
          pass1.sendKeys("Password13");
          WebElement loginbtn2 = driver.findElement(By.id("loginOKButton"));
          loginbtn2.click();

          new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOfElementLocated(By.className("detailsViewLink")));

          assertEquals("Agomo | My Computers", driver.getTitle());
          Thank you;

          //assertEquals("xxx",driver.getTitle());


    }




}
