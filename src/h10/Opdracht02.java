package h10;

/**
 * Created by Eigenaar on 7-10-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Opdracht02 extends Applet{
    TextField tekstvak1;
    TextField tekstvak2;
    Label  label;
    String s,a,tekst;
    int cijfer1;
    int cijfer2;

    public void init() {
        super.init();
        tekstvak1 = new TextField("", 10);
        tekstvak2 = new TextField("", 10);
        label = new Label(" Voer hier een getal");
        tekstvak1.addActionListener(new Tekstvaklistner());
        tekstvak2.addActionListener(new Tekstvaklistner());

        add(label);
        add(tekstvak1);
        add(tekstvak2);
        tekst="";


    }
    @Override
    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }


    class Tekstvaklistner implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            s= tekstvak1.getText();
            cijfer1 = Integer.parseInt(s);
            a = tekstvak2.getText();
            cijfer2 = Integer.parseInt(a);
            if (cijfer1 < cijfer2){
                tekst = cijfer1 + " is kleiner dan " + cijfer2;
            }
            else{
                tekst = cijfer2 +" is kleiner dan " + cijfer1;

            }
            repaint();

        }
    }

}
