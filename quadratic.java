package com.basicjava3;
public class quadratic {
    public static void main(String[] args) {


        int a = 4, b = 20, c =25 ;
        double delta = (b * b) - (4 * a * c);
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (b + Math.sqrt(delta)) / (2 * a);
        System.out.println("first root is "+root1);
        System.out.println("second root is "+root2);

    }
}
