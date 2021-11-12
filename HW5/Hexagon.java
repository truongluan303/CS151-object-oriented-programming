public class Hexagon extends Shape {
    
    private double side;



    public Hexagon() {
        this(0);
    }



    public Hexagon(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side's length cannot be negative!");
        }
        this.side = side;
    }



    @Override
    public double computeArea() {
        return (3 * Math.sqrt(3) * side * side / 2);
    }



    @Override
    public String getType() {
        return "Hexagon";
    }



    public double getSide() {
        return this.side;
    }


    public void setSide(double side) {
        this.side = side;
    }
}
