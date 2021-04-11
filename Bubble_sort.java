public class Bubble_sort extends Sort_base{
    public int sort(int[] arr)
    {
        int retval = 0;
        int n = arr.length;

        for(int i=0; i<n-1; ++i)
        {

            for(int j=0; j<n-i-1;++j)
            {
                if(arr[j] > arr[j+1])
                {
                    Utils.exchange(arr, j, j+1);
                }
            }

        }

        return retval;
    }

    public String name()
    {
        return "Bubble sort";
    }
}
