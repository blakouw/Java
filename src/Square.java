public class Square extends Figure implements Printable {
    private double a;
    Square(double x) {
            a = x;
    }
    @Override
    public double calculateArea() {
        return Math.pow(a, 2);

    }
    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }

    @Override
    public void print() {
        System.out.println("Bok a: " + a);
        System.out.println("Pole : " + calculateArea());
        System.out.println("Obwod : " + calculatePerimeter());
    }

    public void setA(double a) {
        this.a = a;
    }
}


