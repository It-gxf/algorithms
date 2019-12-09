package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueen {
    private final static int n=4;
    private static int[] queen=new int [n+1];

    static boolean place(int j){
        for(int i=0;i<j;i++){
            if(queen[i]==queen[j]||Math.abs(queen[i]-queen[j])==Math.abs(i-j)){
                return false;
            }
        }
        return true;
    }
    static void queen(int j){
        if(j>n){
            for(int i=1;i<queen.length;i++){
                System.out.print(queen[i]);
            }
            System.out.println();
        }else {
            for(int i=1;i<=n;i++){
                queen[j]=i;
                if(place(j)){
                    queen(j+1);
                }
            }
        }
    }
    public static void main(String args []){
        queen(1);
    }

}
