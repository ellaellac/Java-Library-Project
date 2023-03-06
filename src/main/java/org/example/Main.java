package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BookList bookList = new BookList("C:/Users/cwyel/nology2/java-library/books_data.csv");
        System.out.println(bookList.getBooks());

//        -- Users --
        UserDatabase userDatabase = new UserDatabase();
        User user1 = new User("Jack");
        User user2 = new User("Ella");
        User user3 = new User("Tommy");

        userDatabase.addUser(user1);
        userDatabase.addUser(user2);
        userDatabase.addUser(user3);

        System.out.println(userDatabase.getUsers());


//        --- Generate report in Json ---
//        File inputCsv = new File("C:/Users/cwyel/nology2/java-library/books_data.csv");    //insert path for csv file
//        CsvSchema csvSchema = CsvSchema.builder().setUseHeader(true).build(); // schema is a structure of the file; if the csv has header --> setUseHeader(true)
//        CsvMapper csvMapper = new CsvMapper(); //csvMapper to map CSV to Java objects
//        List<Object> readAll = csvMapper.readerFor(Map.class).with(csvSchema).readValues(inputCsv).readAll(); // each row of csv represented as Map then use schema to map the data and read data from csv file and return as List
//        ObjectMapper mapper = new ObjectMapper(); // used to write JSon to file
//
//        File  jsonFile = new File("C:/Users/cwyel/nology2/java-library/books_data.json");
//        mapper.writerWithDefaultPrettyPrinter().writeValue(jsonFile, readAll); // write JSON to file

    }
}