package com.recursive;

public class movex{
    public static void moveAllx(String str,int indx, int count,String  newString){
        if (indx==str.length()){
            for (int i=0;i<=count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(indx);
        if (currChar=='x'){
            count++;
            moveAllx(str,indx+1,count,newString);
        }
        else {
            newString+=currChar;
            moveAllx(str,indx+1,count,newString);
        }
    }

    public static void main(String[] args) {
        String str="aacxxxxdebxd";
        moveAllx(str,0,1,"");
    }
    }

