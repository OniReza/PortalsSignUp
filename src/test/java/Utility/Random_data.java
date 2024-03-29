package Utility;

import com.github.javafaker.Faker;
import io.cucumber.java.sl.In;
import org.openqa.selenium.remote.HttpSessionId;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class Random_data {

    public static Faker faker = new Faker();
    public static String email;

    public static String signUpEmail(){

        Portals.dev dev = new Portals.dev();
        Portals.tst tst = new Portals.tst();


        String PortalEmail=tst.clubswan();


        int start = PortalEmail.indexOf('.');
        int end = PortalEmail.lastIndexOf('.');

        String outStr = PortalEmail.substring(start+1, end);
        System.out.println(outStr);

         email = "Us_"+ outStr + "_" + firstName().trim().toLowerCase() + "@mailinator.com";
        return email;

    }

    public static String signUpEmailnon_us() throws Exception  {

        Portals.dev dev = new Portals.dev();
        Portals.tst tst = new Portals.tst();


        String PortalEmail=tst.infinity();


        int start = PortalEmail.indexOf('.');
        int end = PortalEmail.lastIndexOf('.');

        String outStr = PortalEmail.substring(start+1, end);
        System.out.println(outStr);

         email = "Non_"+ outStr + "_" + firstName().trim().toLowerCase() + "@mailinator.com";
        return email;

    }

    public static String email_log(){

        String emailnon=email;
        return emailnon;

    }





    public static String firstName()  {
        String fName = faker.name().firstName().replaceAll("'", "");
        return fName;

    }

    public static String lastName() {
        String lName = faker.name().lastName().replaceAll("'", "");
        return lName;
    }

    public static String fullName() {
        String fName = faker.name().fullName().replaceAll("[^a-zA-Z]", " ");
        return fName;
    }

    public static String businessName() {
        String bName = faker.company().industry().replaceAll("[^a-zA-Z]", " ") + " Business";
        return bName;
    }

    public static String bankName() {
        String bName = faker.company().industry().replaceAll("[^a-zA-Z]", " ") + " Bank";
        return bName;
    }

    public static String businessRegNum() {
        int Num = faker.number().numberBetween(100000, 999999);
        String bRegNum = Integer.toString(Num);
        return bRegNum;
    }
    public static String address() {
        String streetAddress = faker.address().streetAddress();
        return streetAddress;
    }

    public static String phoneNumber() {
        int code = faker.number().numberBetween(22222222, 99999999);
        String postcode = "15" + code;
        return postcode;
    }

    public static String postCode() {
        int code = faker.number().numberBetween(10000, 99999);
        String postcode = Integer.toString(code);
        return postcode;
    }

    public static String email() {
        String email = firstName().toLowerCase().trim() + "@mailinator.com";
        return email;


    }

    public static String bankAccNum() {
        int number = faker.number().numberBetween(100000000, 999999999);
        String accNum = Integer.toString(number);
        return accNum;
    }

    public static String sortCode() {
        int number = faker.number().numberBetween(222222, 999999);
        String accNum = Integer.toString(number);
        return accNum;
    }

    public static String ssnNumber() {
        int ssnNum = faker.number().numberBetween(555555555, 888888888);
        String accNum = Integer.toString(ssnNum);
        return accNum;
    }
}
