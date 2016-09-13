package h02;

/**
 * Created by Eigenaar on 8-9-2016.
 */

    import java.awt.*;
import java.applet.*;

    public class Opdracht01 extends Applet {

        public void init() {
            setBackground(Color.blue);
        }

        public void paint(Graphics g) {
            g.setColor(Color.yellow);
            g.drawString("Said !!", 50, 60 );
        }
    }




