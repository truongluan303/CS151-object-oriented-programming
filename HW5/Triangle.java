public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;




    public Triangle() {
        this(0, 0, 0);
    }




    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        if (!isValidTriangle()) {
            throw new IllegalArgumentException("Can't form a triangle!");
        }
    }





    @Override
    public double computeArea() {
        double p = (side1 + side2 + side3) / 2;
        double a = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return a;
    }




    @Override
    public String getType() {
        return "Triangle";
    }





    private boolean isValidTriangle() {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
            return false;

        if ((side1 + side2 + side3) > (2 * Math.max(Math.max(side1, side2), side2)))
            return true;

        return false;
    }




    
    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}