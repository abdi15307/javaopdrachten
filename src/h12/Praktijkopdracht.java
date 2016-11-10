package h12;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Eigenaar on 10-11-2016.
 */
public class Praktijkopdracht extends Applet
{

    Label labelNaam = new Label("Naam: ");
    Label labelNummer = new Label("Telefoonnummer: ");
    TextField invoerNaam = new TextField("", 15);
    TextField invoerNummer = new TextField("", 15);
    Button ok = new Button("OK");
    String[] stringNaam = new String[10];
    String[] stringNummer = new String[10];
    int teller = 0;

    public void init()
    {
        setSize(600, 200);
        add(labelNaam);
        add(invoerNaam);
        invoerNaam.addActionListener(new InputListener());
        add(labelNummer);
        add(invoerNummer);
        invoerNummer.addActionListener(new InputListener());
        add(ok);
        ok.addActionListener(new InputListener());
        for (int i = 0; i < stringNaam.length; i++)
        {
            stringNaam[i] = "";
            stringNummer[i] = "";
        }
    }

    public void paint(Graphics g)
    {
        int x = getWidth();
        int y = getHeight();

        for (int i = 0; i < stringNaam.length; i++)
        {
            if (teller == 10)
            {
                g.drawString(""+ stringNaam[i], x/2-100, (y/2-35*stringNaam.length/2)+35*i);
                g.drawString(""+ stringNummer[i], x/2-100, (y/2-35*stringNaam.length/2)+15+35*i);
            }
        }
    }

    class InputListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            teller++;
            stringNaam[(teller-1)] = "Naam: "+ invoerNaam.getText();
            stringNummer[(teller-1)] = "Telefoonnummer: "+ invoerNummer.getText();
            invoerNaam.setText("");
            invoerNummer.setText("");
            invoerNaam.requestFocus();
            repaint();
        }
    }
}
