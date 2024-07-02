package definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	WebDriver driver;
	

@Given("User Landed on Herokuapp")
public void user_landed_on_herokuapp() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/login");
	Thread.sleep(3000);
}


@When("User enters Username,Password")
public void user_enters_username_password() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("username")).sendKeys("tomsmith");
	driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

	
}

@When("click on Login Page")
public void click_on_login_page() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@Then("User should able to login")
public void user_should_able_to_login() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	//driver.wait(3000);
	
}


}
