package h11;

/**
 * Created by Eigenaar on 27-10-2016.
 */

import java.applet.Applet;
import java.awt.*;
public class Opdracht9 extends Applet {
    public void init(){
        setSize(500,600);
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        int y, x,breedte,hoogte;
        y = 50;
        x = 50;
        breedte = 40;
        hoogte = breedte;
        for (int rij = 0; rij < 4; rij++) {
            x = 50;
            y +=40;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                }
                x += breedte;
            }
            //tweede rij
            x = 50;
            y += 40;
            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 40, 40);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                }
                x +=breedte;
            }
        }
    }
}





