import java.io.*;
import java.util.Scanner;

public class _0005 {
    private void solve() {
        int n = scanner.nextInt();
        StringBuilder neChet = new StringBuilder();
        StringBuilder chet = new StringBuilder();
        int chetCount = 0;
        int neChetCount = 0;

        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();

            if (day % 2 == 0) {
                chet.append(day).append(" ");
                chetCount++;
            } else {
                neChet.append(day).append(" ");
                neChetCount++;
            }

        }

        printWriter.println(neChet.toString().trim());
        printWriter.println(chet.toString().trim());
        printWriter.print(neChetCount > chetCount ? "NO" : "YES");
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
        _0005 obj = new _0005();
        obj.init();
        obj.solve();
        obj.close();
    }

    private Scanner scanner;
    private PrintWriter printWriter;
}
