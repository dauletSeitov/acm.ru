import java.io.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class _0007 {
    private void solve() {

        BigDecimal a = scanner.nextBigDecimal();
        BigDecimal b = scanner.nextBigDecimal();
        BigDecimal c = scanner.nextBigDecimal();

        if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            printWriter.print(b);
        } else if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            printWriter.print(a);
        } else printWriter.print(c);
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
        _0007 obj = new _0007();
        obj.init();
        obj.solve();
        obj.close();
    }

    private Scanner scanner;
    private PrintWriter printWriter;
}
