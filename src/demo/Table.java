package demo;

/**
 * Created by Eigenaar on 2-12-2016.
 */
import java.awt.*;
import java.applet.*;

public class Table extends Applet {
   int[] deck;
    String[] suits;
    String[] ranks;
    int x,y;

    public void init() {
        deck = new int[52];
        suits = new String[]{"Spades", "Hearts", "Diamonds", "Clubs"};
        ranks = new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        x = 50;
        y = 120;

        for (int i = 0; i < deck.length; i++) deck[i] = i;

        for (int i = 0; i < deck.length; i++) {

            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;


        }
    }


    public void paint(Graphics g) {
        x+=20;
        for( int i = 0; i < 2; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            g.drawString("Card number " + deck[i] + ": " + rank + " of " + suit,x,y);



        }
    }
}