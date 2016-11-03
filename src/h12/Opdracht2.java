package h12;
import java.applet.*;
import java.awt.*;

/**
 * Created by Eigenaar on 3-11-2016.
 */
public class Opdracht2 extends Applet {

    Button[]knoppen = new Button[25];

    public void init() {
        setSize(500, 550);
        for (int i = 0; i < knoppen.length; i++) {
            knoppen[i] = new Button("knop "+ (i+1));
            add(knoppen[i]);
        }
    }

}