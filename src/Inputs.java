import java.util.Scanner;

public class Inputs {
    Scanner scanner;
    Inputs() {
        scanner = new Scanner(System.in);
    }
    double getSquare() {
        System.out.println("Wprowadz dlugosc boku kwadratu:");
        double a = scanner.nextDouble();
        if (a > 0) {
            return a;
        }
        else {
            System.err.println("Wrong value: " + a);
            System.exit(0);
            return 0;
        }
    }
    double getCircle() {
        double r_input = scanner.nextDouble();
        if (r_input > 0) {
            return r_input;
        }
        else {
            System.err.println("Wrong value: " + r_input);
            System.exit(0);
            return 0;
        }
    }
    double getTriangleX() {
        System.out.println("Wprowadz dlugosc pierwszego boku trojkata: ");
        double x = scanner.nextDouble();
        if (x > 0) {
            return x;
        }
        else {
            System.err.println("Wrong value: " + x);
            System.exit(0);
            return 0;
        }
    }
    double getTriangleY() {
        System.out.println("Wprowadz dlugosc drugiego boku trojkata: ");
        double y = scanner.nextDouble();
        if(y > 0) {
            return y;
        }
        else {
            System.err.println("Wrong value: " + y);
            System.exit(0);
            return 0;
        }
    }

    double getTriangleZ() {
        System.out.println("Wprowadz dlugosc trzeciego boku trojkata: ");
        double z = scanner.nextDouble();
        if (z > 0) {
            return z;
        }
        else {
            System.err.println("Wrong value: " + z);
            System.exit(0);
            return 0;
        }
    }
    double getPrismH() {
        double height = scanner.nextDouble();
        if(height > 0) {
            return height;
        }
        else {
            System.err.println("Wrong value: " + height);
            System.exit(0);
            return 0;
        }
    }
}
