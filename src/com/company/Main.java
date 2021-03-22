package com.company;

import javax.swing.*;
// текст будет перемещаться если зажать левую кнопку мыши
public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Java 2");
        frame.add(new HelloComponent2("Hello, Java pt.2!"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
