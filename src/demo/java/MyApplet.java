package demo.java;
import java.applet.*;
import java.awt.*;

public class MyApplet extends Applet {

    public void paint(Graphics g){
        g.drawString("世界", 100,200);
        g.drawLine(50,50,100,100);
        g.draw3DRect(200,200,200,200,true);
    }
}
