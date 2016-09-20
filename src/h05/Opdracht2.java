package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {
    int Valerie = 40;
    int Jeroen =  100;
    int Hans   =  80;
    int breedtescherm;
    int hoogtescherm;
    int margeH;
    int margeV;
    int hoogteYas;
    int maxGewicht = 140;
    int aantalstrepeen = 7;
    int breedtestaaf;
    int T;// T is margin van waar getalen komen,,


    public void init(){
        breedtescherm = 500;
        hoogtescherm =  400;
        margeH = breedtescherm / 10;
        margeV = hoogtescherm  / 10;
        hoogteYas= hoogtescherm-margeH*2;
        breedtestaaf = margeH;
        T            = 20;
    }



    public void paint(Graphics g) {
        // teken de x as, marge=10%
        int x = margeH;
        int y =  hoogtescherm-margeV;
        int x2 = breedtescherm  - margeH;
        int y2 = y;
        g.drawLine(x,y,x2,y2);
        // teken de y-as
        y2 = margeV;
        x2 = x;
        g.drawLine(x,y,x2,y2);
        // teken schaalstreepjes op y as
        int breedtedstreep = 5;
        x-= breedtedstreep;
        int gewichtstap=maxGewicht/7;
        int gewichty=0;
        g.drawLine(x,y,x+breedtedstreep,y);
        g.drawString(""+gewichty,x-T,y);
        y -= hoogteYas/aantalstrepeen;
        g.drawLine(x,y,x+breedtedstreep,y);
        gewichty+=gewichtstap;
        g.drawString(""+gewichty,x-T,y);
        y -= hoogteYas/aantalstrepeen;
        g.drawLine(x,y,x+breedtedstreep,y);
        gewichty+=gewichtstap;
        g.drawString(""+gewichty,x-T,y);
        y -= hoogteYas/aantalstrepeen;
        g.drawLine(x,y,x+breedtedstreep,y);
        gewichty+=gewichtstap;
        g.drawString(""+gewichty,x-T,y);
        y -= hoogteYas/aantalstrepeen;
        g.drawLine(x,y,x+breedtedstreep,y);
        gewichty+=gewichtstap;
        g.drawString(""+gewichty,x-T,y);
        y -= hoogteYas/aantalstrepeen;
        g.drawLine(x,y,x+breedtedstreep,y);
        gewichty+=gewichtstap;
        g.drawString(""+gewichty,x-T,y);
        y -= hoogteYas/aantalstrepeen;
        g.drawLine(x,y,x+breedtedstreep,y);
        gewichty+=gewichtstap;
        g.drawString(""+gewichty,x-T,y);
        //teken staaf Valerie
        x = margeH * 2;
        y = hoogtescherm - margeV;
        y -= (hoogteYas / maxGewicht) * Valerie;
        int height = (hoogteYas / maxGewicht) * Valerie;
        g.fillRect(x,y,breedtestaaf,height);
        // teken staaf jeroen

        x += margeH+ breedtestaaf;
        y = hoogtescherm - margeV;
        y -= (hoogteYas / maxGewicht) * Jeroen;
         height = (hoogteYas / maxGewicht) * Jeroen;
        g.fillRect(x,y,breedtestaaf,height);
        // teken staaf Hans
        x += margeH+ breedtestaaf;
        y = hoogtescherm - margeV;
        y -= (hoogteYas / maxGewicht) * Hans;
        height = (hoogteYas / maxGewicht) * Hans;
        g.fillRect(x,y,breedtestaaf,height);







    }


}
