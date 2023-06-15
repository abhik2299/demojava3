package com.basicjava3;

public class maxmin {
    public static void main(String[] args) {
        int a=9,b=5,c=8;
        int x=a+(b*c);
        int y=c+(a/b);
        int z=(a%b)+c;
        int n= (a*b)+c;
        int max=Math.max(Math.max(x,y),Math.max(z,n));
        int min=Math.min(Math.min(x,y),Math.min(z,n));
        System.out.println("the maximum is"+ max);
        System.out.println("the minimum is"+ min);
    }
}
