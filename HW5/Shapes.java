import java.util.ArrayList;


public class Shapes extends Thread {
    private ArrayList<Shape> shapeList;



    public Shapes() {
        this(new ArrayList<Shape>());
    }



    public Shapes(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }



    public void add(Shape newShape) {
        shapeList.add(newShape);
    }



    public void remove(Shape toBeRemoved) {
        shapeList.remove(toBeRemoved);
    }



    public void remove(int idx) {
        shapeList.remove(idx);
    }




    public double max() {
        double highest = 0;

        for (Shape shape : shapeList) {
            highest = Math.max(highest, shape.computeArea());
        }

        return highest;
    }




    public double min() {
        double lowest = 0;

        for (Shape shape : shapeList) {
            lowest = Math.min(lowest, shape.computeArea());
        }

        return lowest;
    }




    public ArrayList<Shape> getShapeList() {
        return this.shapeList;
    }




    synchronized public void compute() {
        for (Shape shape : shapeList) {
            shape.start();
        }
    }



    public void run() {
        this.compute();
        try {
            for (Shape shape : shapeList) {
                shape.join();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    public void setShapeList(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }
}