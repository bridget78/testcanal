package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

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
