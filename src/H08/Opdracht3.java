package H08;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Opdracht3 extends Applet
{
    //create variables and objects
    private Label label;
    private TextField vak1;
    private Button buttonOK;
    private Button buttonreset;
    private double btw;
    private double prijs;
    String s;
    public void init()
    {
        //setting variables
        btw = 1.19;
        setSize(200,200);
        //initializing and adding objects
        label = new Label("€");
        vak1 = new TextField("",20);
        buttonOK = new Button();
        buttonreset = new Button();
        buttonOK.setLabel("OK");
        buttonreset.setLabel("reset");
        add(label);
        add(vak1);
        add(buttonOK);
        add(buttonreset);
        listen1 ok = new listen1();
        listen2 reset = new listen2();
        listen3 vak = new listen3();
        vak1.addActionListener(vak);
        buttonOK.addActionListener(ok);
        buttonreset.addActionListener(reset);
    }
    //actions for the OK button
    class listen1 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            prijs = Double.parseDouble(vak1.getText());
            prijs = prijs*btw;
            vak1.setText(String.format("%.2f", Double.valueOf(prijs)));
            repaint();
        }
    }
    //actions for reset button
    class listen2 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            vak1.setText(null);
            repaint();
        }
    }
    //actions for pressing ENTER
    class listen3 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            prijs = Double.parseDouble(vak1.getText());
            prijs = prijs*btw;
            vak1.setText(String.format("%.2f", Double.valueOf(prijs)));
            repaint();
        }
    }
}