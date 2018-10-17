package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepDefination {
	WebDriver driver;

@Given("^user is already on Login Page$")
public void user_is_already_on_Login_Page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Jars\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.freecrm.com/index.html"); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}// including the changes

@When("^title of login page is FreeCRM$")
public void title_of_login_page_is_FreeCRM(){
String title = driver.getTitle();
System.out.println(title);
Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Then("^user enter the username$")
public void user_enter_the_username() {
	driver.findElement(By.name("username")).sendKeys("naveenk");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Then("^user enter the password$")
public void user_enter_the_password() {
	driver.findElement(By.name("password")).sendKeys("test@123");
}

@Then("^user click on the Login button$")
public void user_click_on_the_Login_button() {
	WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", loginBtn);}

@Then("^user is on home page$")
public void user_is_on_home_page() {
	String homepagetitle = driver.getTitle();
	System.out.println(homepagetitle);
	Assert.assertEquals("CRMPRO", homepagetitle);

}

	

}
