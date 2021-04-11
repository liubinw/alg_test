public class Select_sort extends Sort_base{
    
    public int sort(int[] arr)
    {
        int retval = 0;
        int n = arr.length;

        for(int i=0; i<n-1; ++i)
        {
            int index = i;
            for(int j=i+1; j<n;++j)
            {
                if(arr[j] < arr[index])
                {
                    index = j;
                }
            }

            Utils.exchange(arr, i, index);
        }

        return retval;
    }

    public String name()
    {
        return "Select sort";
    }
}
