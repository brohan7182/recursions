package com.recursive;

public class xpn {
    public static int calcPower(int x,int n){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        int power_nm1 = calcPower(x,n-1);
        int power_num = x * power_nm1;
        return power_num;
    }

    public static void main(String[] args) {
        int x=2,n=5;
        int ans=calcPower(x,n);
        System.out.println(ans);
    }
}
