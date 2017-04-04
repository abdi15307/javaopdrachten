package demo;

/**
 * Created by Eigenaar on 15-12-2016.
 */
import java.awt.*;
import java.applet.*;
import java.net.URL;

public class foto extends Applet {

    private Image afbeelding;
    private URL pad;
    private AudioClip sound;
    public void init() {
        pad = foto.class.getResource("/img/");
        afbeelding = getImage(pad, "marta.jpg");
        sound = getAudioClip(pad, "scream.wav");
    }

    public void paint(Graphics g) {
        g.drawImage(afbeelding, 80, 50, 400, 300, this);
        sound.play();
    }
}