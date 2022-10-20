public class Prism extends Figure implements Printable {
    private double height;
    Figure figure;

    public Prism(double wys, Figure figura) {
        height = wys;
        figure = figura;
    }

    double calculateCapacity() {
        return figure.calculateArea()*height;
    }

    @Override
    double calculateArea() {
        return figure.calculatePerimeter()*height+2*figure.calculateArea();
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }
    @Override
    public void print() {
        System.out.println("Figura podstawy: " + figure);
        System.out.println("Pole calkowite: " + calculateArea());
        System.out.println("Objetosc : " + calculateCapacity());
    }

    public void setH(double h) {
        this.height = h;
    }
}
