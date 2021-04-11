public class Test_sort extends Sort_base {
    public Test_sort() {}

    public int sort(int[] arr)
    {
        int retval = 0;
        int n = arr.length;

        for(int i=0; i<n; ++i)
        {
            arr[i] = arr[i]/2;
        }

        return retval;
    }

    public String name()
    {
        return "Test sort";
    }
}
