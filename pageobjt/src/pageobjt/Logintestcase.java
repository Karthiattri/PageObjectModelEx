package pageobjt;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjts.Loginpageobjts;

public class Logintestcase {
	WebDriver driver;
@Test	
public void updating()
{
 driver=new FirefoxDriver();
driver.get("https://www.phptravels.net/login");

PageFactory.initElements(driver, Loginpageobjts.class);


Loginpageobjts.username.sendKeys("user@phptravels.com");
Loginpageobjts.password.sendKeys("demouser");
Loginpageobjts.sumit.click();

PageFactory.initElements(driver, Updatinglogin.class);
Updatinglogin.Myprofile.click();
Updatinglogin.Phonenumber.sendKeys("1234567890");
Updatinglogin.City.sendKeys("London");
Updatinglogin.sumit.click();





//Loginpageobjts.username(driver).sendKeys("user@phptravels.com");
//Loginpageobjts.password(driver).sendKeys("demouser");
//Loginpageobjts.login(driver).click();


//Updatinglogin.Myprofile(driver).click();
//Updatinglogin.Phonenumber(driver).sendKeys("123456789");
//Updatinglogin.City(driver).sendKeys("london");
//Updatinglogin.sumit(driver).click();





//
//WebElement username=driver.findElement(By.name("username"));
//username.sendKeys("user@phptravels.com");
//WebElement password=driver.findElement(By.name("password"));
//password.sendKeys("demouser");
//WebElement login=driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button"));
//login.click();
//WebElement myprofile=driver.findElement
//          (By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a"));
//myprofile.click();
//WebElement phone=driver.findElement(By.name("phone"));
//phone.sendKeys("12345667");
//WebElement City=driver.findElement(By.name("city"));
//City.sendKeys("london");
//
//WebElement sumit=driver.findElement(By.xpath("//*[@id=\"profilefrm\"]/div/div/div[7]/div/button"));
//sumit.click();
}}


