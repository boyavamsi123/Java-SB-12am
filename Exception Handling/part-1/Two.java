
import java.io.*;

class Test{
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter("demo.txt"); //n FileNotFoundException
        pw.println("Hello, ProStack");
    }
}