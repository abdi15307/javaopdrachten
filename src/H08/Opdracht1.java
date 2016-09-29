package H08;

/**
 * Created by Eigenaar on 22-9-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Opdracht1 extends  Applet {
    TextField tekstvak;
    Button knop;
    Button reset;
    String s;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        reset = new Button("reset");
        knop.addActionListener( new KnopListener() );
        reset.addActionListener( new ResetKnopListener() );
        add(tekstvak);
        add(knop);
        add(reset);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60 );

    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();

            repaint();
        }

    }

    class ResetKnopListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            s = "";
            repaint();
        }
    }
}
