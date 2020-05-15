package pageobjt;



//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Updatinglogin {
    @FindBy(xpath = "//html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a") 
	public static WebElement Myprofile;
    @FindBy(how = How.NAME,using = "phone")
	public static WebElement Phonenumber;
    @FindBy(name = "city")
	public static WebElement City;
    @FindBy(xpath = "//*[@id=\"profilefrm\"]/div/div/div[7]/div/button")
	public static WebElement sumit;
	
	
	
	
	
	
	
	
	
	
//	public static WebElement Myprofile(WebDriver driver)
//	{
//		return driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a"));
//	}
//	
//	public static WebElement Phonenumber(WebDriver driver)
//	{
//		return driver.findElement(By.name("phone"));
//	}
//	
//	public static WebElement  City(WebDriver driver)
//	{
//		return driver.findElement(By.name("city"));
//	}
//	
//	public static WebElement sumit(WebDriver driver)
//	{
//		return driver.findElement(By.xpath("//*[@id=\"profilefrm\"]/div/div/div[7]/div/button"));
//	}
	
	
	
	
}
