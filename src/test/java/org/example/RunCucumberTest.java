package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
//import cucumber.api.junit.Cucumber;
//import io.cucumber.junit.Cucumber;
//import net.serenitybdd.cucumber.CucumberWithSerenity;
//import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

//@RunWith(Cucumber.class)
//@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features = "src/test/resources/org/example/adresse.feature", plugin = {"pretty"})
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
