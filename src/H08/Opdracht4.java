package H08;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht4 extends Applet
{
    //create variables and objects
    TextField vak1;
    TextField vak2;
    Button divide1;
    Button multiply1;
    Button plus1;
    Button minus1;
    Button ce1;
    double waarde1;
    double waarde2;

    public void init()
    {
        setSize(250,200);
        //fields
        vak1 = new TextField(10);
        vak2 = new TextField(10);
        ce1 = new Button();	//clear button
        divide1 = new Button();	//divide button
        multiply1 = new Button();	//multiply button
        plus1 = new Button();	//plus button
        minus1 = new Button();	//minus button
        //set labels
        ce1.setLabel("Ce");
        divide1.setLabel("/");
        multiply1.setLabel("X");
        plus1.setLabel("+");
        minus1.setLabel("-");
        //create listeners
        listen1 minus = new listen1();
        listen2 plus = new listen2();
        listen3 div = new listen3();
        listen4 mult = new listen4();
        listen5 ce = new listen5();
        //setting listeners
        plus1.addActionListener(plus);
        minus1.addActionListener(minus);
        divide1.addActionListener(div);
        multiply1.addActionListener(mult);
        ce1.addActionListener(ce);
        //adding buttons
        add(vak1);
        add(vak2);
        add(ce1);
        add(plus1);
        add(minus1);
        add(multiply1);
        add(divide1);
    }
    private class listen1 implements ActionListener	//minus button
    {
        public void actionPerformed( ActionEvent e)
        {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde1 = waarde1-waarde2;
            vak1.setText(String.valueOf(waarde1));
            vak2.setText(null);
            repaint();
        }
    }
    private class listen2 implements ActionListener //plus button
    {
        public void actionPerformed( ActionEvent e)
        {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde1 = waarde1+waarde2;
            vak1.setText(String.valueOf(waarde1));
            vak2.setText(null);
            repaint();
        }
    }
    private class listen3 implements ActionListener //divide button
    {
        public void actionPerformed( ActionEvent e)
        {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde1 = waarde1/waarde2;
            vak1.setText(String.valueOf(waarde1));
            vak2.setText(null);
            repaint();
        }
    }
    private class listen4 implements ActionListener //multiply button
    {
        public void actionPerformed( ActionEvent e)
        {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde1 = waarde1*waarde2;
            vak1.setText(String.valueOf(waarde1));
            vak2.setText(null);
            repaint();
        }
    }
    private class listen5 implements ActionListener //clear button
    {
        public void actionPerformed( ActionEvent e)
        {
            vak1.setText(null);
            vak2.setText(null);
            repaint();
        }
    }

}
