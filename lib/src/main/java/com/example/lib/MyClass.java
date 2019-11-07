package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static  void main(String[] args){

        //java.util.Scanner scanner= new java.util.Scanner(System.in);
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入出生年月日(以空白鍵分開)：");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        System.out.println("您是在"+num1+"年"+num2+"月"+num3+"日出生" );




    }
}
