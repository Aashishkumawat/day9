package com.bl.day9;

public class MaxOrMin {
    public static void main(String[] args) {
        int a = 8;
        int b = 16;
        int c = 2;
        int num1 = a+b*c;
        int num2 = a*b+c;
        int num3 = a%b+c;
        int num4 = a*b+c;
        if(num1>num2 && num1>num3 && num1>num4){
            System.out.println("num1 is Maximum number");
            if(num2>num1 && num2>num3 && num2>num4);
            System.out.println("num2 is Maximum number");
            if(num3>num1 && num3>num2 && num3>num4);
            System.out.println("num3 is Maximum number");
        }
        else{
            System.out.println("num4 is Maximum number");
        }
    }
}
