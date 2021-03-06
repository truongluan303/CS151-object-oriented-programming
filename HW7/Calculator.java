import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.text.DecimalFormat;



/**
 * A simple calculator with GUI
 */
public class Calculator extends JFrame {

    private final ImageIcon icon = new ImageIcon("icon.png");
    private final Color OPERATOR_COLOR = new Color(194, 175, 250);
    private final Color GENERAL_COLOR = new Color(30, 35, 38);
    private final Color SAVE_COLOR = new Color(154, 125, 232);
    private final int GRID_COLS = 4;
    private final int GRID_ROWS = 5;
    private final int SIZE_X = 450;
    private final int SIZE_Y = 650;
    private final String SIGN = "+/-";
    private final String CLEAR = "C";
    private final String DEL = "del";
    private final String PERCENTAGE = "%";
    private final String EQUAL = "=";
    private final String MUL = "x";
    private final String ADD = "+";
    private final String SUB = "-";
    private final String DIV = "/";
    private final HashSet<String> numbers;
    DecimalFormat formatter;

    private JTextField display;
    private JPanel buttonsPanel;

    private JButton num0;
    private JButton num1;
    private JButton num2;
    private JButton num3;
    private JButton num4;
    private JButton num5;
    private JButton num6;
    private JButton num7;
    private JButton num8;
    private JButton num9;
    private JButton pointButton;
    private JButton delButton;
    private JButton mulButton;
    private JButton divButton;
    private JButton addButton;
    private JButton subButton;
    private JButton eqButton;
    private JButton percentButton;
    private JButton signButton;
    private JButton cButton;

    private String currentNum;
    private String prevNum;
    private String operation;
    private boolean isResult;




    public static void main(String[] args) {
        new Calculator();
    }




