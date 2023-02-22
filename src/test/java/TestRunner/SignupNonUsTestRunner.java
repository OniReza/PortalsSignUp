package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/SignUp/SignUp_non_us.feature",glue = "StepDefinations",
        tags="@plan1",
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class SignupNonUsTestRunner {
}
/*
tags: @plan1 or @plan2 or @plan3 or @plan4 or @plan5 or @plan6 or @plan7 or @plan8
 */