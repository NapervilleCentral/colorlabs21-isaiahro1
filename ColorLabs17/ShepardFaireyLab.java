
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
         Pixel[] Mpixels;
         Mpixels = me.getPixels();
        for (Pixel spot : Mpixels){
             red=spot.getRed();
             green=spot.getGreen();
             blue=spot.getBlue();
             avg=(int)(red+green+blue)/3;
             
             
             spot.setRed(avg);
             spot.setGreen(avg);
             spot.setBlue(avg);
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

         
    }//main       
}//class
