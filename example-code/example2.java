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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
public class example2 {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.gecko.driver","C:\\tools\\selenium\\web-drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","C:\\tools\\selenium\\web-drivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        //String baseUrl = "https://www.devopsschool.com/";
        //String expectedTitle = "DevOpsSchool.com";
        //String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        //driver.get(baseUrl);

        // get the actual value of the title
        //actualTitle = driver.getTitle();

	
		driver.get("http://13.127.223.242/wp-login.php/");
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("admin123");
		driver.findElement(By.id("wp-submit")).click();
		driver.findElement(By.cssSelector(".welcome-panel-content > h2")).click();
		assertThat(driver.findElement(By.cssSelector(".welcome-panel-content > h2")).getText(), is("Welcome to WordPress!"));
	
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       */
        //close Fire fox
        driver.close();
       
    }

}