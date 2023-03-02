package org.example;

public class Book {
    private int number;
    private String title;
    private String Author;
    private String Genre;
    private String SubGenre;
    private String Publisher;
    private boolean onLoan = false;

    //Constructor

    public Book(int number, String title, String author, String genre, String subGenre, String publisher) {
        this.number = number;
        this.title = title;
        Author = author;
        Genre = genre;
        SubGenre = subGenre;
        Publisher = publisher;
    }


    //Getter and Setter


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getSubGenre() {
        return SubGenre;
    }

    public void setSubGenre(String subGenre) {
        SubGenre = subGenre;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }

    //toString


    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", Author='" + Author + '\'' +
                ", Genre='" + Genre + '\'' +
                ", SubGenre='" + SubGenre + '\'' +
                ", Publisher='" + Publisher + '\'' +
                ", onLoan=" + onLoan +
                '}';
    }
}

