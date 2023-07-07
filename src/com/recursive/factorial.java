package com.recursive;

public class factorial {
    public static int fact(int n){
if (n==1||n==0){
    return 1;
}
int fact_nm1=fact(n-1);
int fact_num=n*fact_nm1;
return fact_num;
    }

    public static void main(String[] args) {
        int num =5;
        int sum = fact(num);
        System.out.println(sum);
    }
}
