import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Write a description of class PostarFinal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class FinalPoster
{
    public static void main(String[] args) throws Exception{
        Picture ninja = new Picture("images//noahlatakascodingninja.jpg");
        //mirrorVertical(ninja,500);
        mirrorHorizontal(ninja,500);

        ninja.explore();
    }
    
    public static void mirrorVertical(Picture source, int height){
        int width = source.getWidth();
        int mirrorPoint = width/2;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int h = height;
        for (int y=0; y<h;y++){
            for ( int x = 0; x<mirrorPoint; x++){
                leftPixel=source.getPixel(x,y);
                rightPixel=source.getPixel(width-1-x,y);
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }
    
    public static void mirrorHorizontal(Picture source, int width){
        int height = source.getHeight();
        int mirrorPoint = height/2;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int w = width;
        for (int y=0; y<w;y++){
            for ( int x = 0; x<mirrorPoint; x++){
                leftPixel=source.getPixel(x,y);
                rightPixel=source.getPixel(width-1-x,y);
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }
    
    public static void greyScale(Picture source){
        Color grey = new Color(100,250,200);
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        public (int n){
            
        }
        
        
    }
    
}
