
import java.util.Random;


public class Rand_number {
    //private static int m_size = 2000;

    public Rand_number()
    {

    }

    public static int[] gen_rand(int i_size, int i_max)
    {
        Random r = new Random();
        int[] ran_num = new int[i_size];
        for(int i=0;i<i_size;++i)
        {
            ran_num[i] = r.nextInt()%i_max;
        }

        return ran_num;
    }

    public static void print_rand(int[] ran_array)
    {
        for(int i=0;i<ran_array.length;++i)
        {
            System.out.println("i["+i+":"+ran_array[i]);
        }

    }
    
}
