public class Main {
    public static void main(String[] args) throws InterruptedException {
        Square square = new Square(1);
        Triangle triangle = new Triangle(1, 1, 1);
        Circle circle = new Circle(1);
        Inputs inputs = new Inputs();
        Prism prism = new Prism(1, square);

        while (true){
            System.out.println("Co bys chcial dzisiaj zrobic?");
            System.out.println("1. Wpisac dane");
            System.out.println("2. Wyświetlic dane");
            System.out.println("3. Wyjsc z programu");
            int result = inputs.scanner.nextInt();
            switch (result) {
                case 1 -> {
                    System.out.println("Która figura?: Kolo, Trojkat, Kwadrat, Prism,  Nic:");
                    String choice = inputs.scanner.next();
                            switch(choice) {
                                case "Kolo" -> {
                                    System.out.println("Podaj promien kola");
                                    circle.setR(inputs.getCircle());
                                }
                                case "Trojkat" -> {
                                    System.out.println("Podaj dlugosci bokow trojkata");
                                    triangle.setAll(inputs.getTriangleX(), inputs.getTriangleY(), inputs.getTriangleZ());
                                }
                                case "Kwadrat" -> {
                                    System.out.println("Podaj dlugosci boku krwadratu");
                                    square.setA(inputs.getSquare());
                                }
                                case "Prism" -> {
                                    System.out.println("Podaj wysokosc graniastoslupa");
                                    prism.setH(inputs.getPrismH());
                                    System.out.println("Co ma byc podstawa?: Kolo, Trojkat, Kwadrat");
                                    choice = inputs.scanner.next();
                                    switch (choice) {
                                        case "Kolo" -> prism.figure = circle;
                                        case "Trojkat" -> prism.figure = triangle;
                                        case "Kwadrat" -> prism.figure = square;
                                    }
                                }
                                case "Nic"-> System.exit(0);
                                default -> System.err.println("Zly wybor: " + result);
                            }
                }
                case 2 -> {
                    System.out.println("Która figura?: Kolo, Trojkat, Kwadrat, Prism:");
                    String choice = inputs.scanner.next();
                            switch(choice) {
                                case "Kolo" -> {
                                    System.out.println("Kolo:");
                                    circle.print();
                                    Thread.sleep(5000);
                                }
                                case "Trojkat" -> {
                                    System.out.println("Trojkat:");
                                    triangle.print();
                                    Thread.sleep(5000);
                                }
                                case "Kwadrat" -> {
                                    System.out.println("Kwadrat:");
                                    square.print();
                                    Thread.sleep(5000);
                                }
                                case "Prism" -> {
                                    System.out.println("Graniastoslup prawidlowy:");
                                    prism.print();
                                    Thread.sleep(5000);
                                }
                                default -> System.err.println("Zly wybor: " + result);
                            }
                    }
                case 3 -> System.exit(0);
                default -> System.err.println("Zly wybor: " + result);
            }
        }
    }
}