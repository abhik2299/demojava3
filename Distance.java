package com.basicjava3;

public class Distance {
    public static void main(String[] args) {
        if (args.length <2) {
            System.out.println("Please provide two command-line arguments:co-ordinates x and y ");
            return;
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        double distance=Math.sqrt((x*x)+(y*y));
        System.out.println("the distance from origin is "+distance);
    }
}
