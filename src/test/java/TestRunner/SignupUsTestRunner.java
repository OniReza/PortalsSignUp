package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/SignUp/SignUp.feature",glue = "StepDefinations",
        tags="@ardupay",
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class SignupUsTestRunner {
}

/*
Important:: Don't run @plan1 in Clubswan

tags: @starterlite or @plan1 or @plan2 or @plan3 or @plan4 or @plan5 or @plan6 or @plan7 or @plan8


 */