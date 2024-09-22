package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\sharm\\Documents\\workspace-STS\\EVALUATION_3\\src\\test\\resources\\Project\\Ebay.feature",
glue = "steps")
public class EbayRunner extends AbstractTestNGCucumberTests {

}
