package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentHRMCode {
WebDriver driver = null;
@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();



		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
	//	driver.get("https://www.google.co.in/");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		
		
		
	}

@After
public void tearDown() {
	driver.close();
	driver.quit();
	
}

		@Given("user is on login page")
		public void user_is_on_login_page() {
			System.out.println("Inside step:user is on login page ");
			//driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			
		}
		
	
	
	

	@Then("login using userid: Admin and Password: admin123")
	public void login_using_userid_admin_and_password_admin123() {
		System.out.println("inside step:login using userid: Admin and Password: admin123 ");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		
	}
	@Then("user clicks on admin")
	public void user_clicks_on_admin() {
		
		System.out.println("inside step:user clicks on admin ");
		//driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		if(driver.getPageSource().contains("Welcome Berney")==true) {
			System.out.println("username present");
		}
		else {
			System.out.println("username is not present");
		}
		
		
	}
	@Then("user navigate to user management")
	public void user_navigate_to_user_management() {
		System.out.println("inside step: user navigate to user management");
		
	}
	
	
	
	
	@Then("user clicks on users")
	public void user_clicks_on_users() {
		System.out.println("inside step: user clicks on users");
		

		
	}
	
	
	
 @And("user enters username")
 public void user_enters_username() {
		System.out.println("inside step: user enters username");
		

 }




}
