package com.recursive;

public class xpnlog {
    public static int calPow(int x, int n){
      if (n==0){
          return 1;
      }
      if (n%2==0){
          return calPow(x,n/2)*calPow(x,n/2);
      }
      else {
          return calPow(x,n/2)*calPow(x,n/2)*x;
      }
    }

    public static void main(String[] args) {
        int x=2,n=5;
        int ans = calPow(x,n);
        System.out.println(ans);
    }
}
