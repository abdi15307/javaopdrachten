package demo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.applet.*;


@SuppressWarnings("serial")
public class VB6 extends Applet
{
    double geld, geldfooi;
    int fooiperc;
    Button plus;
    Button minus;
    Button reset;
    TextField geldfield;
    Label fooiandshit;

    public void init()
    {
        setSize(200,300);
        geld = 0;
        fooiperc = 0;
        Listen1 geldc = new Listen1();
        Listen2 plusc = new Listen2();
        Listen3 minc = new Listen3();
        Listen4 resetc = new Listen4();
        plus = new Button("+");
        minus = new Button("-");
        reset = new Button("Ce");
        geldfield = new TextField("Geld", 15);
        fooiandshit = new Label("fooipercentage: "+fooiperc+"%");
        plus.addActionListener(plusc);
        minus.addActionListener(minc);
        geldfield.addActionListener(geldc);
        reset.addActionListener(resetc);
        add(geldfield);
        add(reset);
        add(fooiandshit);
        add(minus);
        add(plus);

    }
    public void paint (Graphics g)
    {
        if (geld>0)
        {
            g.drawString("fooi: "+(String.format("%.2f", Double.valueOf(geldfooi))), 60, 100);
            g.drawString("totaal: "+(String.format("%.2f", Double.valueOf(geldfooi+geld))), 60, 120);
        }
    }

    class Listen1 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            geld = Double.parseDouble(geldfield.getText());
            geldfooi = geld/100*fooiperc;
            repaint();
        }
    }
    class Listen2 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            fooiperc++;
            fooiandshit.setText("fooipercentage: "+fooiperc+"%");
            repaint();
        }
    }
    class Listen3 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            fooiperc--;
            fooiandshit.setText("fooipercentage: "+fooiperc+"%");
            repaint();
        }
    }
    class Listen4 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            geldfield.setText("");
            geld =0;
            repaint();
        }
    }

}