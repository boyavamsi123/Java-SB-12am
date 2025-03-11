
import java.io.PrintWriter;

class ReadData{
    public static void main(String[] args) {
        PrintWriter obj = new PrintWriter("abc.txt");
    }
}
/*
unreported exception FileNotFoundException; must be caught or declared to be thrown
        PrintWriter obj = new PrintWriter("abc.txt");
                          ^
*/