package com.company;
public class quicksort {
    public static void qsort(int[] a)
    {
        qsort(a,0,a.length-1);
    }
    public static char issorted(int[] a)
    {
        char flag = 'Y';
        for (int i = 0;i<a.length-1;i++)
        {
            if (a[i]>a[i+1])
            {
                flag = 'N';
                break;
            }

        }
        return flag;
    }
    private static int partition(int[] a,int lo,int hi)
    {
        int i = lo;
        int j = hi+1;
        int p = a[lo];
        while(i!= j)
        {
            while(a[++i]<a[lo])
                if(i==hi)
                    break;
            while(a[--j]>a[lo])
            {
                if(j==lo)
                    break;
            }
            if(i>=j)
                break;
            swap(a,i,j);

        }
        swap(a,lo,j);
        return j;
    }
    private static void swap(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    private static void qsort(int[] a,int lo,int hi) {
        if (hi <= lo) return; //list is empty
        int j = partition(a, lo, hi);
        qsort(a, lo, j - 1);
        qsort(a, j + 1, hi);
    }
}
