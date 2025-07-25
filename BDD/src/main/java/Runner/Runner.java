package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="featureFiles/Login.feature",//Location of feature feature file
		glue="StepDefinition"//Mention the package name where selenium implementation is present
		)
public class Runner extends AbstractTestNGCucumberTests 
{

}
