// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LoginTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void login() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1034, 640));
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys("devopsschool");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(1) > .rc .LC20lb > span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector("div:nth-child(1) > .rc .LC20lb > span")).click();
    driver.findElement(By.cssSelector(".head > b")).click();
    assertThat(driver.findElement(By.cssSelector(".head > b")).getText(), is("Welcome to DevOps School!"));
  }
}
