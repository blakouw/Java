public class Triangle extends Figure implements Printable {
    private double a,b,c;
    Triangle(double x, double y, double z) {

            a = x;
            b = y;
            c = z;
    }
    @Override
    public double calculateArea() {
        double perimeter_half = calculatePerimeter() * 0.5 ;
        return Math.sqrt(perimeter_half*(perimeter_half-a)*(perimeter_half-b)*(perimeter_half-c));
    }
    @Override
    public double calculatePerimeter() {
        return  a + b + c;
    }


    @Override
    public void print() {
        System.out.println("Bok a: " + a + ", bok b: " + b + ", bok c: " + c );
        System.out.println("Pole : " + calculateArea());
        System.out.println("Obwod : " + calculatePerimeter());
    }

    public void setAll(double a, double b, double c) {
        if(a + b > c && a + c > b && b + c > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else {
            String temp= " ";
            System.err.println("Nie mozna stworzyc trojkata o bokach: "+a+temp+b+temp+c);
            System.exit(0);
        }
    }
}


