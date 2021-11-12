public class Rectangle extends Shape {

    private double width;
    private double height;


    
    public Rectangle() {
        this(0, 0);
    }



    public Rectangle(double width, double height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Sides cannot be negative!");
        }
        this.width = width;
        this.height = height;
    }



    @Override
    public double computeArea() {
        return (width * height);
    }



    @Override
    public String getType() {
        return "Rectangle";
    }



    
    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
