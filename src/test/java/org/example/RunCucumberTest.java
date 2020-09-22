package org.example;

//import io.cucumber.junit.Cucumber;
//import org.junit.runner.RunWith;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.DataProvider;

//@RunWith(Cucumber.class)
//@CucumberOptions(features = {"src/test/resources/org/example"}, glue = "StepDefinitions", plugin = {"pretty"})
public class RunCucumberTest extends AbstractTestNGCucumberTests {


    @Before
    public void init() {
        System.out.println("START");
    }

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @After
    public void end() {
        System.out.println("END");
    }
}
