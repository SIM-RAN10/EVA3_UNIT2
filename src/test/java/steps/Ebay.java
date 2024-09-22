package steps;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebay {
	
	WebDriver driver;
	
	@Given("Open the browser, enter the Ebay url.")
	public void open_the_browser_enter_the_ebay_url() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");

	}

	@Given("Click on Advanced link")
	public void click_on_advanced_link() {
		
		driver.findElement(By.linkText("Advanced")).click();
	    
	}

	@When("Select the appropriate options as displayed in the provided image")
	public void select_the_appropriate_options_as_displayed_in_the_provided_image() {
		
		driver.findElement(By.id("_nkw")).sendKeys("Shoes Adidas");
		
		WebElement Options = driver.findElement(By.cssSelector("[name='_in_kw']"));
		Select se= new Select(Options);
		se.selectByVisibleText("Any words, any order");
		
		driver.findElement(By.id("_ex_kw")).sendKeys("adidas S, L, M");
		
		WebElement Op = driver.findElement(By.cssSelector("[id='s0-1-17-4[0]-7[3]-_sacat']"));
		Select select = new Select(Op);
		select.selectByVisibleText("Collectibles");	
	   
	}

	@When("click on the using advanced search option link")
	public void click_on_the_using_advanced_search_option_link() {
		
//		driver.findElement(By.linkText("using advanced search options")).click();
	    
	}

	@When("user will handle the new window")
	public void user_will_handle_the_new_window() {


	}

	@Then("user will enter the search details")
	public void user_will_enter_the_search_details() {
		
		driver.findElement(By.cssSelector("[id='s0-1-17-6[4]-[2]-LH_ItemCondition']")).click();
		
		List<WebElement> checks = driver.findElements(By.cssSelector("[type='checkbox']"));
		
        for (WebElement ch : checks) {
			
			ch.click();
			
		}
        
        driver.findElement(By.cssSelector("[id='s0-1-17-5[6]-[1]-LH_LPickup']")).click();
        
        WebElement radio = driver.findElement(By.id("s0-1-17-6[7]-[1]-LH_PrefLoc"));
        radio.click();
        
//        driver.findElement(By.cssSelector("[id='s0-1-17-6[7]-4[@field[]]-3-_stpos']")).sendKeys("324322");
	}

	@Then("enter the inputs as per the provided three images")
	public void enter_the_inputs_as_per_the_provided_three_images() {
		
		driver.findElement(By.cssSelector("[name='_sasl']")).sendKeys("Ambani");
		
		WebElement dropdown3 = driver.findElement(By.cssSelector("[name='_sop']"));
		Select se3 = new Select(dropdown3);
		se3.selectByVisibleText("Price + Shipping: lowest first");
		
		WebElement dropdown4 = driver.findElement(By.cssSelector("[name='_dmd']"));
		Select se4= new Select(dropdown4);
		se4.selectByVisibleText("Gallery view");
		
	}

	@Then("user will perform search")
	public void user_will_perform_search() {
		
		driver.findElement(By.xpath("(//*[@class='btn btn--primary'])[2]")).click();
	    
	   
	}

	@Then("user will assert the search results")
	public void user_will_assert_the_search_results() {
		
        WebElement element = driver.findElement(By.cssSelector("[class='srp-save-null-search__heading']"));
		
		String expectedText = "No exact matches found";
		String actualText = element.getText(); 
		
		Assert.assertEquals(actualText, expectedText );
	    
	}

	@Then("user will close the browser")
	public void user_will_close_the_browser() {
		
		driver.close();
	    
	}


}
