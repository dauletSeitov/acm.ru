import java.io.*;
import java.util.Scanner;

public class _0009 {
    private void solve() {
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int positiveItemSum = 0;
        int minNum = Integer.MAX_VALUE;
        int maxNum = -Integer.MAX_VALUE;

        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 0; i < n; i++) {
            int num = array[i];
            if (num > 0) {
                positiveItemSum += num;
            }
            if (num > maxNum) {
                maxNum = num;
                maxIndex = i;
            }

            if (num < minNum) {
                minNum = num;
                minIndex = i;
            }
        }

        int min = Math.min(minIndex, maxIndex);
        int max = Math.max(minIndex, maxIndex);
        int avgSum = 1;
        for (int i = min + 1; i < max; i++) {
            avgSum *= array[i];
        }
        printWriter.print(positiveItemSum);
        printWriter.print(" ");
        printWriter.print(avgSum);

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
        _0009 obj = new _0009();
        obj.init();
        obj.solve();
        obj.close();
    }

    private Scanner scanner;
    private PrintWriter printWriter;
}
