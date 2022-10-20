public class Circle extends Figure implements Printable {

    private double r;

    Circle(double r_input) {
            r = r_input;
    }
    @Override
    double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * r;
    }
    @Override
    public void print() {
        System.out.println("Promien: " + r);
        System.out.println("Pole : " + calculateArea());
        System.out.println("Obwod : " + calculatePerimeter());
    }
    public void setR(double r) {
        this.r = r;
    }
}


