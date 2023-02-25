package com.company;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class W1 extends JFrame implements WindowListener, ActionListener, KeyListener {

        private final TextField TF = new TextField();
        private String text="";
        private float a=0;
        private float b=0;
        private char z;
        private final JButton b0 = new JButton ("0");
        private final JButton b1 = new JButton ("1");
        private final JButton b2 = new JButton ("2");
        private final JButton b3 = new JButton ("3");
        private final JButton b4 = new JButton ("4");
        private final JButton b5 = new JButton ("5");
        private final JButton b6 = new JButton ("6");
        private final JButton b7 = new JButton ("7");
        private final JButton b8 = new JButton ("8");
        private final JButton b9 = new JButton ("9");
        private final JButton bC = new JButton ("C"); /*стереть все*/
        private final JButton bD = new JButton ("D"); /*стереть последний символ*/
        private final JButton bComma = new JButton (",");
        private final JButton bChange = new JButton ("±");
        private final JButton bEquals = new JButton ("=");
        private final JButton bPlus = new JButton ("+");
        private final JButton bMinus = new JButton ("-");
        private final JButton bDivide = new JButton ("/");
        private final JButton bMulti = new JButton ("*");
        private final JButton bSQ = new JButton ("Q"); /*sqrt*/


        public W1(){


            Font ex = new Font("Impact",Font.BOLD, 40);
            Font ex1 = new Font("Impact",Font.BOLD, 30); /*выбор шрифта*/
            setLayout(null);
            setVisible(true);

            setLocation(400,400);
            setSize(400,600);
            setDefaultCloseOperation(W1.EXIT_ON_CLOSE);
            setResizable(false);/* запрет на изменение размера*/
            getContentPane().setBackground(Color.PINK);


            TF.setVisible(true);
            add(TF);
            TF.setFont(ex); /*add шрифта*/
            TF.setLocation(25,25);
            TF.setSize(335,50);

            b0.setSize(60,60);
            b0.setVisible(true);
            add(b0);
            b0.setFont(ex1);
            b0.setLocation(10,490);
            b0.addActionListener(this);
            b0.addKeyListener(this);
            b0.setBackground(Color.CYAN);


            b1.setSize(60,60);
            b1.setVisible(true);
            add(b1);
            b1.setFont(ex1);
            b1.setLocation(10,420);
            b1.addActionListener(this);
            b1.addKeyListener(this);
            b1.setBackground(Color.CYAN);

            b2.setSize(60,60);
            b2.setVisible(true);
            add(b2);
            b2.setFont(ex1);
            b2.setLocation(80,420);
            b2.addActionListener(this);
            b2.addKeyListener(this);
            b2.setBackground(Color.CYAN);

            b3.setSize(60,60);
            b3.setVisible(true);
            add(b3);
            b3.setFont(ex1);
            b3.setLocation(150,420);
            b3.addActionListener(this);
            b3.addKeyListener(this);
            b3.setBackground(Color.CYAN);

            b4.setSize(60,60);
            b4.setVisible(true);
            add(b4);
            b4.setFont(ex1);
            b4.setLocation(10,350);
            b4.addActionListener(this);
            b4.addKeyListener(this);
            b4.setBackground(Color.CYAN);

            b5.setSize(60,60);
            b5.setVisible(true);
            add(b5);
            b5.setFont(ex1);
            b5.setLocation(80,350);
            b5.addActionListener(this);
            b5.addKeyListener(this);
            b5.setBackground(Color.CYAN);

            b6.setSize(60,60);
            b6.setVisible(true);
            add(b6);
            b6.setFont(ex1);
            b6.setLocation(150,350);
            b6.addActionListener(this);
            b6.addKeyListener(this);
            b6.setBackground(Color.CYAN);

            b7.setSize(60,60);
            b7.setVisible(true);
            add(b7);
            b7.setFont(ex1);
            b7.setLocation(10,280);
            b7.addActionListener(this);
            b7.addKeyListener(this);
            b7.setBackground(Color.CYAN);

            b8.setSize(60,60);
            b8.setVisible(true);
            add(b8);
            b8.setFont(ex1);
            b8.setLocation(80,280);
            b8.addActionListener(this);
            b8.addKeyListener(this);
            b8.setBackground(Color.CYAN);

            b9.setSize(60,60);
            b9.setVisible(true);
            add(b9);
            b9.setFont(ex1);
            b9.setLocation(150,280);
            b9.addActionListener(this);
            b9.addKeyListener(this);
            b9.setBackground(Color.CYAN);

            bC.setSize(60,60);
            bC.setVisible(true);
            add(bC);
            bC.setFont(ex1);
            bC.setLocation(80,210);
            bC.addActionListener(this);
            bC.addKeyListener(this);
            bC.setBackground(Color.CYAN);

            bD.setSize(60,60);
            bD.setVisible(true);
            add(bD);
            bD.setFont(ex1);
            bD.setLocation(10,210);
            bD.addActionListener(this);
            bD.addKeyListener(this);
            bD.setBackground(Color.CYAN);


            bComma.setSize(60,60);
            bComma.setVisible(true);
            add(bComma);
            bComma.setFont(ex1);
            bComma.setLocation(80,490);
            bComma.addActionListener(this);
            bComma.addKeyListener(this);
            bComma.setBackground(Color.CYAN);

            bChange.setSize(60,60);
            bChange.setVisible(true);
            add(bChange);
            bChange.setFont(ex1);
            bChange.setLocation(150,490);
            bChange.addActionListener(this);
            bChange.addKeyListener(this);
            bChange.setBackground(Color.CYAN);

            bEquals.setSize(60,130);
            bEquals.setVisible(true);
            add(bEquals);
            bEquals.setFont(ex1);
            bEquals.setLocation(220,420);
            bEquals.addActionListener(this);
            bEquals.addKeyListener(this);
            bEquals.setBackground(Color.CYAN);

            bPlus.setSize(60,60);
            bPlus.setVisible(true);
            add(bPlus);
            bPlus.setFont(ex1);
            bPlus.setLocation(220,350);
            bPlus.addActionListener(this);
            bPlus.addKeyListener(this);
            bPlus.setBackground(Color.CYAN);

            bMinus.setSize(60,60);
            bMinus.setVisible(true);
            add(bMinus);
            bMinus.setFont(ex1);
            bMinus.setLocation(220,280);
            bMinus.addActionListener(this);
            bMinus.addKeyListener(this);
            bMinus.setBackground(Color.CYAN);

            bDivide.setSize(60,60);
            bDivide.setVisible(true);
            add(bDivide);
            bDivide.setFont(ex1);
            bDivide.setLocation(220,210);
            bDivide.addActionListener(this);
            bDivide.addKeyListener(this);
            bDivide.setBackground(Color.CYAN);

            bMulti.setSize(60,60);
            bMulti.setVisible(true);
            add(bMulti);
            bMulti.setFont(ex1);
            bMulti.setLocation(150,210);
            bMulti.addActionListener(this);
            bMulti.addKeyListener(this);
            bMulti.setBackground(Color.CYAN);

            bSQ.setSize(60,60); /*квадратный корень*/
            bSQ.setVisible(true);
            add(bSQ);
            bSQ.setFont(ex1);
            bSQ.setLocation(10,140);
            bSQ.addActionListener(this);
            bSQ.addKeyListener(this);
            bSQ.setBackground(Color.CYAN);


        }




    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            text = text + b1.getText();
            TF.setText(text);
        }
        if (e.getSource() == b2) {
            text = text + b2.getText();
            TF.setText(text);
        }
        if (e.getSource() == b3) {
            text = text + b3.getText();
            TF.setText(text);
        }
        if (e.getSource() == b4) {
            text = text + b4.getText();
            TF.setText(text);
        }
        if (e.getSource() == b5) {
            text = text + b5.getText();
            TF.setText(text);
        }
        if (e.getSource() == b6) {
            text = text + b6.getText();
            TF.setText(text);
        }
        if (e.getSource() == b7) {
            text = text + b7.getText();
            TF.setText(text);
        }
        if (e.getSource() == b8) {
            text = text + b8.getText();
            TF.setText(text);
        }
        if (e.getSource() == b9) {
            text = text + b9.getText();
            TF.setText(text);
        }
        if (e.getSource() == b0){
            text = text+b0.getText();
            TF.setText(text);
        }
        if (e.getSource() == bC){
            text = "";
            TF.setText(text);
        }

        if (e.getSource() == bPlus){
            a = Float.parseFloat (text);
            TF.setText(text+bPlus.getText());
            text = "";
            z = '+';
        }

        if (e.getSource() == bMinus){
            a = Float.parseFloat(text);
            TF.setText(text+bMinus.getText());
            text = "";
            z = '-';
        }

        if (e.getSource() == bDivide){
            a = Float.parseFloat(text);
            TF.setText(text+bDivide.getText());
            text = "";
            z = '/';
        }

        if (e.getSource() == bMulti){
            a = Float.parseFloat(text);
            TF.setText(text+bMulti.getText());
            text = "";
            z = '*';
        }


        if (e.getSource() == bEquals){
            if (z=='+'){
                b=Float.parseFloat(text);
                float c =  (a + b);
                TF.setText(String.valueOf(c));
                text = String.valueOf(c);
            }
            if (z=='-'){
                b=Float.parseFloat(text);
                float c =  (a - b);
                TF.setText(String.valueOf(c));
                text = String.valueOf(c);
            }
            if (z=='/'){
                b=Float.parseFloat(text);
                float c = (a / b);
                TF.setText(String.valueOf (c));
                text = String.valueOf (c);
            }
            if (z=='*'){
                b=Float.parseFloat(text);
                float c =  (a * b);
                TF.setText(String.valueOf(c));
                text = String.valueOf(c);

            }


        }

        if (e.getSource() == bD){
            int c = Integer.parseInt(TF.getText());
            c=c/10;
            TF.setText(String.valueOf(c));
            text = String.valueOf(c);
        }
       /* if (e.getSource() == bD){
            text = TF.getText();
            int l = text.length();
            StringBuilder c = new StringBuilder();
            c.deleteCharAt(l);


        }*/


        if (e.getSource() == bChange){
            float c = Float.parseFloat(TF.getText());
            c=c*(-1);
            TF.setText(String.valueOf(c));
            text = String.valueOf(c);
        }

        if (e.getSource() == bComma){
            float c = Float.parseFloat(TF.getText());
            c= (c/10);
            TF.setText(String.valueOf(c));
            text = String.valueOf(c);
        }
        if (e.getSource() == bSQ) {
            float c = Float.parseFloat(TF.getText());
            c = (float) Math.sqrt(c);
            TF.setText(String.valueOf(c));
            text = String.valueOf(c);
        }





    }
    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

