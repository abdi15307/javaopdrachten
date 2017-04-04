package demo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class VB5 extends Applet
{
    double fris, bier, wijn, koffie, bindist, buitdist, bestelling, dagomzet, newb, gem, gembes;
    Button koffiebutton;
    Button bierbutton;
    Button frisbutton;
    Button wijnbutton;
    Button bindistbutton;
    Button buitdistbutton;
    Button new1;

    public void init()
    {
        setSize(300,300);
        gembes = 0;
        gem = 0;
        newb = 0;
        fris = 2;
        bier = 2.25 ;
        wijn = 2.5;
        koffie = 1.75;
        bindist = 2.75 ;
        buitdist = 3.50;
        bestelling = 0;
        dagomzet = 0;
        Listen1 kb = new Listen1();
        Listen2 bb = new Listen2();
        Listen3 fb = new Listen3();
        Listen4 wb = new Listen4();
        Listen5 bidb = new Listen5();
        Listen6 budb = new Listen6();
        Listen7 nb = new Listen7();
        koffiebutton = new Button("koffie");
        bierbutton  = new Button("bier");
        frisbutton = new Button("fris");
        wijnbutton = new Button("wijn");
        bindistbutton = new Button("bindist.");
        buitdistbutton = new Button("buitdist.");
        new1 = new Button("nieuwe bestelling");
        koffiebutton.addActionListener(kb);
        bierbutton.addActionListener(bb);
        frisbutton.addActionListener(fb);
        wijnbutton.addActionListener(wb);
        bindistbutton.addActionListener(bidb);
        buitdistbutton.addActionListener(budb);
        new1.addActionListener(nb);
        add(frisbutton);
        add(bierbutton);
        add(wijnbutton);
        add(bindistbutton);
        add(buitdistbutton);
        add(new1);
    }
    public void paint(Graphics g)
    {
        g.drawString("Bestelling Totaal: "+(String.format("%.2f", Double.valueOf(bestelling))), 100, 150);
        g.drawString("dagomzet: "+(String.format("%.2f", Double.valueOf(dagomzet))), 100, 165);
        g.drawString("gemiddelde per bestelling: "+(String.format("%.2f", Double.valueOf(gem))), 100, 180);
    }
    class Listen1 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            bestelling = bestelling+koffie;
            dagomzet = dagomzet+koffie;
            gembes = gembes+koffie;
            repaint();
        }
    }
    class Listen2 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            bestelling = bestelling+bier;
            dagomzet = dagomzet+bier;
            gembes = gembes+bier;
            repaint();
        }
    }
    class Listen3 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            bestelling = bestelling+fris;
            dagomzet = dagomzet+fris;
            gembes = gembes+fris;
            repaint();
        }
    }
    class Listen4 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            bestelling = bestelling+wijn;
            dagomzet = dagomzet+wijn;
            gembes = gembes+wijn;
            repaint();
        }
    }
    class Listen5 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            bestelling = bestelling+bindist;
            dagomzet = dagomzet+bindist;
            gembes = gembes+bindist;
            repaint();
        }
    }
    class Listen6 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            bestelling = bestelling+buitdist;
            dagomzet = dagomzet+buitdist;
            gembes = gembes+buitdist;
            repaint();
        }
    }
    class Listen7 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            newb++;
            gem = gembes/newb;
            bestelling = 0;
            repaint();
        }
    }

}