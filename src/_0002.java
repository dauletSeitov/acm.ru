import java.io.*;
import java.util.Scanner;

public class _0002 {


    private void solve() {

        int n = scanner.nextInt();
        if (n > 0) {
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            printWriter.print(sum);
        } else {
            long sum = 0;
            for (int i = n; i <= 1; i++) {
                sum += i;
            }
            printWriter.print(sum);
        }
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
        _0002 obj = new _0002();
        obj.init();
        obj.solve();
        obj.close();
    }

    private Scanner scanner;
    private PrintWriter printWriter;
}
