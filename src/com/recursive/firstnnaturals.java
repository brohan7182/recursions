package com.recursive;

public class firstnnaturals {
    public static void printNumbers(int i, int n, int sum){
     if (i==n){
         sum+=i;
         System.out.println(sum);
         return;
     }
     sum+=i;
     printNumbers(i+1,n,sum);

    }

    public static void main(String[] args) {
        printNumbers(1,5,0);
    }
}
