package h11;


import java.applet.Applet;
import java.awt.*;

/**
 * Created by Burak Sen on 25-10-2016.
 */
public class Opdracht11o3 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int getal1=1,getal2=1,getal3=0;
        int x = 40;

        g.drawString("" + getal2, x, 80 );

        while(getal1 < 89) {
            x += 20;

            getal1 = getal3+getal2;
            getal3 = getal2;
            getal2 = getal1;

            g.drawString("" + getal1, x, 80 );

        }
    }
    }

