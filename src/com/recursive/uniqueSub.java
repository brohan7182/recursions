package com.recursive;

import java.util.HashSet;

public class uniqueSub {
    public static void unSub(String str, int indx, String newString, HashSet<String>allSubseq){
        if (indx==str.length()){
            if(allSubseq.contains(newString)){
                return;
            }else {
                System.out.println(newString);
                allSubseq.add(newString);
                return;
            }
        }
        unSub(str,indx+1,newString+str.charAt(indx),allSubseq);
        unSub(str,indx+1,newString,allSubseq);
    }

    public static void main(String[] args) {
        String str="abc";
        HashSet<String>allSub = new HashSet<>();
        unSub(str,0,"",allSub);
    }
}
