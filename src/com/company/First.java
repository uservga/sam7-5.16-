package com.company;

public class First {
    public static void main(String[] args) {
        int a = (int)(Math.random()*41-20);
        if(a<0){
            System.out.println(Math.abs(a));
        }else{
            System.out.println(a);
        }
    }
}