package testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Shweta\\Documents\\CucumberProject\\src\\test\\java\\features",
glue= {"stepdefination"},
plugin= {"pretty","html:target/HTmlreports.html"},monochrome=true)

public class Testrunner {

}
