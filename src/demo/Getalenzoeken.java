package demo;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Eigenaar on 8-11-2016.
 */
public class Getalenzoeken extends Applet {

    int[] getallen = {556, 44, 58, 102, 23, 17, 53, 35};
    TextField tekstvak;
    Button knop;
    String schermteskt;


public  void init() {
    tekstvak =  new TextField("",8);
    add(tekstvak);
    knop = new Button("Kies");


}

public void paint(Graphics g) {
    int x = 50;
    int y = 80;
    g.drawString(schermteskt, x, y);
}


//class  Knoplistener implements ActionListener{
  //  @Override
  // / public  void actionperformed(ActiveEvent e){
        //int invoer = Integer.parseInt(in.getText());
        boolean isgevonden = false;
     //   for (int i = 0; i < getallen.length; i++) {
           // if(getallen[i]== invoer);
        }
        // if (isgevonden){
         //    schermtekst = "Is gevonden";
//

      //  } else {
            // schermtekst = "Is niet gevonden";






