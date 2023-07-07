package com.loop.runner;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/html-reports/cucumber-reports.html",
                "json:target/json-reports/json-report",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features/",
        glue = "com/loop/step_definitions",
        dryRun = false,
        tags = "@wip",
        monochrome = true,
        publish = false
)
public class Runner {

}
