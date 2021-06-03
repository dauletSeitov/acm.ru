import java.io.*;
import java.util.Scanner;

public class _0012 { //test not passed
    private void solve() {
        int n = scanner.nextInt();
        int manInRectangleCount = 0;
        for (int i = 0; i < n; i++) {
            int manX = scanner.nextInt();
            int manY = scanner.nextInt();

            int rectX1 = scanner.nextInt();
            int rectY1 = scanner.nextInt();

            int rectX2 = scanner.nextInt();
            int rectY2 = scanner.nextInt();

            int rectX3 = scanner.nextInt();
            int rectY3 = scanner.nextInt();

            int rectX4 = scanner.nextInt();
            int rectY4 = scanner.nextInt();

            boolean mainInRectangle = isMainInRectangle(manX, manY, rectX1, rectY1, rectX2, rectY2, rectX3, rectY3, rectX4, rectY4);

            if (mainInRectangle) {
                manInRectangleCount++;
            }
        }
        printWriter.print(manInRectangleCount);
    }

    private boolean isMainInRectangle(int manX, int manY,
                                      int rectX1, int rectY1,
                                      int rectX2, int rectY2,
                                      int rectX3, int rectY3,
                                      int rectX4, int rectY4

    ) {

        if (rectX1 == rectX2) {
            if (rectY1 > manY || manY > rectY2) {
                return false;
            }

            if (rectX1 > manX || manX > rectX3) {
                return false;
            }
            return true;
        }
        if (rectX2 == rectX3) {
            if (rectY2 > manY || manY > rectY3) {
                return false;
            }

            if (rectX3 > manX || manX > rectX4) {
                return false;
            }
            return true;
        }


        boolean manIsBelowThanLineX1Y1X2Y2 = line(manX, manY, rectX1, rectY1, rectX2, rectY2);
        boolean manIsBelowThanLineX3Y3X4Y4 = line(manX, manY, rectX3, rectY3, rectX4, rectY4);

        if (manIsBelowThanLineX1Y1X2Y2 == manIsBelowThanLineX3Y3X4Y4) {
            return false;
        }


        boolean manIsBelowThanLineX1Y1X4Y4 = line(manX, manY, rectX1, rectY1, rectX4, rectY4);
        boolean manIsBelowThanLineX2Y2X3Y3 = line(manX, manY, rectX2, rectY2, rectX3, rectY3);

        if (manIsBelowThanLineX1Y1X4Y4 == manIsBelowThanLineX2Y2X3Y3) {
            return false;
        }

        return true;

    }

    private boolean line(int manX, int manY, int x1, int y1,
                         int x2, int y2) {

        int k = (y2 - y1) / (x2 - x1);
        int b = (y1 - k * x1);

        int y = k * manX + b;

        if (manY < y) {
            return true;
        }
        return false;
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
        _0012 obj = new _0012();
        obj.init();
        obj.solve();
        obj.close();
    }

    private Scanner scanner;
    private PrintWriter printWriter;
}
