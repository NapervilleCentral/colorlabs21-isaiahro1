
/**
 * Changes the colors of a jpg picture
 * 
 * Isaiah Ro
 * 11/16/25
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
        Picture me = new Picture("images/IMG_6643.jpg");
        
        //me.explore();

        Picture m1 = new Picture(me);
        Pixel[] pixels = m1.getPixels();
        
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
        //m1.explore();    
        //m1.write("images/SFregular.jpg");

    
         
         
         Picture m2= new Picture(me);
         pixels=m2.getPixels();
                
         darkBlue = new Color(0, 0, 139);
         redColor = new Color(180, 0, 0);
         lightBlue = new Color(173, 216, 230);
         cream = new Color(248, 240, 227);
         Color mBlue = new Color(153,0,0);
        
        int s = 255;
        int b = 0;
        for (Pixel p : pixels) {
            int avg = (p.getRed() + p.getGreen() + p.getBlue()) / 3;
            p.setRed(avg);
            p.setGreen(avg);
            p.setBlue(avg);
            if (avg < s) s = avg;
            if (avg > b) b = avg;
        }
        double interval = (b - s) / 5.0;
        double g11 = s + interval;
        double g22 = s + 2 * interval;
        double g33 = s + 3 * interval;
        double g44 = s + 4 * interval;
        
        for (Pixel p : pixels) {
            int brightness = p.getRed();
            if (brightness < g11) {
                p.setColor(darkBlue);
            } else if (brightness < g22) {
                p.setColor(redColor);
            } else if (brightness < g33) {
                p.setColor(mBlue);
            } else if (brightness < g44) {
                p.setColor(cream);
            } else {
                p.setColor(lightBlue);
            }
        }
        
        //m2.explore();
        //m2.write("images/SFinterval.jpg");
        Picture m3 = new Picture(me);
        pixels = m3.getPixels();
        
        Color c1 = new Color(92, 75, 81);
        Color c2 = new Color(243, 181, 98);
        Color c3 = new Color(183, 177, 145);
        Color c4 = new Color(252, 213, 167);
        Color c5 = new Color(248, 197, 133);
        int s1 = 255; 
        int b2 = 0;   
        
        for (Pixel p : pixels) {
            int r = p.getRed();
            int g = p.getGreen();
            int bl = p.getBlue();
            int avg = (r + g + bl) / 3;
            p.setRed(avg);
            p.setGreen(avg);
            p.setBlue(avg);
        
            if (avg < s) s = avg;
            if (avg > b) b = avg;
        }
        
        // Compute the 5 intervals
        double interval1 = (b - s) / 5.0;
        double g111 = s + interval;
        double g222 = s + 2 * interval;
        double g333 = s + 3 * interval;
        double g444 = s + 4 * interval;
        
        // Recolor based on intervals
        for (Pixel p : pixels) {
            int brightness = p.getRed();
        
            if (brightness < g111) p.setColor(c1); //STAY
            else if (brightness < g222) 
                p.setColor(c3);
            else if (brightness < g333) 
                p.setColor(c4); //STAY
            else if (brightness < g444) 
                p.setColor(c2);
            else 
                p.setColor(c5);
        }
        
        m3.explore();

        m3.write("images/SFmyFinal.jpg");

    
    /**/
        
}//class
}

