package Pages;

import Utility.CommonPage;
import Utility.CommonPageMethods;
import Utility.Random_data;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.*;

public class SignUp_Page extends CommonPageMethods {

    public static WebDriver driver;

    public static String email_non;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;
    @FindBy(xpath = "//div[@id=\"mui-component-select-country\"]")
    public WebElement countryDropdown;
    @FindBy(xpath = "//li[contains(text(),'United States of America')]")
    public WebElement usa;
    @FindBy(xpath = "//li[contains(text(),'Bangladesh')]")
    public WebElement bd;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@name='address1']")
    public WebElement address;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;
    @FindBy(xpath = "//input[@name='postCode' and @type='text']")
    public WebElement postCode;
    @FindBy(xpath = "//div[@role='button' and text()='Select']")
    public WebElement stateDropdown;
    @FindBy(xpath = "//li[@tabindex='-1' and @data-value='Alaska']")
    public WebElement alaska;
    @FindBy(xpath = "//span[contains(text(),'calendar_today')]")
    public WebElement datePicker;
    @FindBy(xpath = "//h6[contains(text(),202)]")
    public WebElement yearSelect;
    @FindBy(xpath = "//div[contains(text(),'1990')]")
    public WebElement birthYear;
    @FindBy(xpath = "//span[contains(text(),'OK')]")
    public WebElement dateOkbtn;
    @FindBy(xpath = "//div[@class='selected-flag']")
    public WebElement phoneDropdown;
    @FindBy(xpath = "//li[@class='search search-class']/input[@type='search']")
    public WebElement phnSearchBox;
    @FindBy(xpath = "//li[@data-country-code='bd']")
    public WebElement phnBD;
    @FindBy(xpath = "//input[@value='+880']")
    public WebElement phnNumBox;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement confirmPass;
    @FindBy(xpath = "//input[@name='agreement' and @type='checkbox']")
    public WebElement aggrementCheckBox;
    @FindBy(xpath = "//input[@name='terms' and @type='checkbox']")
    public WebElement termsCheckBox;
    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    public WebElement continueBtn;
    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//span[contains(text(),'not valid' ) or contains(text(),'validated') or contains(text(),'required')]")
    public WebElement phnValidationmsg;
    @FindBy(xpath = "//span[contains(text(),'Phone number required.')]")
    public WebElement phnNumReqired;
    @FindBy(xpath = "//span[contains(text(),'Personal Details')]")
    public WebElement personalDetails;
    //Plans For Clubswan us, non-us
    @FindBy(xpath = "(//*[local-name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-fontSizeLarge'])[2]")
    public WebElement carosol;


    //html/body/div[1]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]


    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]")
    public WebElement carosol3;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]")
    public WebElement carosol4;

    @FindBy(xpath = "//span[contains(text(),'Get Lite')]")
    public WebElement getLiteBtn;
    @FindBy(xpath = "//span[contains(text(),'I want starter lite')]")
    public WebElement iWantLiteBtn;
    @FindBy(xpath = "(//span[contains(text(),'Get') or contains(text(),'GET') ])[1]")
    public WebElement getPlan1;


    @FindBy(xpath = "(//span[contains(text(),'Get') or contains(text(),'GET') ])[2]")
    public WebElement getPlan2;
    @FindBy(xpath = "(//span[contains(text(),'Get') or contains(text(),'GET') ])[3]")
    public WebElement getPlan3;
    @FindBy(xpath = "(//span[contains(text(),'Get') or contains(text(),'GET') ])[4]")
    public WebElement getPlan4;
    @FindBy(xpath = "(//span[contains(text(),'Get') or contains(text(),'GET') ])[5]")
    public WebElement getPlan5;
    @FindBy(xpath = "(//span[contains(text(),'Get') or contains(text(),'GET') ])[6]")
    public WebElement getPlan6;
    @FindBy(xpath = "(//span[contains(text(),'Get') or contains(text(),'GET') ])[7]")
    public WebElement getPlan7;
    @FindBy(xpath = "(//span[contains(text(),'Get') or contains(text(),'GET') ])[8]")
    public WebElement getPlan8;
    @FindBy(xpath = "//*[@id=\"slide1\"]")
    public WebElement cardImage;
    @FindBy(xpath = "//span[text()='SUBSCRIBE' or text()='subscribe' or text()='Subscribe']")
    public WebElement subscribeBtn;
    @FindBy(xpath = "//div[@role='button' and text()='Select']")
    public WebElement paymentMthdDropdown;
    @FindBy(xpath = "//li[@role='option' and text()='Card']")
    public WebElement card;
    @FindBy(xpath = "//button[@role='button' and text()='OK']")
    public WebElement okBtn;
    @FindBy(xpath = "//span[text()='Payment Confirmation']")
    public WebElement paymentConfirmation;
    @FindBy (xpath = "//button[text()='Waiting for subscription confirmation']")
    public WebElement waitingMsg;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/div/div/div/div/div[5]/div/button")
    public WebElement cnt;

    public SignUp_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterEmail() throws Exception {
        email.sendKeys(Random_data.signUpEmail());

    }

    public void enterEmailnon_us() throws Exception {
        email.sendKeys(Random_data.signUpEmailnon_us());

    }




    public void continueBtnClick() {
        continueBtn.click();
    }

    public void residentCountry() throws InterruptedException, IOException {
        countryDropdown.click();
        Thread.sleep(500);
        click(usa);
    }

    public void residentCountrynon_us() throws InterruptedException {
        countryDropdown.click();
        Thread.sleep(500);
        click(bd);
    }

    public void name() throws InterruptedException {
        firstName.sendKeys(Random_data.firstName());
        Thread.sleep(1000);
        lastName.sendKeys(Random_data.lastName());
        Thread.sleep(1000);
    }

    public void address() throws InterruptedException {
        address.sendKeys(Random_data.address());
        Thread.sleep(1000);
        postCode.sendKeys(Random_data.postCode());
        Thread.sleep(1000);
        city.sendKeys("Los Angeles");
    }

    public void setState() throws InterruptedException {
        stateDropdown.click();
        Thread.sleep(500);
        alaska.click();
        Thread.sleep(500);
    }

    public void phoneNumber() throws InterruptedException {

        phoneDropdown.click();
        Thread.sleep(500);
        phnSearchBox.sendKeys("Bangladesh");
        Thread.sleep(500);
        phnBD.click();
        Thread.sleep(500);
        phnNumBox.sendKeys(Random_data.phoneNumber());

    }

    public void Password() throws InterruptedException {
        password.sendKeys("Tt123#123#");
        Thread.sleep(2000);
        confirmPass.sendKeys("Tt123#123#");
        Thread.sleep(2000);
    }

    public void enterSSN() throws InterruptedException {
        ssn.sendKeys(Random_data.ssnNumber());
        Thread.sleep(1000);
    }

    public void dob() throws InterruptedException {

        datePicker.click();
        Thread.sleep(1000);
        datePicker.click();
        Thread.sleep(3000);
        yearSelect.click();
        Thread.sleep(2000);
        birthYear.click();
        Thread.sleep(2000);
        dateOkbtn.click();
    }

    public void checkBoxesclick() throws InterruptedException {
        aggrementCheckBox.click();
        Thread.sleep(1500);
        termsCheckBox.click();
        Thread.sleep(1500);
    }

    public boolean subscriptionPageCheck() {
        return personalDetails.isDisplayed();

    }

    public void scrollbtn()throws InterruptedException {
        carosol.click();
        Thread.sleep(1000);
        carosol.click();


    }

    public void getGetStarterLite() throws InterruptedException {
        getLiteBtn.click();
        Thread.sleep(4000);
        iWantLiteBtn.click();
    }

    public void getFirstPlan() {
        getPlan1.click();

    }

