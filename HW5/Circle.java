public class Circle extends Shape {
    
    private double radius;



    public Circle() {
        this(0);
    }
    


    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative!");
        }
        this.radius = radius;
    }



    @Override
    public double computeArea() {
        return (Math.PI * radius * radius);
    }


    @Override
    public String getType() {
        return "Circle";
    }



    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
