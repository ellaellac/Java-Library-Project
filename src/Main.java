import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String path = "C:/Users/cwyel/nology2/java-library/books_data.csv";

        ArrayList <Book> books = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line ;
            br.readLine(); //Skip the first line as it reads the next line of text from the file and returns it as a string

            while((line = br.readLine())!= null){
                String[] columns = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                Book book = new Book(Integer.parseInt(columns[0]),columns[1],columns[2],columns[3],columns[4],columns[5]);
                books.add(book);
            }
//            System.out.println(books);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
