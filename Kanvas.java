import javax.swing.*;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;


public class Kanvas extends java.awt.Canvas {

    boolean gameRunning;
    private BufferStrategy strategy;



    public Kanvas(){
        boolean gameRunning = true;
        createBufferStrategy(2);
        strategy = getBufferStrategy();

    }


    public void gameLoop(){
        long lastLoopTime = System.currentTimeMillis();
        while(gameRunning){
            long time = System.currentTimeMillis() - lastLoopTime;
            lastLoopTime = System.currentTimeMillis();

            Graphics2D g = (Graphics2D) strategy.getDrawGraphics();

            g.drawString("boats and hoes", 100, 100);
        }



    }



}
