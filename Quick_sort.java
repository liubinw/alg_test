public class Quick_sort extends Sort_base{


    private int partition(int arra[], int low, int high)
    {

        // choose the right most element as pivot
        int pivot = arra[high];

        // pointer for greater element
        int i = (low -1);

        // traverse through all elements
        // compare each element with pivot
        for(int j= low; j<high; ++j){
            if(arra[j] <= pivot)
            {
                i++;

                // do swap the elements
                Utils.exchange(arra, i, j);
            }
        }

        // swap the pivot element with the greater element
        Utils.exchange(arra, i+1, high);     

        // return the position from where partition is done
        return (i+1);
    }

    private void do_sort(int arra[], int low, int high)
    {
        if(low < high)
        {
            int pi = partition(arra, low, high);

            // left hand side sort
            do_sort(arra,low, pi-1);

            // right hand side sort
            do_sort(arra, pi+1, high);
        }
    }


    public int sort(int[] arr)
    {
        int retval = 0;

        do_sort(arr, 0, arr.length-1);

        return retval;
    }

    public String name()
    {
        return "Quick sort";
    }
}
