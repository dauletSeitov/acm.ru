import java.io.*;
import java.util.Scanner;

public class _0003 {
    private void solve() {
        String number = scanner.next();
        if ("5".equals(number)) {
            printWriter.println("25");
            return;
        }
        String numberWithout5 = number.substring(0, number.lastIndexOf("5"));
        int i = Integer.parseInt(numberWithout5);
        i = i * (i + 1);

        printWriter.print(i);
        printWriter.println("25");
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
        _0003 obj = new _0003();
        obj.init();
        obj.solve();
        obj.close();
    }

    private Scanner scanner;
    private PrintWriter printWriter;
}
