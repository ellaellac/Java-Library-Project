package org.example;

import java.io.*;
import java.util.ArrayList;

public class BookList {

    private String path;
    private ArrayList<Book> books = new ArrayList<>();

    public BookList(String path) throws IOException {
        this.path = path;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            br.readLine(); //Skip the first line as it reads the next line of text from the file and returns it as a string

            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                Book book = new Book(Integer.parseInt(columns[0]), columns[1], columns[2], columns[3], columns[4], columns[5]);
                books.add(book);
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Getter and Setter

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}

