public class ShapeTest {
    
    public static void main(String[] args) {

        Shapes shapes = new Shapes();

        Triangle tri1 = new Triangle(3, 4, 5);
        Triangle tri2 = new Triangle(10.5, 10.6, 15);

        Circle cir1 = new Circle(10);
        Circle cir2 = new Circle(2.5);

        Rectangle rec1 = new Rectangle(10, 5);
        Rectangle rec2 = new Rectangle(20.5, 11.2);

        Hexagon hex1 = new Hexagon(5);
        Hexagon hex2 = new Hexagon(21.3);


        shapes.add(tri1);
        shapes.add(tri2);
        shapes.add(cir1);
        shapes.add(cir2);
        shapes.add(rec1);
        shapes.add(rec2);
        shapes.add(hex1);
        shapes.add(hex2);


        shapes.compute();
    }
}
