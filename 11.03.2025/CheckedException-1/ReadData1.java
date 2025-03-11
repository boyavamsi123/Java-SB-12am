
import java.io.FileNotFoundException;
import java.io.PrintWriter;


class ReadData1{
    public static void main(String[] args) {
        try {
            PrintWriter obj = new PrintWriter("abc.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}