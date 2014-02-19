import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;


/**
 * Created by 3074007 on 2014-02-19.
 */
public class Kanvas extends Canvas {

    boolean gameRunning;
    BufferStrategy strategy;



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
            

        }



    }



}
