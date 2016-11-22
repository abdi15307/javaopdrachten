package h13;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Eigenaar on 22-11-2016.
 */
public class Opdracht4 extends Applet {

    Button knop1;
    Button knop2;
    boolean geklikt1;
    boolean geklikt2;


    @Override
    public void init() {
        knop1 = new Button("Bakstenen");
        knop1.addActionListener(new EersteKnop());
        knop2 = new Button("Betonstenen");
        knop2.addActionListener(new TweedeKnop());

        add(knop1);
        add(knop2);
    }

    class EersteKnop implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            geklikt1 = true;
            geklikt2 = false;
            repaint();
        }
    }
    class TweedeKnop implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            geklikt2 = true;
            geklikt1 = false;
            repaint();
        }
    }


    public void paint(Graphics g) {

        knop1.setBackground(Color.red);
        knop1.setForeground(Color.WHITE);
        knop2.setBackground(Color.GRAY);
        knop2.setForeground(Color.WHITE);

        if (geklikt1) {
            setSize(650, 400);
            int x, y, breedte, hoogte;
            x = 50;
            y = 50;
            breedte = 50;
            hoogte = 25;
            int breedte2 = 500;
            int hoogte2 = 250;

            g.setColor(Color.RED);
            g.fillRect(x, y + 25, breedte2, hoogte2);

            for (int i = 0; i < 5; i++) {
                x = 50;
                y += 25;
                for (int kolom = 0; kolom < 10; kolom++) {
                    g.setColor(Color.white);
                    g.drawRect(x, y, breedte, hoogte);
                    x += 50;
                }
                x = 25;
                y += 25;
                for (int kolom = 0; kolom < 11; kolom++) {
                    g.setColor(Color.white);
                    g.drawRect(x, y, breedte, hoogte);
                    x += 50;
                }
            }
        }

        if(geklikt2){
            setSize(650, 400);

            int x, y, breedte, hoogte;

            x = 50;
            y = 25;
            breedte = 75;
            hoogte = 50;


            g.setColor(Color.GRAY);
            g.fillRect(x, 75, 525, 250);

            for (int i = 0; i < 4; i++) {
                x = 50;
                y += 50;
                for (int kolom = 0; kolom < 7; kolom++) {
                    g.setColor(Color.white);
                    g.drawRect(x, y, breedte, hoogte);
                    x += 75;
                }
                x = 25;
                y += 50;
                for (int kolom = 0; kolom < 8; kolom++) {
                    g.setColor(Color.white);
                    g.drawRect(x, y, breedte, hoogte);
                    x += 75;
                }
            }
        }
    }


}