    /**
     * Constructor
     */
    public Calculator() {
        // create GUI
        super();
        initializeComponents();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(SIZE_X, SIZE_Y);
        setTitle("  Calculator");
        setIconImage(icon.getImage());
        setResizable(false);
        setLayout(new BorderLayout());
        add(display, BorderLayout.PAGE_START);
        add(buttonsPanel, BorderLayout.CENTER);
        setLocationRelativeTo(null);

        // initialize the final variables
        numbers = new HashSet<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "."));
        formatter = new DecimalFormat("#.#####");
    }




    /**
     * Initialize the UI components
     */
    private void initializeComponents() {

        // initialize the images for operation buttons
        Image eqimg = new ImageIcon("equal.png").getImage();
        Image resizedEqImg = eqimg.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
        Image divimg = new ImageIcon("divide.png").getImage();
        Image resizedDivImg = divimg.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
        Image mulimg = new ImageIcon("multiply.png").getImage();
        Image resizedMulImg = mulimg.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
        Image subimg = new ImageIcon("subtract.png").getImage();
        Image resizedSubImg = subimg.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
        Image plusimg = new ImageIcon("plus.png").getImage();
        Image resizedPlusImg = plusimg.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);

        // initialize the buttons
        num0 = createButton("0", GENERAL_COLOR, Color.WHITE);
        num1 = createButton("1", GENERAL_COLOR, Color.WHITE);
        num2 = createButton("2", GENERAL_COLOR, Color.WHITE);
        num3 = createButton ("3", GENERAL_COLOR, Color.WHITE);
        num4 = createButton("4", GENERAL_COLOR, Color.WHITE);
        num5 = createButton("5", GENERAL_COLOR, Color.WHITE);
        num6 = createButton("6", GENERAL_COLOR, Color.WHITE);
        num7 = createButton("7", GENERAL_COLOR, Color.WHITE);
        num8 = createButton("8", GENERAL_COLOR, Color.WHITE);
        num9 = createButton("9", GENERAL_COLOR, Color.WHITE);
        pointButton = createButton(".", GENERAL_COLOR, Color.WHITE);
        delButton = createButton(DEL, GENERAL_COLOR, Color.WHITE);
        percentButton = createButton(PERCENTAGE, GENERAL_COLOR, Color.WHITE);
        signButton = createButton(SIGN, GENERAL_COLOR, Color.WHITE);
        cButton = createButton(CLEAR, GENERAL_COLOR, Color.WHITE);

        eqButton = createButton("", OPERATOR_COLOR, null);
        eqButton.setIcon(new ImageIcon(resizedEqImg));
        eqButton.setName(EQUAL);
        mulButton = createButton("", OPERATOR_COLOR, null);
        mulButton.setIcon(new ImageIcon(resizedMulImg));
        mulButton.setName(MUL);
        divButton = createButton("", OPERATOR_COLOR, null);
        divButton.setIcon(new ImageIcon(resizedDivImg));
        divButton.setName(DIV);
        subButton = createButton("", OPERATOR_COLOR, null);
        subButton.setIcon(new ImageIcon(resizedSubImg));
        subButton.setName(SUB);
        addButton = createButton("", OPERATOR_COLOR, null);
        addButton.setIcon(new ImageIcon(resizedPlusImg));
        addButton.setName(ADD);
        
        // initialize the text display panel
        display = new JTextField();
        display.setFont(new Font(Font.DIALOG, Font.BOLD, 70));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setText("0");
        display.setEditable(false);
        display.setBorder(BorderFactory.createLineBorder(Color.WHITE, 8));
        display.setBackground(Color.WHITE);

        // initialize the panel containing the buttons
        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(GRID_ROWS, GRID_COLS));
        buttonsPanel.setBackground(Color.BLACK);
        buttonsPanel.add(cButton);
        buttonsPanel.add(signButton);
        buttonsPanel.add(percentButton);
        buttonsPanel.add(divButton);
        buttonsPanel.add(num7);
        buttonsPanel.add(num8);
        buttonsPanel.add(num9);
        buttonsPanel.add(mulButton);
        buttonsPanel.add(num4);
        buttonsPanel.add(num5);
        buttonsPanel.add(num6);
        buttonsPanel.add(subButton);
        buttonsPanel.add(num1);
        buttonsPanel.add(num2);
        buttonsPanel.add(num3);
        buttonsPanel.add(addButton);
        buttonsPanel.add(num0);
        buttonsPanel.add(pointButton);
        buttonsPanel.add(delButton);
        buttonsPanel.add(eqButton);

        currentNum = "0";
        prevNum = null;
        operation = null;
    }




    /**
     * Create a custom button
     * @param text button's text
     * @param bg button's background color
     * @param fg button's foreground color
     * @return a button with the given characteristics
     */
    private JButton createButton(String text, Color bg, Color fg) {
        JButton button = new JButton();
        button.setText(text);
        button.setBackground(bg);
        button.setForeground(fg);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
        button.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
        button.addActionListener(buttonListener());
        return button;
    }





    private ActionListener buttonListener() {
        return e -> {
            JButton button = (JButton)e.getSource();
            String buttonText = button.getText();
            boolean updateDisplay = true;

            // if the button clicked is a number or a floating point "."
            if (numbers.contains(buttonText)) {
                resetOperationButtonsColor();
                if (isResult) {
                    currentNum = "0";
                }
                if (currentNum.equals("0") && !buttonText.equals(".")) {
                    currentNum = "";
                }
                if (!(buttonText.equals(".") && currentNum.contains("."))) {
                    isResult = false;
                    currentNum += buttonText;
                }
            }

            // if the button clicked is "+/-"
            else if (buttonText.equals(SIGN)) {
                if (Double.parseDouble(currentNum) != 0) {
                    if (currentNum.charAt(0) == '-') {
                        currentNum = currentNum.substring(1);
                    } else {
                        currentNum = "-" + currentNum;
                    }
                }
            }

            // if the button clicked is "C"
            else if (buttonText.equals(CLEAR)) {
                currentNum = "0";
                prevNum = null;
            }

            // if the button clicked is "%"
            else if (buttonText.equals(PERCENTAGE)) {
                try {
                    double value = Double.parseDouble(currentNum);
                    if (value != 0) {
                        value /= 100;
                        currentNum = Double.toString(value);
                    }
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            // if the button clicked is "del"
            else if (buttonText.equals(DEL)) {
                if (currentNum.length() < 2) {
                    currentNum = "0";
                }
                else {
                    currentNum = currentNum.substring(0, currentNum.length() - 1);
                    if (currentNum.equals("-")) {
                        currentNum = "0";
                    }
                }
            }

            // if the button clicked is an operation (+, -, x, /)
            else if (button.getName().equals(ADD) || button.getName().equals(SUB) || 
                     button.getName().equals(MUL) || button.getName().equals(DIV)) {
                operation = button.getName();
                updateDisplay = false;
                resetOperationButtonsColor();
                button.setBackground(SAVE_COLOR);
                if (prevNum == null) {
                    prevNum = currentNum;
                    currentNum = "0";
                }
            }

            // if the button clicked is "="
            else if (button.getName().equals(EQUAL)) {
                if (prevNum != null) {
                    try {
                        double result = 0;
                        double num1 = Double.parseDouble(prevNum);
                        double num2 = Double.parseDouble(currentNum);
                        if (operation.equals(MUL)) {
                            result = num1 * num2;
                        }
                        else if (operation.equals(DIV)) {
                            result = num1 / num2;
                        }
                        else if (operation.equals(ADD)) {
                            result = num1 + num2;
                        }
                        else if (operation.equals(SUB)) {
                            result = num1 - num2;
                        }
                        
                        if (result % 1 == 0) {
                            int temp = (int)result;
                            currentNum = Integer.toString(temp);
                        }
                        else {
                            currentNum = formatter.format(result);
                        }
                        
                        isResult = true;
                        prevNum = null;
                        operation = null;
                        display.setText(currentNum);
                    } 
                    catch (Exception ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }


            if (updateDisplay) {
                display.setText(currentNum);
            }
        };
    }




    private void resetOperationButtonsColor() {
        mulButton.setBackground(OPERATOR_COLOR);
        divButton.setBackground(OPERATOR_COLOR);
        subButton.setBackground(OPERATOR_COLOR);
        addButton.setBackground(OPERATOR_COLOR);
    }
}
