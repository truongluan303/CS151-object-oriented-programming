import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.text.DecimalFormat;



public class Animation extends JFrame {
    
    private final int SIZE = 500;
    private final int PARTITION_SIZE = 2;

    private JPanel grid;
    private JPanel controlField;

    private JPanel polygon;
    private JPanel circle;



    public static void main(String[] args) {
        new Animation();
    }



    public Animation() {
        super();
        setSize(SIZE, SIZE);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Animation");
        setLocationRelativeTo(null);
        setVisible(true);
        initializeComponents();
    }




    private void initializeComponents() {

        grid = new JPanel();
        grid.setLayout(new GridLayout(PARTITION_SIZE, PARTITION_SIZE));

        int width = 200;
        int height = 200;

        circle = new Shapes.CirclePanel((grid.getWidth() - width) / 4, (grid.getHeight() - height) / 4, width, height, Color.BLUE);
        polygon = new Shapes.PolygonPanel(6, Color.GREEN);
        grid.add(circle);
        grid.add(polygon);


        this.add(grid, BorderLayout.CENTER);

        

        controlField = new JPanel();
        controlField.setBackground(Color.GRAY);
        this.add(controlField, BorderLayout.PAGE_END);
    }
}
