
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
        
         //opens selfie picture 
          /**/
         String fileName = FileChooser.pickAFile();
         Picture pictObj = new Picture(fileName);
         pictObj.explore();
         
         //relative path
         Picture apic = new Picture("images\\beach.jpg");
         //change with selfie picture
         Picture me = new Picture("images/beach.jpg");
         Picture me1 = new Picture("images/beach.jpg");
         Picture me2 = new Picture("images/beach.jpg");
         me.explore();
         int red, green, blue;
         int avg;
         Pixel[] pixels;
         pixels = me.getPixels();
         Color newColor;
         int group1=(255)/4;
        int group2=(2*225)/4;
        int group3=(3*225)/4;
        for (Pixel spot : pixels){
             red=spot.getRed();
             green=spot.getGreen();
             blue=spot.getBlue();
              avg=(red+green+blue)/3;
            spot.setRed(avg);
            spot.setGreen(avg);
            spot.setBlue(avg);
        }//main     
        for (Pixel spot : pixels){
             if (avg <group1){
                     red = 0;
                     green = 0;
                     blue = 139;
                 }
                 else if (avg <group2){
                     red = 255;
                     green = 0;
                     blue = 0;
                 }
                 else if (avg <group3){
                     red = 173;
                     green = 216;
                     blue = 230;
                    }
                else {
                    red = 248;
                     green = 240;
                     blue = 227;
                }
             newColor = new Color(red, green, blue);
             spot.setColor(newColor);
    
        }
    me.explore();          
    /**
          * method 1 change
          * 
          */
         
         /**
          * method 2 change
          * 
          */
         
         /**
          * custom color palette
          */

    
}//class
}
