package pl.pswbp.andrzejbogusz.ppo.projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainWindow {

    public JPanel panel;
    public JTextArea input;
    public JLabel calculations;
    public JButton percentButton;
    public JButton divideButton;
    public JButton multiplyButton;
    public JButton sevenButton;
    public JButton eightButton;
    public JButton nineButton;
    public JButton fourButton;
    public JButton fiveButton;
    public JButton sixButton;
    public JButton oneButton;
    public JButton twoButton;
    public JButton threeButton;
    public JButton minusButton;
    public JButton plusButton;
    public JButton sqrtButton;
    public JButton zeroButton;
    public JButton dotButton;
    public JButton equalsButton;
    public JButton clearButton;
    public JButton negativePositiveButton;
    public JButton clearEverytingButton;
    public JLabel sign;
    
    public static JMenuBar menuBar = new JMenuBar();
    public static JMenu themeBar = new JMenu("Motyw");
    public static JMenuItem theme1 = new JMenuItem("Ciemny");
    public static JMenuItem theme2 = new JMenuItem("Jasny");
    public static JMenuItem theme3 = new JMenuItem("Retro");

    public boolean isDecimal = false;

    public double a;
    public double b;
    public double c;

    private String setAction;

    public void add(){
        if (calculations.getText().isEmpty()) {
            calculations.setText(input.getText());
            input.setText("");
            sign.setText("+");
            isDecimal = false;
            return;
        }
        a = Double.parseDouble(calculations.getText());
        b = Double.parseDouble(input.getText());
        c = a + b;
        calculations.setText("");
        input.setText(Double.toString(c));
        isDecimal = false;
        sign.setText("");
    }

    public void substract(){
        if (calculations.getText().isEmpty()) {
            calculations.setText(input.getText());
            input.setText("");
            sign.setText("-");
            isDecimal = false;
            return;
        }
        a = Double.parseDouble(calculations.getText());
        b = Double.parseDouble(input.getText());
        c = a - b;
        calculations.setText("");
        input.setText(Double.toString(c));
        isDecimal = false;
        sign.setText("");
    }

    public void divide(){
        if (calculations.getText().isEmpty()) {
            calculations.setText(input.getText());
            input.setText("");
            sign.setText("/");
            isDecimal = false;
            return;
        }
        a = Double.parseDouble(calculations.getText());
        b = Double.parseDouble(input.getText());
        c = a / b;
        calculations.setText("");
        input.setText(Double.toString(c));
        isDecimal = false;
        sign.setText("");
    }

    public void multiply(){
        if (calculations.getText().isEmpty()) {
            calculations.setText(input.getText());
            input.setText("");
            sign.setText("*");
            isDecimal = false;
            return;
        }
        a = Double.parseDouble(calculations.getText());
        b = Double.parseDouble(input.getText());
        c = a * b;
        calculations.setText("");
        input.setText(Double.toString(c));
        isDecimal = false;
        sign.setText("");
    }

    public void percent(){
        if (calculations.getText().isEmpty()) {
            calculations.setText(input.getText());
            input.setText("");
            sign.setText("%");
            isDecimal = false;
            return;
        }
        a = Double.parseDouble(calculations.getText());
        b = Double.parseDouble(input.getText());
        c = a * 100 / b;
        calculations.setText("");
        input.setText(Double.toString(c) + "%");
        isDecimal = false;
        sign.setText("");
    }

    public void sqrt(){
        a = Double.parseDouble(input.getText());
        c = Math.sqrt(a);
        input.setText(Double.toString(c));
        isDecimal = false;
    }

    public void dot(){
        if(!isDecimal){
            if(!input.getText().isEmpty()){
                input.setText(input.getText() + ".");
                isDecimal = true;
                return;
            }
        }
    }

    public mainWindow() {

        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "0");
            }
        });
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "1");
            }
        });
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "2");
            }
        });
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "3");
            }
        });
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "4");
            }
        });
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "5");
            }
        });
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "6");
            }
        });
        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "7");
            }
        });
        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "8");
            }
        });
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "9");
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("");
                isDecimal = false;
            }
        });

        clearEverytingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("");
                calculations.setText("");
                sign.setText("");
                isDecimal = false;
            }
        });

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add();
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                substract();
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                divide();
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiply();
            }
        });
        percentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                percent();
            }
        });
        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sqrt();
            }
        });

        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dot();
            }
        });

        negativePositiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(input.getText().startsWith("-")){
                    input.setText(input.getText().replaceFirst("-",""));
                    return;
                }
                input.setText("-" + input.getText());
            }
        });

        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setAction = sign.getText();
                switch (setAction) {
                    case "+": {
                        add();
                        break;
                    }
                    case "-": {
                        substract();
                        break;
                    }
                    case "/": {
                        divide();
                        break;
                    }
                    case "*": {
                        multiply();
                        break;
                    }
                    case "%": {
                        percent();
                        break;
                    }
                }
            }
        });

        theme1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                themeSet1();
            }
        });

        theme2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                themeSet2();
            }
        });

        theme3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                themeSet3();
            }
        });

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Kalkulator");
        frame.setContentPane(new mainWindow().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setJMenuBar(menuBar);
        menuBar.add(themeBar);
        themeBar.add(theme1);
        themeBar.add(theme2);
        themeBar.add(theme3);
    }

    public void theme (Color panelBackground, Color inputBackground, Color inputForeground, Color accentColor, Color accentColorFont, Color numberButton,
                       Color numberButtonFont, Color actionButton, Color actionButtonFont, Color accentColor2){

        panel.setBackground(panelBackground);
        input.setBackground(inputBackground);
        input.setForeground(inputForeground);

        calculations.setForeground(accentColor2);
        sign.setForeground(accentColor2);

        clearButton.setBackground(accentColor);
        clearButton.setForeground(accentColorFont);
        clearEverytingButton.setBackground(accentColor);
        clearEverytingButton.setForeground(accentColorFont);

        percentButton.setBackground(actionButton);
        divideButton.setBackground(actionButton);
        multiplyButton.setBackground(actionButton);
        minusButton.setBackground(actionButton);
        plusButton.setBackground(actionButton);
        sqrtButton.setBackground(actionButton);
        dotButton.setBackground(actionButton);
        equalsButton.setBackground(actionButton);
        negativePositiveButton.setBackground(actionButton);

        percentButton.setForeground(actionButtonFont);
        divideButton.setForeground(actionButtonFont);
        multiplyButton.setForeground(actionButtonFont);
        minusButton.setForeground(actionButtonFont);
        plusButton.setForeground(actionButtonFont);
        sqrtButton.setForeground(actionButtonFont);
        dotButton.setForeground(actionButtonFont);
        equalsButton.setForeground(actionButtonFont);
        negativePositiveButton.setForeground(actionButtonFont);

        sevenButton.setBackground(numberButton);
        eightButton.setBackground(numberButton);
        nineButton.setBackground(numberButton);
        fourButton.setBackground(numberButton);
        fiveButton.setBackground(numberButton);
        sixButton.setBackground(numberButton);
        oneButton.setBackground(numberButton);
        twoButton.setBackground(numberButton);
        threeButton.setBackground(numberButton);
        zeroButton.setBackground(numberButton);

        sevenButton.setForeground(numberButtonFont);
        eightButton.setForeground(numberButtonFont);
        nineButton.setForeground(numberButtonFont);
        fourButton.setForeground(numberButtonFont);
        fiveButton.setForeground(numberButtonFont);
        sixButton.setForeground(numberButtonFont);
        oneButton.setForeground(numberButtonFont);
        twoButton.setForeground(numberButtonFont);
        threeButton.setForeground(numberButtonFont);
        zeroButton.setForeground(numberButtonFont);

    }
    public void themeSet1(){
        Color panelBackground = new Color(60,63,65);
        Color inputBackground = new Color(116,120,121);
        Color inputForeground = new Color(255,255,255);
        Color accentColor = new Color(226,168,10);
        Color accentColorFont = new Color(255,255,255);
        Color numberButton = new Color(171,183,187);
        Color numberButtonFont = new Color(0,0,0);
        Color actionButton = new Color(16,28,39);
        Color actionButtonFont = new Color(255,255,255);
        Color accentColor2 = new Color(226,168,10);
        theme(panelBackground,inputBackground,inputForeground,accentColor,accentColorFont,numberButton,numberButtonFont,actionButton, actionButtonFont, accentColor2);

    }
    public void themeSet2(){
        Color panelBackground = new Color(210,213,215);
        Color inputBackground = new Color(238,254,255);
        Color inputForeground = new Color(23,172,211);
        Color accentColor = new Color(34,189,170);
        Color accentColorFont = new Color(0,0,0);
        Color numberButton = new Color(215,238,223);
        Color numberButtonFont = new Color(0,0,0);
        Color actionButton = new Color(155,202,203);
        Color actionButtonFont = new Color(255,255,255);
        Color accentColor2 = new Color(34,189,170);
        theme(panelBackground,inputBackground,inputForeground,accentColor,accentColorFont,numberButton,numberButtonFont,actionButton, actionButtonFont, accentColor2);
    }
    public void themeSet3(){
        Color panelBackground = new Color(24,24,24);
        Color inputBackground = new Color(0,0,0);
        Color inputForeground = new Color(4,255,0);
        Color accentColor = new Color(161,37,34);
        Color accentColorFont = new Color(238,254,255);
        Color numberButton = new Color(216,226,184);
        Color numberButtonFont = new Color(0,0,0);
        Color actionButton = new Color(86,104,100);
        Color actionButtonFont = new Color(255,255,255);
        Color accentColor2 = new Color(4,255,0);
        theme(panelBackground,inputBackground,inputForeground,accentColor,accentColorFont,numberButton,numberButtonFont,actionButton, actionButtonFont, accentColor2);
    }

}