/*
        if (e.getKeyCode() == KeyEvent.VK_1) {
                        text = text + KeyEvent.VK_1;
            TF.setText(text);
        }


        if (e.getKeyCode() == KeyEvent.VK_B) {
            text = text + b2.getText();
            TF.setText(text);
        }
        if (e.getKeyCode() == KeyEvent.VK_3) {
            text = text + b3.getText();
            TF.setText(text);
        }
        if (e.getKeyCode() == KeyEvent.VK_4) {
            text = text + b4.getText();
            TF.setText(text);
        }

        if (e.getKeyCode() == KeyEvent.VK_5) {
            text = text + b5.getText();
            TF.setText(text);
        }
        if (e.getKeyCode() == KeyEvent.VK_6) {
            text = text + b6.getText();
            TF.setText(text);
        }
        if (e.getKeyCode() == KeyEvent.VK_7) {
            text = text + b7.getText();
            TF.setText(text);
        }
        if (e.getKeyCode() == KeyEvent.VK_8) {
            text = text + b8.getText();
            TF.setText(text);
        }
        if (e.getKeyCode() == KeyEvent.VK_9) {
            text = text + b9.getText();
            TF.setText(text);
        }
        if (e.getKeyCode() == KeyEvent.VK_0) {
            text = text + b0.getText();
            TF.setText(text);
        }
        if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
            text = "";
            TF.setText(text);
        }

        if (e.getKeyCode() == KeyEvent.VK_PLUS){
            a = Float.parseFloat (text);
            TF.setText(text+bPlus.getText());
            text = "";
            z = '+';
        }

        if (e.getKeyCode() == KeyEvent.VK_MINUS){
            a = Float.parseFloat(text);
            TF.setText(text+bMinus.getText());
            text = "";
            z = '-';
        }

        if (e.getKeyCode() == KeyEvent.VK_DIVIDE){
            a = Float.parseFloat(text);
            TF.setText(text+bDivide.getText());
            text = "";
            z = '/';
        }

        if (e.getKeyCode() == KeyEvent.VK_MULTIPLY ) {
            a = Float.parseFloat(text);
            TF.setText(text+KeyEvent.VK_MULTIPLY);

            text = "";
            z = '*';
        }


        if (e.getKeyCode() == KeyEvent.VK_ENTER){
            if (z=='+'){
                b=Float.parseFloat(text);
                float c =  (a + b);
                TF.setText(String.valueOf(c));
                text = String.valueOf(c);
            }
            if (z=='-'){
                b=Float.parseFloat(text);
                float c =  (a - b);
                TF.setText(String.valueOf(c));
                text = String.valueOf(c);
            }
            if (z=='/'){
                b=Float.parseFloat(text);
                float c = (a / b);
                TF.setText(String.valueOf (c));
                text = String.valueOf (c);
            }
            if (z=='*'){
                b=Float.parseFloat(text);
                float c =  (a * b);
                TF.setText(String.valueOf(c));
                text = String.valueOf(c);

            }


        }

        if (e.getKeyCode() == KeyEvent.VK_DELETE){
            int c = Integer.parseInt(TF.getText());
            c=c/10;
            TF.setText(String.valueOf(c));
            text = String.valueOf(c);
        }


       if (e.getSource() == bChange){
            float c = Float.parseFloat(TF.getText());
            c=c*(-1);
            TF.setText(String.valueOf(c));
            text = String.valueOf(c);
        }

        if (e.getKeyCode() == KeyEvent.VK_COMMA){
            float c = Float.parseFloat(TF.getText());
            c= (c/10);
            TF.setText(String.valueOf(c));
            text = String.valueOf(c);
        }
         (e.getSource() == bSQ) {
            float c = Float.parseFloat(TF.getText());
            c = (float) Math.sqrt(c);
            TF.setText(String.valueOf(c));
            text = String.valueOf(c);
        }*/

    }

    @Override
    public void keyPressed(KeyEvent e) {


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
