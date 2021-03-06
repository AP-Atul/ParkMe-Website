package test;

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
public class AddnewcarwrongidTest {
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
  public void addnewcarwrongid() {
    driver.get("http://localhost:8080/ParkMe/index.jsp");
    driver.manage().window().setSize(new Dimension(1280, 720));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("login-username")).click();
    driver.findElement(By.id("login-username")).sendKeys("atulpatare99@gmail.com");
    driver.findElement(By.id("login-password")).sendKeys("atul");
    driver.findElement(By.id("btn-signin")).click();
    driver.findElement(By.cssSelector(".badge")).click();
    driver.findElement(By.name("inputName")).click();
    driver.findElement(By.name("inputName")).sendKeys("Mercedes M11");
    driver.findElement(By.name("inputPlate")).click();
    driver.findElement(By.name("inputPlate")).sendKeys("NH 17dnsndsmndms");
    driver.findElement(By.cssSelector(".btn")).click();
    assertThat(driver.findElement(By.cssSelector(".text-center")).getText(), is("*** Car Creation Failed ***"));
    
  }
}
