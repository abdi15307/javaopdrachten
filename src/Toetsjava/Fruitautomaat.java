package Toetsjava;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
import java.net.*;

public class Fruitautomaat extends Applet{

    private Button speel;
    private Button kopen;
    private boolean punten4;
    private boolean punten20;
    private int krediet = 10;
    private Image[] afbeeldingen = new Image[20];
    private AudioClip sound;





    private int afbeelding1 = (int)(Math.random() * 20);
    private int afbeelding2 = (int)(Math.random() * 20);
    private int afbeelding3 = (int)(Math.random() * 20);




    public void init(){
        setSize(700,600);
        URL pad = Fruitautomaat.class.getResource("/img/");

        sound = getAudioClip(pad, "start.wav");

        for (int i = 0; i < afbeeldingen.length; i++) {
            afbeeldingen[i] = getImage(pad, "fruit_" + (i+1) + ".jpg");
        }



        punten4 = false;
        speel = new Button ("Speel");
        speel.addActionListener ( new SpeelknopListener());
        kopen = new Button ("Koop 10 krediet punten");
        kopen.addActionListener ( new KoopListener());
        kopen.setEnabled(false);
        add(speel);
        add(kopen);

    }

    public void paint (Graphics g){
        g.drawImage(afbeeldingen[afbeelding1], 20, 60, this);
        g.drawImage(afbeeldingen[afbeelding2], 120, 60, this);
        g.drawImage(afbeeldingen[afbeelding3], 220, 60, this);
        g.drawString("Krediet " + krediet    , 30, 300);
        if (punten4)
        {

            g.drawString("Gewonnen: 4 punten! "    , 40, 350);
            punten4 =false;
        }
        if (punten20)
        {

            g.drawString("Gewonnen: 20 punten! "    , 50, 400);
            punten20 =false;
        }

    }
    private class SpeelknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            afbeelding1 = (int)(Math.random() * 20);
            afbeelding2 = (int)(Math.random() * 20);
            afbeelding3 = (int)(Math.random() * 20);
            if (afbeelding1 == afbeelding2 || afbeelding2 == afbeelding3 || afbeelding1 == afbeelding3) {
                krediet+=4;
                punten4 =true;
                sound.play();

            }
            if (afbeelding1 == afbeelding2 && afbeelding2 == afbeelding3) {
                krediet+=20;
                punten20 =true;
                sound.play();
            }
            if (krediet == 0) {
                speel.setEnabled(false);
                kopen.setEnabled(true);
            }
            else {krediet--;}

            repaint();


        }
    }

    private class KoopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            krediet = krediet + 10;
            speel.setEnabled(true);
            kopen.setEnabled(false);


            repaint();




        }
    }
}