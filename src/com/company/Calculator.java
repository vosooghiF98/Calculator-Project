package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame c;
    JTextField t;
    JButton b1;JButton b2;
    JButton b3;JButton b4;
    JButton b5;JButton b6;
    JButton b7;JButton b8;
    JButton b9;JButton b0;
    JButton bAdd;JButton bMines;
    JButton bMulti;JButton bDiv;
    JButton bDelete;JButton bClear;
    JButton bDec;JButton bEqual;
    String operation = "";
    double firstInput = 0.0;
    double secondInput = 0.0;
    String d;
    String d1;

    public Calculator(){

    }

    public void setForm(){
        c = new JFrame("Calculator");
        c.setSize(350,500);
        c.setResizable(false);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setLayout(null);

        t = new JTextField();
        t.setBounds(35,55,260,40);
        c.add(t);
    }

    public void setButton(){
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bAdd = new JButton("+");
        bMines = new JButton("-");
        bMulti = new JButton("*");
        bDiv = new JButton("/");
        bDec = new JButton(".");
        bDelete = new JButton("Delete");
        bClear = new JButton("Clear");
        bEqual = new JButton("=");

        b1.setBounds(35,200,50,50);
        b2.setBounds(105,200,50,50);
        b3.setBounds(175,200,50,50);
        bAdd.setBounds(245,200,50,50);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(bAdd);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        bAdd.addActionListener(this);
        
        b4.setBounds(35,270,50,50);
        b5.setBounds(105,270,50,50);
        b6.setBounds(175,270,50,50);
        bMines.setBounds(245,270,50,50);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(bMines);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        bMines.addActionListener(this);

        b7.setBounds(35,340,50,50);
        b8.setBounds(105,340,50,50);
        b9.setBounds(175,340,50,50);
        bMulti.setBounds(245,340,50,50);
        c.add(b7);
        c.add(b8);
        c.add(b9);
        c.add(bMulti);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bMulti.addActionListener(this);

        bDec.setBounds(35,410,50,50);
        b0.setBounds(105,410,50,50);
        bEqual.setBounds(175,410,50,50);
        bDiv.setBounds(245,410,50,50);
        c.add(bDec);
        c.add(b0);
        c.add(bEqual);
        c.add(bDiv);
        bDec.addActionListener(this);
        b0.addActionListener(this);
        bEqual.addActionListener(this);
        bDiv.addActionListener(this);

        bDelete.setBounds(35,130,110,40);
        bClear.setBounds(185,130,110,40);
        c.add(bDelete);
        c.add(bClear);
        bDelete.addActionListener(this);
        bClear.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            t.setText(t.getText().concat("1"));
        }
        if (e.getSource() == b2){
            t.setText(t.getText().concat("2"));
        }
        if (e.getSource() == b3){
            t.setText(t.getText().concat("3"));
        }
        if (e.getSource() == b4){
            t.setText(t.getText().concat("4"));
        }
        if (e.getSource() == b5){
            t.setText(t.getText().concat("5"));
        }
        if (e.getSource() == b6){
            t.setText(t.getText().concat("6"));
        }
        if (e.getSource() == b7){
            t.setText(t.getText().concat("7"));
        }
        if (e.getSource() == b8){
            t.setText(t.getText().concat("8"));
        }
        if (e.getSource() == b9){
            t.setText(t.getText().concat("9"));
        }
        if (e.getSource() == b0){
            t.setText(t.getText().concat("0"));
        }
        if (e.getSource() == bDec){
            t.setText(t.getText().concat("."));
        }
        if (e.getSource() == bMulti){
            firstInput = Double.parseDouble(t.getText());
            operation = "*";
            t.setText("");
        }
        if (e.getSource() == bDiv){
            firstInput = Double.parseDouble(t.getText());
            operation = "/";
            t.setText("");
        }
        if (e.getSource() == bAdd){
            firstInput = Double.parseDouble(t.getText());
            operation = "+";
            t.setText("");
        }
        if (e.getSource() == bMines){
            firstInput = Double.parseDouble(t.getText());
            operation = "-";
            t.setText("");
        }
        if (e.getSource() == bMines){
            firstInput = Double.parseDouble(t.getText());
            operation = "-";
            t.setText("");
        }
        if (e.getSource() == bEqual){
            secondInput = Double.parseDouble(t.getText());
            if (operation.equals("+")){
                t.setText(String.valueOf(firstInput+secondInput));
            }
            if (operation.equals("-")){
                t.setText(String.valueOf(firstInput-secondInput));
            }
            if (operation.equals("*")){
                t.setText(String.valueOf(firstInput*secondInput));
            }
            if (operation.equals("/")){
                t.setText(String.valueOf(firstInput/secondInput));
            }
        }
        if (e.getSource() == bClear){
            t.setText("");
            operation = "";
        }
        if (e.getSource() == bDelete){
            d = t.getText();
            d1 = "";
            for (int i = 0; i < d.length()-1; i++) {
                d1 += d.charAt(i);
                t.setText(d1);
            }
        }
    }
}
