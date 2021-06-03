import java.io.*;
import java.util.Scanner;

public class _0008 {
    private void solve() {
        printWriter.print(scanner.nextInt() * scanner.nextInt() == scanner.nextInt() ? "YES" : "NO"
        );
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
        _0008 obj = new _0008();
        obj.init();
        obj.solve();
        obj.close();
    }

    private Scanner scanner;
    private PrintWriter printWriter;
}
