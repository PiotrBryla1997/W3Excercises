package com.company;

public class Maths {

    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int divide(int a, int b){
        int divide = a / b;
        return divide;
    }

    public static int equationA(){
        return -5 + 8 * 6;
    }

    public static int equationB(){
        return (55+9) % 9;
    }

    public static int equationC(){
        return 20 + -3*5 / 8;
    }

    public static int equationD(){
        return 5 + 15 / 3 * 2 - 8 % 3;
    }

    public static int multiplication(int a, int b){
        int multiplication = a * b;
        return multiplication;
    }

    public static void addMultiplySubstractDivide(int a, int b){
        System.out.println("result of addition");
        System.out.println(a+b);
        System.out.println("result of multiplying");
        System.out.println(a*b);
        System.out.println("result of substraction");
        System.out.println(a-b);
        System.out.println("result of divide");
        System.out.println(a/b);
        System.out.println("result of modulus");
        System.out.println(a%b);
    }

    public static void multiplicationTable(int a){
        for(int i = 1; i<11;i++){
            System.out.println(a*i);
        }
    }

    public static void javaPattern(){
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    public static double equationE(){
        double x =((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        return x;
    }

    public static double equationF(){
        double x = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        return x;
    }

}
