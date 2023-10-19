package factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Black..............................\n");
        BlackFactory objectBlackFactory = new BlackFactory();

        System.out.println("BlackTriangle:");
        BlackTriangle objectBlackTriangle = objectBlackFactory.createTriangle(1, 2, 3, 6, 8, 10);
        System.out.println("Area: " + objectBlackTriangle.getArea());
        System.out.println("Color: " + objectBlackTriangle.getColor());
        System.out.println("Perimetr: " + objectBlackTriangle.getPerimeter());

        System.out.println("\nBlackCircle:");
        BlackCircle objectBlackCircle = objectBlackFactory.createCircle(1, 2, 3);
        System.out.println("Area: " + objectBlackCircle.getArea());
        System.out.println("Color: " + objectBlackCircle.getColor());
        System.out.println("Perimetr: " + objectBlackCircle.getPerimeter());

        System.out.println("\nWhite..............................\n");
        WhiteFactory objectWhiteFactory = new WhiteFactory();

        System.out.println("WhiteTriangle:");
        WhiteTriangle objectWhiteTriangle = objectWhiteFactory.createTriangle(2, 2, 4, 4, 9, 12);
        System.out.println("Area: " + objectWhiteTriangle.getArea());
        System.out.println("Color: " + objectWhiteTriangle.getColor());
        System.out.println("Perimetr: " + objectWhiteTriangle.getPerimeter());

        System.out.println("\nWhiteCircle:");
        WhiteCircle objectWhiteCircle = objectWhiteFactory.createCircle(2, 2, 4);
        System.out.println("Area: " + objectWhiteCircle.getArea());
        System.out.println("Color: " + objectWhiteCircle.getColor());
        System.out.println("Perimetr: " + objectWhiteCircle.getPerimeter());



    }
}
