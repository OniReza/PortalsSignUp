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
    public static String signUpEmail() throws Exception {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));


        Properties prop=new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/config.properties");

        prop.load(file);
        String TstUs=prop.getProperty("TstUsPrifix");

        String email = TstUs + firstName().trim().toLowerCase() + "@mailinator.com";
        System.out.println("Email:  " + email + "Date Time: " + dtf.format(now));

        String Data ="US: "+ email;
        File files = new File("Email/Email.txt");
        FileWriter fw = new FileWriter(files,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(Data);
        bw.newLine();
        bw.close();

        return email;

    }

    public static String signUpEmailnon_us() throws Exception  {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));


        Properties prop=new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/config.properties");

        prop.load(file);
        String TSTNon_us = prop.getProperty("TSTNon_usPrifix");

        String email = TSTNon_us + firstName().trim().toLowerCase() + "@mailinator.com";
        //System.out.println("Email:  " + email);
        System.out.println("Email:  " + email + " " + dtf.format(now));
        //System.out.println("Date Time: " + dtf.format(now));


        String Data ="Non US: "+ email + "  "+dtf.format(now);
        File files = new File("Email/Email.txt");
        FileWriter fw = new FileWriter(files,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(Data);
        bw.newLine();
        bw.close();

        return email;
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
