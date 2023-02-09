package StepDefinations;

import Pages.SignUp_Page;
import Utility.*;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.*;
import java.util.concurrent.TimeUnit;
import static Utility.Hooks.getDriver;

public class SignUp_Step {
    public WebDriver driver;
    SignUp_Page signuppage;
    SmartWait smartWait = new SmartWait();

    public SignUp_Step() {
        this.driver = Hooks.getDriver();
        signuppage = new SignUp_Page(driver);
    }

    @After(order = 1)
    public void takeScraenshotOnFailure(Scenario scenario) {

        if (scenario.isFailed()) {

            final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }

    @Given("A valid url for desired portal")
    public void a_valid_url_for_desired_portal() {
        String URL = BaseData.BaseUrlMain();
        String PURL = BaseData.BasePopUpUrl();
        driver.get(PURL);
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @When("user inputs email")
    public void user_enters_email() throws Exception {
        signuppage.enterEmail();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @When("user inputs email for non-us")
    public void user_inputs_email_non_us() throws Exception, IOException {
        signuppage.enterEmailnon_us();
        Thread.sleep(4000);
    }

    @When("user inputs email for non-us member details and clicks continue")
    public void user_inputs_email_for_non_us_member_details_and_clicks_continue() throws Exception {
        signuppage.enterEmailnon_us();
        signuppage.continueBtnClick();
        Thread.sleep(4000);
    }

    @And("user inputs personal details")
    public void user_inputs_personal_details() throws InterruptedException, IOException {
        signuppage.residentCountry();
        signuppage.name();
        signuppage.address();
        signuppage.setState();
        signuppage.phoneNumber();
        signuppage.Password();
        signuppage.dob();
        signuppage.enterSSN();
        signuppage.checkBoxesclick();
    }

    @And("user inputs personal details for non-us members")
    public void user_inputs_personal_details_for_non_us_members() throws InterruptedException {
        signuppage.residentCountrynon_us();
        signuppage.name();
        signuppage.dob();
        signuppage.address();
        signuppage.phoneNumber();
        signuppage.Password();
        signuppage.checkBoxesclick();
    }

//    @When("user enters Email for non-us Accounts")
//    public void user_enters_email_non_us() throws Exception {
//        signuppage.enterEmailnon_us();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }

    @And("Clicks Continue")
    public void clicks_continue() throws Exception {
        signuppage.continueBtnClick();
       smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user selects Country UK")
    public void user_selects_country_uk() throws InterruptedException {
        signuppage.residentCountrynon_us();
    }

    @And("Subscription page will appear")
    public void subscription_page_will_appear() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue("Subscription page not appeared", signuppage.subscriptionPageCheck());

    }

    @And("user selects Starter Lite plan")
    public void user_selects_starter_lite_plan() throws InterruptedException {
        Thread.sleep(2000);
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getGetStarterLite();
        Thread.sleep(3000);
    }

    @And("user selects Standard plan")
    public void user_selects_standard_plan() throws InterruptedException {
        Thread.sleep(2000);
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getFirstPlan();
        Thread.sleep(3000);
    }

    @When("user selects first plan")
    public void user_selects_first_plan() throws Exception {
        user_enters_email();
        signuppage.continueBtnClick();
        user_inputs_personal_details();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getFirstPlan();
        Thread.sleep(8000);
    }

    @When("user selects second plan")
    public void user_selects_second_plan() throws Exception {
        user_enters_email();
        signuppage.continueBtnClick();
        user_inputs_personal_details();
        subscription_page_will_appear();
        clicks_continue();
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getSecondPlan();
        Thread.sleep(8000);
    }

    @When("user selects third plan")
    public void user_selects_third_plan() throws Exception {
        user_enters_email();
        signuppage.continueBtnClick();
        user_inputs_personal_details();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getThirdPlan();
        Thread.sleep(2000);
    }

    @When("user selects fourth plan")
    public void user_selects_fourth_plan() throws Exception {
        user_enters_email();
        signuppage.continueBtnClick();
        user_inputs_personal_details();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getFourthPlan();
        Thread.sleep(2000);
    }

    @When("user selects fifth plan")
    public void user_selects_fifth_plan() throws Exception {
        user_enters_email();
        signuppage.continueBtnClick();
        user_inputs_personal_details();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getFifthPlan();
        Thread.sleep(2000);
    }

    @When("user selects sixth plan")
    public void user_selects_sixth_plan() throws Exception {
        user_enters_email();
        signuppage.continueBtnClick();
        user_inputs_personal_details();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getSixthPlan();
        Thread.sleep(2000);
    }

    @When("user selects seventh plan")
    public void user_selects_seventh_plan() throws Exception {
        user_enters_email();
        signuppage.continueBtnClick();
        user_inputs_personal_details();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getSeventhPlan();
        Thread.sleep(2000);
    }

    @When("user selects eighth plan")
    public void user_selects_eigth_plan() throws Exception {
        user_enters_email();
        signuppage.continueBtnClick();
        user_inputs_personal_details();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getEighthPlan();
        Thread.sleep(2000);
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++Non US++++++++++++++++++++++++++++++++++++++++++++++++
    @When("user selects first plan non-us")
    public void user_selects_first_plan_non_us() throws InterruptedException {
        signuppage.getFirstPlan();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @When("user selects second plan non-us")
    public void user_selects_second_plan_non_us() throws Exception {
        user_inputs_email_non_us();
        clicks_continue();
        user_inputs_personal_details_for_non_us_members();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getSecondPlan();
    }

    @When("user selects third plan non-us")
    public void user_selects_third_plan_non_us() throws Exception {
        user_inputs_email_non_us();
        clicks_continue();
        user_inputs_personal_details_for_non_us_members();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(10);
        signuppage.getThirdPlan();

        Thread.sleep(2000);
    }

    @When("user selects fourth plan non-us")
    public void user_selects_fourth_plan_non_us() throws Exception {
        user_inputs_email_non_us();
        clicks_continue();
        user_inputs_personal_details_for_non_us_members();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getFourthPlan();
        Thread.sleep(2000);
    }

    @When("user selects fifth plan non-us")
    public void user_selects_fifth_plan_non_us() throws Exception {
        user_inputs_email_non_us();
        clicks_continue();
        user_inputs_personal_details_for_non_us_members();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getFifthPlan();
        Thread.sleep(2000);
    }

    @When("user selects sixth plan non-us")
    public void user_selects_sixth_plan_non_us() throws Exception {
        user_inputs_email_non_us();
        clicks_continue();
        user_inputs_personal_details_for_non_us_members();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getSixthPlan();
        Thread.sleep(2000);
    }

    @When("user selects seventh plan non-us")
    public void user_selects_seventh_plan_non_us() throws Exception {
        user_inputs_email_non_us();
        clicks_continue();
        user_inputs_personal_details_for_non_us_members();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getSeventhPlan();
        Thread.sleep(2000);
    }

    @When("user selects eighth plan non-us")
    public void user_selects_eighth_plan_non_us() throws Exception {
        user_inputs_email_non_us();
        clicks_continue();
        user_inputs_personal_details_for_non_us_members();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getEighthPlan();
        Thread.sleep(2000);
    }

    @And("user checks card design")
    public void user_checks_card_design() throws InterruptedException {
        signuppage = new SignUp_Page(driver);
        smartWait.waitUntilPageIsLoaded(5);
        Assert.assertTrue("Card Image didn't appear", signuppage.cardImageCheck());
    }

    @And("Clicks Continue again")
    public void clicks_continue_again() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.cntc();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user clicks on subscribe button")
    public void user_clicks_on_subscribe_button() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.subscribeBtnClick();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user selects payment method card")
    public void user_selects_payment_method_card() throws InterruptedException {
        //signuppage = new SignUp_Page(driver);
        signuppage.cardPayment();
        smartWait.waitUntilPageIsLoaded(10);
    }

    @And("checks payment confirmation message")
    public void checks_payment_confirmation_message() throws InterruptedException {
        signuppage = new SignUp_Page(driver);
        Assert.assertTrue("Payment Confirmation", signuppage.confirmatonCheck());
        smartWait.waitUntilPageIsLoaded(10);
    }

    @And("checks payment confirmation message and clicks ok")
    public void checks_payment_confirmation_message_and_clicks_ok() throws InterruptedException {
        signuppage = new SignUp_Page(driver);
        Assert.assertTrue("Payment Confirmation", signuppage.confirmatonCheck());
        smartWait.waitUntilPageIsLoaded(10);
        signuppage.okBtnClick();
    }

    @Then("user press OK")
    public void user_press_ok() {
        signuppage = new SignUp_Page(driver);
        signuppage.okBtnClick();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        smartWait.waitUntilPageIsLoaded(5);
    }
    @Then("waiting for subscription should appear")
    public void waiting_for_subscription_should_appear() {
        smartWait.waitUntilPageIsLoaded(10);
        Assert.assertTrue("Waiting Message Appeared", signuppage.waitMsgCheck());
    }


}
