package com.recursive;

public class towerofHanoi {
    public static void hanoi(int n, String src,String helper,String dest){
     if (n==1){
         System.out.println("transferred disk " + n + " from " + src + " to " + dest);
         return;
     }
     hanoi(n-1,src,dest,helper);
        System.out.println("transferred disk " + n + " from " + src + " to " + dest);
        hanoi(n-1,helper,src,dest);

    }

    public static void main(String[] args) {
        int n=2;
        hanoi(n, "S","H","D");
    }
}
