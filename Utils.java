
import java.util.Scanner;

public class Utils {
    public static void exchange(int[] arr, int i, int j) 
    {
        int n = arr.length;

        if((i >= n) || (j >= n) )
            return;

        if(i!=j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return;
    }

    public static Sort_base chooseSort()
    {
        int a;
        Scanner in = new Scanner(System.in); 
        
        Sort_base quick = new Quick_sort();
        Sort_base selection = new Select_sort();
        Sort_base buble = new Bubble_sort(); 
        Sort_base test_sort = new Test_sort();
        Sort_base result;


        System.out.println("Please choose your sort algorithm:");
        System.out.println(" 1. " + quick.name());
        System.out.println(" 2. " + selection.name());
        System.out.println(" 3. " + buble.name());
        System.out.println(" 4. " + test_sort.name());
        
        System.out.println("Enter your chose(a integer number):");  
        a = in.nextInt(); 
        if(a==1)
        {
            result = quick;
        }
        else if(a==2)
        {
            result = selection;
        }
        else if(a==3)
        {
            result = buble;
        }
        else if(a==4)
        {
            result = test_sort;            
        }
        else
        {
          System.out.println("You enter: " + a + ", which is not a valid chose");
          return null;
        }
        
        System.out.println("You choose: " + result.name());
        return result;

    }
}


