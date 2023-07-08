package com.bl.day9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance {

    private static DecimalFormat df1 = new DecimalFormat("#.##");

    Distance(double x, double y)
    {
        double val = (x*x)+(y*y);
        double Ed = Math.pow(val,0.5);
        System.out.println("Euclidean distance from the point (x,y) to (0,0) is "+df1.format(Ed));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Arguments as ( X , Y ) : ");

        double x = sc.nextInt();
        double y = sc.nextInt();

        new Distance(x, y);

        sc.close();
    }
}
