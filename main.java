
import java.util.Scanner;

class Main {
    //static final int X_MAX = 1200;
    //static final int X_GRID = 120;
    //static final int Y_MAX = 800;
    public static void main(String[] args){
        //int input_number;
        Scanner scaner = new Scanner(System.in); 

        System.out.println("hello, testing");
        
        Sort_base my_sort = Utils.chooseSort();

        int[] ran_array = Rand_number.gen_rand(30, 500);
        //Rand_number.print_rand(ran_array);

        //Rand_number.print_rand(Rand_number.gen_rand(10, 20));

        Solver.draw_1d_array(ran_array,500);
        System.out.println("Using sort method:"+my_sort.name()); 

        System.out.println("Press any key to continue:"); 
        String s = scaner.nextLine();

        my_sort.sort(ran_array);

        Solver.draw_1d_array(ran_array,500);

        //StdDraw.setCanvasSize(1024, 800);
        // rescale the coordinate system
        //StdDraw.setXscale(-1 * 1024, 1024);
        //StdDraw.setYscale(-1 * 800, 800);
        //StdDraw.setPenRadius(0.02);
        //StdDraw.setPenColor(StdDraw.RED);  
        //StdDraw.line(1,-1 * Y_MAX,1,Y_MAX);
        //Solver.draw_coordine();    

        // generate some random data
        // print data out
        // draw data out

        // feed data to sort()

        // draw data again
        // you compare with the drawing
        scaner.close();
    }
}