package ir.org.acm.session25.io.json.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class TestJackson {

    public static void main(String[] args) throws Exception {

        BankAccount ba = new BankAccount(1234,"Ali",1500);

        ObjectMapper mapper = new ObjectMapper();

        // convert user object to gson string, and save to a file
        mapper.writeValue( new File("bankaccount2.gson"), ba);

        // display to console
        System.out.println( mapper.writeValueAsString(ba) );

    }

}