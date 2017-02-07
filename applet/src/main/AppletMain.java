package main;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class AppletMain extends Applet {

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Hello applet!", 50, 25);
    }
    
    @Override
    public void start() {
        System.out.println("Started");
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.gray);
        setVisible(true);
    }
    
    @Override
    public void stop() {
        System.out.println("stopped");
    }
}
