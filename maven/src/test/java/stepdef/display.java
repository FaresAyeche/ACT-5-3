package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class display {
	
	
	WebDriver driver=null;
	@Given("^I have an opned googlechrome navigatore$")
	public void i_have_an_opned_googlechrome_navigatore() {
		System.out.println("Inside Step - browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); 	
	}

	@When("^I run website ToDo$")
	public void i_run_website_ToDo()  {
	   driver.navigate().to("https://todomvc.com/examples/react/#/");
	  
	}

	@And("the logo of the web site exist")
	public void the_logo_of_the_web_site_exist() {
		driver.findElement(By.className("learn-bar"));
	}
	@And("user can hit character in the search bar")
	public void user_can_hit_character_in_the_search_bar() {
		
		
		driver.findElement(By.className("new-todo")).sendKeys("username");
		driver.findElement(By.className("new-todo")).sendKeys(Keys.ENTER);
	}
	@Then("char hited by user displayed")
	public void char_hited_by_user_displayed() {
		driver.findElement(By.className("edit"));
	  
	}

	
	
	

}