//    public void getFirstPlanName(){
//        getPlan1.getText();
//    }

    public void getSecondPlan() throws IOException {
        getPlan2.click();
    }

    public void getThirdPlan() {
        getPlan3.click();
    }

    public void getFourthPlan() {
        getPlan4.click();
    }

    public void getFifthPlan() {
        try {
            scrollbtn();
            Thread.sleep(1000);
            getPlan5.click();
        } catch (NoSuchElementException e) {
            System.out.println("No more plans");
            getPlan5.click();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void getSixthPlan() {
        try {
            scrollbtn();
            Thread.sleep(1000);
            getPlan6.click();
        } catch (NoSuchElementException e) {
            System.out.println("No more plans");
            getPlan6.click();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void getSeventhPlan() {
        try {
            scrollbtn();
            scrollbtn();
            scrollbtn();
            Thread.sleep(1000);
            getPlan7.click();
        } catch (NoSuchElementException e) {
            System.out.println("No more plans");
            getPlan7.click();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void getEighthPlan() {
        try {
            scrollbtn();
            Thread.sleep(1000);
            getPlan8.click();
        } catch (NoSuchElementException e) {
            System.out.println("No more plans");
            getPlan8.click();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean cardImageCheck() {
        return cardImage.isDisplayed();
    }

    public void subscribeBtnClick(){
        subscribeBtn.click();
    }

    public void cardPayment() throws InterruptedException {
        paymentMthdDropdown.click();
        Thread.sleep(1000);
        card.click();
    }

    public boolean confirmatonCheck() {
        return paymentConfirmation.isDisplayed();
    }

    public void okBtnClick() {
        okBtn.click();
    }

    public void cntc() {
        cnt.sendKeys(Keys.ARROW_DOWN);
        cnt.sendKeys(Keys.ARROW_DOWN);
        cnt.sendKeys(Keys.ARROW_DOWN);
        cnt.click();
    }

    public boolean waitMsgCheck() {
       return waitingMsg.isDisplayed();
    }

}
