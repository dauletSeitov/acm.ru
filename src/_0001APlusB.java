import java.io.*;
import java.util.Scanner;

public class _0001APlusB {

    private void solve() {
        printWriter.println(scanner.nextInt() + scanner.nextInt());
    }

    private void init() throws FileNotFoundException {
        scanner = new Scanner(new FileInputStream("INPUT.TXT"));
        printWriter = new PrintWriter(new FileOutputStream("OUTPUT.TXT"));
    }

    private void close() {
        scanner.close();
        printWriter.close();
    }

    public static void main(String[] args) throws IOException {
        _0001APlusB aPlusB = new _0001APlusB();
        aPlusB.init();
        aPlusB.solve();
        aPlusB.close();
    }

    private Scanner scanner;
    private PrintWriter printWriter;
}
