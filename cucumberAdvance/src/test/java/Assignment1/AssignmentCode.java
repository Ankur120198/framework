package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentCode {
WebDriver driver= null;


@Before("@Capgemini")
public void setup() {

WebDriverManager.chromedriver().setup();



driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
driver.manage().window().maximize();
driver.get("https://www.google.co.in/");
driver.findElement(By.name("q")).sendKeys("Capgemini");
driver.findElement(By.name("btnK")).click();
	
	
}

@Before("@Accenture")
public void setup1() {
	WebDriverManager.edgedriver().setup();
	
	
	
	driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.name("q")).sendKeys("Accenture");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	

	
}

@After
public void tearDown() {
	driver.close();
	driver.quit();
}
	


	@Given("user is on google page")
	public void user_is_on_google_page() {
		
	   
		System.out.println("Inside step: user is on google page ");
		
	}

	@When("user searches for search")
	public void user_enters_company_name() {
	    System.out.println("Inside step:user searches for search  ");
	    
	}
	@Then("user closes the browser")
	public void user_clicks_on_search_button() {
	   System.out.println("Inside step: user closes the browser");
	}
	



}
