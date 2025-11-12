
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      //opens picture using a dialog box
      /**/
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();
    
     Picture p1 = new Picture("images\\swan.jpg");
     Picture p2 = new Picture("images\\swan.jpg");
     Picture p3 = new Picture("images\\swan.jpg");
     Picture p4 = new Picture("images\\swan.jpg");
     Picture p5 = new Picture("images\\swan.jpg");
     Picture p6 = new Picture("images\\swan.jpg");
     p1.explore();
     
     int red, blue, green;
     int avg;
     Pixel[] Mpixels;
     Pixel[] Mpixels2;
     Pixel[] Mpixels3;
     Pixel[] Mpixels4;
     Pixel[] Mpixels5;
     Mpixels = p1.getPixels();
    Mpixels2 = p2.getPixels();
    Mpixels3 = p3.getPixels();
    Mpixels4 = p4.getPixels();
    Mpixels5 = p5.getPixels();

     //double one color
    for (Pixel spot : Mpixels){
        red = spot.getRed();
        red = (int)(red * 2);
        spot.setRed(red);
        }
     p1.explore();
     Color newColor;
     //negate
     for(Pixel spot1 : Mpixels4){
         red=spot1.getRed();
         green=spot1.getGreen();
         blue=spot1.getBlue();
         newColor = new Color(255-red, 255-green, 255-blue);
         spot1.setColor(newColor);
     }
     p4.explore();
     //grey scale
     for (Pixel spot2 : Mpixels){
         red=spot2.getRed();
         green=spot2.getGreen();
         blue=spot2.getBlue();
         avg=(int)(red+green+blue)/3;
         
         spot2.setRed(avg);
         spot2.setGreen(avg);
         spot2.setBlue(avg);
     }
        p1.explore();
    //lighten/darken
    for (Pixel spot3 : Mpixels2){
        red=spot3.getRed();
        green=spot3.getGreen();
        blue=spot3.getBlue();
        red=(int)(red+70);
        green=(int)(green+70);
        blue=(int)(blue+70);
        spot3.setRed(red);
        spot3.setGreen(green);
        spot3.setBlue(blue);
    }
        p2.explore();
        
        //change 3 colors
    for (Pixel spot4 : Mpixels3){
        red=spot4.getRed();
        green=spot4.getGreen();
        blue=spot4.getBlue();
        red=(green);
        green=(blue);
        blue=(green);
        spot4.setRed(red);
        spot4.setGreen(green);
        spot4.setBlue(blue);
        }
        p3.explore();
    for(Pixel spot5 : Mpixels5){
        red=spot5.getRed();
        green=spot5.getGreen();
        blue=spot5.getBlue();
        if (red >100 && green >100 && blue>85){
            red=(255);
            blue=(0);
            green=(0);
            spot5.setRed(red);
            spot5.setGreen(green);
            spot5.setBlue(blue);
        }
    }
    p5.explore();
     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     
     
     
     /*
     
     //KNOW THIS
     //relative path
     Picture apic = new Picture("images\\beach.jpg");
     Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     Picture moto = new Picture("images/redMotorcycle.jpg");
     Picture ferris3 = new Picture("images/2000 ferris wheel2.jpg");
     

     //apic.explore();
     ferris1.explore();
     moto.explore();
     //DISPLAYS PICTURE
     
     //makes an array of pixels
     Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     pixels = ferris1.getPixels();
     
     Pixel[] Mpixels;
     Mpixels = moto.getPixels();
    
     //how many pixels or how large array
    System.out.println("This is a large array"+pixels.length  );


    /*
        //access each index
    System.out.println(pixels[17]);
    //access each pixel
    Pixel spot = ferris1.getPixel(100,100);
    Pixel spot2 = ferris1.getPixel(433, 283);
    Pixel ferris17= pixels[17];
    
    ferris17.setRed(240);
    ferris17.setGreen(160);
    ferris17.setBlue(200);
    
    Color newColor = new Color(255, 99,71);
    spot2.setColor(Color.blue);
    
    spot.setColor(newColor);
    
    
    
    ferris1.explore();
    System.out.println(pixels[17].getColor());
    System.out.println(spot);
    
    for (int i = 0; i<10000;i++){
        Pixel yuck = ferris1.getPixel((int)(Math.random()*1000), (int)(Math.random()*668));
        yuck.setColor(Color.green);
    }
    ferris1.explore();
/*
    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(252,252,252));
    pixels[500034].setColor(Color.blue);

    ferris1.explore();
/*
   // loop to access indexes of array or collection

    //for each loop spot  is a ?
    int red;
    int blue, green;
    for (Pixel spot1 : Mpixels){
        //System.out.println( spot1 );
        red = spot1.getRed();
        
        red = (int)(red * 0.25);
        
        spot1.setRed(red);
        
}
moto.explore();

    for(Pixel spot1 : Mpixels){
        blue = spot1.getBlue();
        blue = (int)(blue*Math.random());
        spot1.setBlue(blue);
    }
    for(Pixel spot1 : Mpixels){
        green = spot1.getGreen();
        green = (int)(green*Math.random());
        spot1.setGreen(green);
    }
moto.explore();
   
 /**/

 /*
  * Method to clear red from picture
  * @param none
  * @return none
  */
 /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
           

        }
    ferris1.explore();
    
/*
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */

/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        

    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /*
    //write/save a picture as a file//this writes a copy of the pic!!!!RENAME PIC!!!!
    ferris1.write("images/SFTry1.jpg");

    /**/
  }//main
}//class
