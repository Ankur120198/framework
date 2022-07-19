package stepsForHooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooksCode {
	WebDriver driver = null;
	@Before("@Smoke")
	public void setup() {
		System.out.println("inside: Setup");
		
		WebDriverManager.chromedriver().setup();
		
		
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		driver.get("https://example.testproject.io/web/");
		
	}
	@Before(order=1)
	public void setup1() {
		System.out.println("Inside: Setup1");
		
	}
	@Before(value= "@Smoke",order=2)
	public void setup2() {
		System.out.println("Inside: Setup2");
	}
@After("@Smoke")
public void teardown() {
	System.out.println("inside : teardown");
	driver.close();
	driver.quit();
}
@After(order=2)
public void teardown1() {
	System.out.println("inside: teatdown1");
	
}
@BeforeStep
public void bStep() {
	System.out.println("Inside: BeforeStep");
	
}
@AfterStep
public void aStep() {
	System.out.println("Inside: After Step");
	
}
@Given("I want to write a step with precondition")
public void user_is_on_login_page() {
	System.out.println("Inside: I want to write a step with preconditio ");
}
@When("some other precondition")
public void user_enters_username_and_password(){
	System.out.println("Inside: some other precondition");
	

	
}

@And("I complete action")
public void clicks_on_login_page() throws InterruptedException {
	System.out.println("Inside: I complete action");
	
}
}
