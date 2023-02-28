import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "C:/Users/cwyel/nology2/java-library/books_data.csv";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;

            while((line = br.readLine())!= null){
                String [] columns = line.split(",");
                System.out.println(columns[1]);
            }
        } catch (FileNotFoundException error){
            error.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
