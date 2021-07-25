package com.company;
import java.util.*;
public class Main {
    public static int[] randomArray(int size){
        int[] a = new int[size];
        for(int i = 0; i<a.length;i++){
            a[i] = (int)(Math.random()*10000);
        }
        return a;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        int[] a = randomArray(n);
        quicksort.qsort(a);
        char flag = quicksort.issorted(a);
        System.out.print(flag);
    }
}
