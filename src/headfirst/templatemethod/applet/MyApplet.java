package headfirst.templatemethod.applet;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
	private static final long serialVersionUID = 1L;
    private String message;
 
    public void init() {
        message = "みなさんこんにちは、私は生きています！";
        repaint();
    }
 
    public void start() {
        message = "現在私は起動中です...";
        repaint();
    }
 
    public void stop() {
        message = "あー、現在私は停止中です...";
        repaint();
    }
 
    public void destroy() {
        message = "残酷な世界よ、さようなら";
        repaint();
    }
 
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}

