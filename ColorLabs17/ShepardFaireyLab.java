
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class ShepardFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        String fileName = FileChooser.pickAFile();
        Picture me = new Picture("images/beach.jpg");
        
        me.explore();

        Pixel[] pixels = me.getPixels();
        Color darkBlue = new Color(0, 0, 139);
        Color redColor = new Color(180, 0, 0);
        Color lightBlue = new Color(173, 216, 230);
        Color cream = new Color(248, 240, 227);

        int g1 = 255 / 4;        
        int g2 = 255 / 2;        
        int g3 = (255 * 3) / 4; 
        for (Pixel p : pixels) {
            int r = p.getRed();
            int g = p.getGreen();
            int b = p.getBlue();
            int avg = (r + g + b) / 3;
            p.setRed(avg);
            p.setGreen(avg);
            p.setBlue(avg);
        } 
        for (Pixel p : pixels) {
            int brightness = p.getRed();

            if (brightness < g1) {
                p.setColor(darkBlue);
            } else if (brightness < g2) {
                p.setColor(redColor);
            } else if (brightness < g3) {
                p.setColor(lightBlue);
            } else {
                p.setColor(cream);
            }
        }
        me.explore();    
    /**
          * method 1 change
          * 
          */
         /*
         String fileName = FileChooser.pickAFile();
        Picture me = new Picture("images/beach.jpg");
        me.explore();
        
        Pixel[] pixels = me.getPixels();
        Color darkBlue = new Color(0, 0, 139);
        Color redColor = new Color(180, 0, 0);
        Color lightBlue = new Color(173, 216, 230);
        Color cream = new Color(248, 240, 227);
        
        int s = 255;
        int b = 0;
        double interval = (b - s) / 4.0;
        double g1 = s + interval;
        double g2 = s + 2 * interval;
        double g3 = s + 3 * interval;
        for (Pixel p : pixels) {
            int avg = (p.getRed() + p.getGreen() + p.getBlue()) / 3;
            p.setRed(avg);
            p.setGreen(avg);
            p.setBlue(avg);
            if (avg < s) s = avg;
            if (avg > b) b = avg;
        }
        for (Pixel p : pixels) {
            int brightness = p.getRed();
            if (brightness < g1) {
                p.setColor(darkBlue);
            } else if (brightness < g2) {
                p.setColor(redColor);
            } else if (brightness < g3) {
                p.setColor(lightBlue);
            } else {
                p.setColor(cream);
            }
        }
        
        me.explore();

         /**
          * method 2 change
          * 
        */
       /*
       String fileName = FileChooser.pickAFile();
        Picture me = new Picture("images/beach.jpg");
        me.explore();
        
        Pixel[] pixels = me.getPixels();
        Color lightGreen = new Color(208,240,192);
        Color green = new Color(178,236,93);
        Color blue = new Color(96,130,182);
        Color grey = new Color(74,100,108);
        Color black = new Color(42,52,57);
        
        int g1 = 255 / 5;
        int g2 = (255 * 2) / 5;
        int g3 = (255 * 3) / 5;
        int g4 = (255 * 4) / 5;
        
        for (Pixel p : pixels) {
            int r = p.getRed();
            int g = p.getGreen();
            int b = p.getBlue();
            int avg = (r + g + b) / 3;
            p.setRed(avg);
            p.setGreen(avg);
            p.setBlue(avg);
        } 
        
        for (Pixel p : pixels) {
            int brightness = p.getRed();
        
            if (brightness < g1) {
                p.setColor(lightGreen);
            } else if (brightness < g2) {
                p.setColor(green);
            } else if (brightness < g3) {
                p.setColor(blue);
            } else if (brightness < g4) {
                p.setColor(grey);
            } else {
                p.setColor(black);
            }
        }
        
        me.explore();
 

         /**
          * custom color palette
          */

    
}//class
}

