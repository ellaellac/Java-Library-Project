import java.util.ArrayList;
import java.util.List;

public class User {

    private static int uniqueId = 0;

    private int id;
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public User(String name, List<Book> borrowedBooks) {
        this.id = ++uniqueId;
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }

}
