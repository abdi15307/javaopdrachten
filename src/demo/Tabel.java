import java.awt.*;
import java.applet.*;

public class Tabel extends Applet {
    String[] stringarray;
    int x,y;
    public void init() {

        stringarray = new String[10];

        stringarray[0] = "ik wil geld";
        stringarray[1] = "ik wil gg";
        stringarray[2] = "ik wil auto";
        stringarray[3] = "ik wil baan";
        stringarray[4] = "ik wil cola";
        stringarray[5] = "ik wil niks";
        stringarray[6] = "ik wil vrij";
        stringarray[7] = "ik wil gezond zijn";
        stringarray[8] = "ik wil iphone 7";
        stringarray[9] = "ik wil huis";

    }


    public void paint(Graphics g) {
        int x = 20;
        int y = 70;
        for (int i = 0; i < stringarray.length; i ++) {
            g.drawString(""+ stringarray[i], y, x);
            x+=20;

        }
    }
}