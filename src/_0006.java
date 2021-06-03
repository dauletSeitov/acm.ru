import java.io.*;
import java.util.Scanner;

public class _0006 {
    private void solve() {

        try {

            String s = scanner.nextLine();
            if (s.length() != 5) {
                throw new RuntimeException();
            }
            String[] split = s.split("-");
            String positionFrom = split[0];
            String positionTo = split[1];


            validate(positionFrom);
            validate(positionTo);

            char positionFromLetter = positionFrom.charAt(0);
            char positionFromNumber = positionFrom.charAt(1);

            char positionToLetter = positionTo.charAt(0);
            char positionToNumber = positionTo.charAt(1);

            if (Math.abs(positionFromLetter - positionToLetter) == 1) {
                if (Math.abs(positionFromNumber - positionToNumber) != 2) {
                    printWriter.print("NO");
                    return;
                }
            } else if (Math.abs(positionFromNumber - positionToNumber) == 1) {
                if (Math.abs(positionFromLetter - positionToLetter) != 2) {
                    printWriter.print("NO");
                    return;
                }
            } else {
                printWriter.print("NO");
                return;
            }


            printWriter.print("YES");
        } catch (Exception e) {
            printWriter.print("ERROR");
        }

    }

    private void validate(String positionFrom) {
        char c = positionFrom.charAt(0);
        if (c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E' || c == 'F' || c == 'G' || c == 'H') {

        } else {
            throw new RuntimeException();
        }

        c = positionFrom.charAt(1);
        if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8') {

        } else {
            throw new RuntimeException();
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
        _0006 obj = new _0006();
        obj.init();
        obj.solve();
        obj.close();
    }

    private Scanner scanner;
    private PrintWriter printWriter;
}
