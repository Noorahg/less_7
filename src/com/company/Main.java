package com.company;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(contains(8,8,90,65,34,65));
    }
    static boolean contains(int a,int ... varargs){
        for (int i=0;i< varargs.length;i++){
        if(a==varargs[i]){
            return true;
        }else {
            return false;
        }

    }
        return false;
    }
}






