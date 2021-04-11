    import java.io.File;
    import java.io.FileNotFoundException;
    import java.util.ArrayList;
    import java.util.Scanner;
    import java.awt.Color;
//    import static StdDraw.*;
// comment to update
    
public class Solver {
    static final int X_MAX = 1200;
    static final int X_GRID = 120;
    static final int Y_MAX = 800;
    static final int Y_GRID = 40;
    static final int X_STEP = 1;
    static final int X_ONE_PI = 120;
    static final int Y_SPREAD = 300;
    
    static int draw_coordine()
    {
       int retval = 0;
       int i;
       Color save_color = StdDraw.getPenColor();
       
       StdDraw.setCanvasSize(X_MAX, Y_MAX);
       // rescale the coordinate system
       StdDraw.setXscale(-1 * X_MAX, X_MAX);
       StdDraw.setYscale(-1 * Y_MAX, Y_MAX);
       
       //StdDraw.setPenColor(StdDraw.BLUE);
       StdDraw.setPenRadius(0.002);

       for(i=-1*X_MAX;i<X_MAX;i=i+X_GRID)
       {
           StdDraw.line(i,-1 * Y_MAX,i,Y_MAX);
       }
       
       for(i=-1*Y_MAX;i<Y_MAX;i=i+Y_GRID)
       {
           StdDraw.line(-1 * X_MAX,i,X_MAX,i);
       }        
       
       StdDraw.setPenRadius(0.01);
       //StdDraw.setPenColor(StdDraw.DARK_GRAY);
       StdDraw.line(-1 * X_MAX,0,X_MAX,0);
       StdDraw.line(0,-1 * Y_MAX,0,Y_MAX);
       
       StdDraw.setPenRadius(0.002);
       StdDraw.setPenColor(save_color);
             
       return retval;
    }
    
    static int draw_coordine1(int draw_size, int max)
    {
       int retval = 0;
       int i;
       Color save_color = StdDraw.getPenColor();
       
       StdDraw.setCanvasSize(draw_size, max);
       // rescale the coordinate system
       StdDraw.setXscale(-1 * draw_size, draw_size);
       StdDraw.setYscale(-1 * max, max);
       
       //StdDraw.setPenColor(StdDraw.BLUE);
       StdDraw.setPenRadius(0.002);

       for(i=-1*draw_size;i<draw_size;i=i+X_GRID)
       {
           StdDraw.line(i,-1 * max,i,max);
       }
       
       for(i=-1*max;i<max;i=i+Y_GRID)
       {
           StdDraw.line(-1 * draw_size,i,draw_size,i);
       }        
       
       StdDraw.setPenRadius(0.01);
       //StdDraw.setPenColor(StdDraw.DARK_GRAY);
       StdDraw.line(-1 * draw_size,0,draw_size,0);
       StdDraw.line(0,-1 * max,0,max);
       
       StdDraw.setPenRadius(0.002);
       StdDraw.setPenColor(save_color);
             
       return retval;
    }

    private static int draw_sin()
    {
       int retval = 0;
       double y0,y1; 
       int i;
       
       StdDraw.setPenColor(StdDraw.BLACK);
       y0 = Y_SPREAD * Math.sin(-1*X_MAX*Math.PI/X_ONE_PI);
       for(i=-1*X_MAX+X_STEP;i<X_MAX;i=i+X_STEP)
       {
           double angle = Math.PI * i /X_ONE_PI;
           y1 = Y_SPREAD * Math.sin(angle);
           StdDraw.line(i-X_STEP,y0,i,y1);
           y0 = y1;
       }        
        
        return retval;
    }

    private static int draw_cos()
    {
       int retval = 0;
       double y0,y1; 
       int i;
       
       StdDraw.setPenColor(StdDraw.ORANGE);
       y0 = Y_SPREAD * Math.cos(-1*X_MAX*Math.PI/X_ONE_PI);
       for(i=-1*X_MAX+X_STEP;i<X_MAX;i=i+X_STEP)
       {
           double angle = Math.PI * i /X_ONE_PI;
           y1 = Y_SPREAD * Math.cos(angle);
           StdDraw.line(i-X_STEP,y0,i,y1);
           y0 = y1;
       }    
        
        return retval;
    }    

    private static double[][] create_sin()
    {
       double y; 
       int i,j;
       double[][] new_array = new double[2*X_MAX/X_STEP + 1][2];
       
       j = 0;
       
       for(i=-1*X_MAX;i<=X_MAX;i=i+X_STEP)
       {
           double angle = Math.PI * i /X_ONE_PI;
           y = Y_SPREAD * Math.sin(angle);
           new_array[j][0] = i;  //x
           new_array[j][1] = y; //y
           ++j;
       }        
        
       return new_array;
    }    

    private static double[][] create_cos()
    {
       double y; 
       int i,j;
       double[][] new_array = new double[2*X_MAX/X_STEP + 1][2];
       
       j = 0;
       
       for(i=-1*X_MAX;i<=X_MAX;i=i+X_STEP)
       {
           double angle = Math.PI * i /X_ONE_PI;
           y = Y_SPREAD * Math.cos(angle);
           new_array[j][0] = i;  //x
           new_array[j][1] = y; //y
           ++j;
       }        
        
       return new_array;
    }   
    
    // input array must have 2 coloum and arr.length(must >1) row
    private static int draw_array(final double[][] arr)
    {
        int retval = 0;
        int i;
        
        for(i=0;i<(arr.length-1);i++)
        {
            StdDraw.line(arr[i][0],arr[i][1],arr[i+1][0],arr[i+1][1]);
            //System.out.println("drawing;"+i+"["+arr[i][0]+","+arr[i][1]+","+arr[i+1][0]+","+arr[i+1][1]+"]\n");
        }
        
        return retval;
    }
 
   
    static int draw_1d_array(final int[] arr, int max)
    {
        int retval = 0;
        int i;
        //int draw_size = arr.length > (2*X_MAX)? 2*X_MAX:arr.length;
        int draw_size = arr.length;
        int ymax = max;
        int propertion = X_MAX / draw_size;
        
        draw_coordine();
        //draw_coordine1(draw_size, ymax);
        //System.out.println("propertion is:" + propertion);

        for(i=0;i<draw_size-1;i++)
        {
            if((arr[i]<ymax)&&(arr[i]>(-1*ymax)))
            {
                StdDraw.line(propertion*(i-draw_size/2),arr[i],propertion*(i+1-draw_size/2),arr[i+1]);
            }
        }
        
        return retval;
    }
    

    public static void main(String[] args){
       //int i;
       //double y0,y1;
       System.out.println("Solver main is running.");
       StdDraw.setPenColor(StdDraw.RED);  
       
       draw_coordine();     
       //draw_sin();
       //draw_cos();
       
       //draw_array(create_cos());
     }
}