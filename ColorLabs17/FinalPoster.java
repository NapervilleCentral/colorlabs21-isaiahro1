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
        Picture original   = new Picture("images//noahlatakascodingninja.jpg");
        Picture background = new Picture("images//background.jpg");

        int w = original.getWidth();
        int h = original.getHeight();

        int collageW = w * 3;
        int collageH = h * 2;

        Picture collage = new Picture(collageW, collageH);

        drawScaled(collage, background, 0, 0, collageW, collageH);
        drawOriginal(collage, original, 0, 0);
        drawGreyscale(collage, original, w, 0);
        drawColor(collage, original, w * 2,0);
        drawMirrorHorizontal(collage, original, 0,h);
        collage.write("finalcollage.jpg");
        collage.explore();
    }
    public static void drawScaled(Picture canvas, Picture source,int destX, int destY, int targetW, int targetH)
    {
        int srcW = source.getWidth();
        int srcH = source.getHeight();

        for (int x = 0; x < targetW; x++)
        {
            for (int y = 0; y < targetH; y++)
            {
                int srcX = Math.min((int)((double) x / targetW * srcW), srcW - 1);
                int srcY = Math.min((int)((double) y / targetH * srcH), srcH - 1);

                canvas.getPixel(destX + x, destY + y).setColor(source.getPixel(srcX, srcY).getColor());
            }
        }
    }
    
     public static void drawOriginal(Picture collage, Picture source,
                                    int destX, int destY)
    {
        for (int x = 0; x < source.getWidth(); x++)
            for (int y = 0; y < source.getHeight(); y++)
                collage.getPixel(destX + x, destY + y).setColor(source.getPixel(x, y).getColor());
    }

    public static void drawGreyscale(Picture collage, Picture source,int destX, int destY)
    {
        for (int x = 0; x < source.getWidth(); x++)
        {
            for (int y = 0; y < source.getHeight(); y++)
            {
                Pixel p = source.getPixel(x, y);
                int avg = (int)((p.getRed() + p.getGreen() + p.getBlue()) / 3.0);
                collage.getPixel(destX + x, destY + y).setColor(new Color(avg, avg, avg));
            }
        }
    }
    
    public static void drawColor(Picture collage, Picture source,int destX, int destY)
    {
        for (int x = 0; x < source.getWidth(); x++)
        {
            for (int y = 0; y < source.getHeight(); y++)
            {
                Pixel p = source.getPixel(x, y);
                int g =(int)((p.getRed() + p.getGreen() + p.getBlue()) / 3.0);
                int r, gr, b;
                if (g < 60)
                {
                    r  =(int)(g * 0.9);
                    gr =(int)(g * 0.8);
                    b  =(int)(g * 0.8);
                }
                else if (g < 190)
                {
                    r  =Math.min(255, (int)(g * 1.10));
                    gr =(int)(g * 0.90);
                    b  =(int)(g * 0.70);
                }
                else
                {
                    r  =Math.min(255,(int)(g * 1.08));
                    gr =Math.min(255,(int)(g * 1.00));
                    b  =(int)(g * 0.85);
                }

                collage.getPixel(destX + x, destY + y).setColor(new Color(r, gr, b));
            }
        }
    }
    
    public static void drawMirrorHorizontal(Picture collage, Picture source,int destX, int destY)
    {
        int width = source.getWidth();
        int height = source.getHeight();
        int mirrorPoint = height / 2;

        for (int x = 0; x < width; x++)
        {
            for (int y = 0; y < height; y++)
            {
                collage.getPixel(destX + x, destY + y) .setColor(source.getPixel(x, y).getColor());
                collage.getPixel(destX + x, destY + (height - 1 - y)).setColor(source.getPixel(x, y).getColor());            }
        }
    }
    
    

        
 }

