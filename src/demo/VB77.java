package demo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class VB77 extends Applet
{
    int uur, sydneyt, londent, nyt, tokyot;
    Button ok;
    TextField vak1;
    public void init()
    {
        ok = new Button("OK");
        vak1 = new TextField("",15);
        uur = -1;
        Listen1 OK = new Listen1();
        ok.addActionListener(OK);
        add(vak1);
        add(ok);
    }
    public void paint(Graphics g)
    {
        if (uur>-1&& uur<24)
        {
            g.drawString("London: "+sydneyt+":00", 60, 60);
            g.drawString("new york: "+nyt+":00", 60, 80);
            g.drawString("tokyo: "+tokyot+":00", 60, 100);
            g.drawString("Sydney: "+londent+":00", 60, 120);
        }
        else if(uur !=-1)
        {
            g.drawString("ERROR: voer een geldig uur in!!", 20, 80);
        }
    }
    class Listen1 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            uur = Integer.parseInt(vak1.getText());
            if (uur<24 && uur >-1)
            {
                sydneyt = uur + 9;
                if (sydneyt>23)
                {
                    sydneyt = sydneyt - 24;
                }
                tokyot = uur+7;
                if (tokyot>23)
                {
                    tokyot = tokyot - 24;
                }
                nyt = uur-6;
                if (nyt< 0)
                {
                    nyt = nyt + 24;
                }
                londent = uur - 1;
                if (londent< 0)
                {
                    londent = londent + 24;
                }
                repaint();
            }
        }
    }
}