package com.recursive;

public class subsequence {
    public static void sub(String str,int indx,String newString){
      if (indx==str.length()){
          System.out.println(newString);
          return;
      }
      char currChar=str.charAt(indx);
      sub(str,indx+1,newString+currChar);
      sub(str,indx+1,newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        sub(str,0,"");
    }
}
