package stepsCommon;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/main/java/testCaseFeatures", 
						glue = {"pagesPOM","stepsCommon"},
						//tags= {"@smoke or @sanity"},
						monochrome= true) 
public class RunJunit {


}
