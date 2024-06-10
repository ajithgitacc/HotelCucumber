package org.omrbranch.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@Book",glue="org.omrbranch.stepdefinition",features="src\\test\\resources\\Features",dryRun =false)
public class TestRunnerClass {
	
}
