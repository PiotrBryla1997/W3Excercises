package com.company;

import static java.lang.Math.*;

public class Maths {

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int divide(int a, int b) {
        int divide = a / b;
        return divide;
    }

    public static int equationA() {
        return -5 + 8 * 6;
    }

    public static int equationB() {
        return (55 + 9) % 9;
    }

    public static int equationC() {
        return 20 + -3 * 5 / 8;
    }

    public static int equationD() {
        return 5 + 15 / 3 * 2 - 8 % 3;
    }

    public static int multiplication(int a, int b) {
        int multiplication = a * b;
        return multiplication;
    }

    public static void addMultiplySubstractDivide(int a, int b) {
        System.out.println("result of addition");
        System.out.println(a + b);
        System.out.println("result of multiplying");
        System.out.println(a * b);
        System.out.println("result of substraction");
        System.out.println(a - b);
        System.out.println("result of divide");
        System.out.println(a / b);
        System.out.println("result of modulus");
        System.out.println(a % b);
    }

    public static void multiplicationTable(int a) {
        for (int i = 1; i < 11; i++) {
            System.out.println(a * i);
        }
    }

    public static void javaPattern() {
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    public static double equationE() {
        double x = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        return x;
    }

    public static double equationF() {
        double x = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        return x;
    }

    public static void perimeterAndAreaOfCircle(double radius) {
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println(perimeter);
        System.out.println(area);
    }

    public static double averageOfThreeNumbers(double a, double b, double c) {
        double average = (a + b + c) / 3;
        return average;
    }

    public static void areaAndPerimeterOfRectangle(double width, double height) {
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.println(area);
        System.out.println(perimeter);
    }

    public static void americanFlag() {
        System.out.println("* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================");
    }

    public static void variablesSwap(int a, int b) {
        System.out.println("Variable a was equal to: " + a);
        System.out.println("Variable b was equal to: " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Variable a now equals: " + a);
        System.out.println("Variable b now equals: " + b);
    }

    public static void face() {
        System.out.println(" +\"\"\"\"\"+                                                 \n" +
                "[| o o |]                                                \n" +
                " |  ^  |                                                 \n" +
                " | '-' |                                                 \n" +
                " +-----+");
    }

    public static void addTwoBinaryNumbers(int a, int b) {
        int sum = a + b;
        System.out.println(Integer.toBinaryString(sum));
    }

    public static void multiplyTwoBinaryNumbers(int a, int b) {
        int multiply = a * b;
        System.out.println(Integer.toBinaryString(multiply));
    }

    public static void decimalNumberToBinaryNumber(int a) {
        System.out.println(Integer.toBinaryString(a));
    }


    public static void decimalNumberToHexadecimalNumber(int a) {
        System.out.println(Integer.toHexString(a));
    }

    public static void decimalNumberToOctalNumber(int a) {
        System.out.println(Integer.toOctalString(a));
    }

    public static int binaryNumberToDecimalNumber(String a) {
        int decimal = Integer.parseInt(a, 2);
        return decimal;
    }

    public static void binaryNumberToHexadecimalNumber(String a) {
        System.out.println(Integer.toHexString(Integer.parseInt(a, 2)));
    }

    public static void binaryNumberToOctalNumber(String a){
        System.out.println(Integer.toOctalString(Integer.parseInt(a, 2)));
    }

    public static void octalNumberToDecimalNumber(String a) {
        System.out.println(Integer.parseInt(a, 8));
    }

    public static void octalNumberToBinaryNumber(String a){
        int number = Integer.parseInt(a, 8);
        String binary = Integer.toBinaryString(number);
        System.out.println(binary);
    }

    public static void octalNumberToHexadecimalNumber(String a){
        System.out.println(Integer.toHexString(Integer.parseInt(a, 8)));
    }

    public static void hexadecimalNumberToDecimalNumber(String a){
        System.out.println(Integer.parseInt(a, 16));
    }

    public static void hexadecimalNumberToBinaryNumber(String a){
        int number = Integer.parseInt(a, 16);
        String binary = Integer.toBinaryString(number);
        System.out.println(binary);
    }

    public static void hexadecimalNumberToOctalNumber(String a){
        int number = Integer.parseInt(a, 16);
        String octal = Integer.toOctalString(number);
        System.out.println(octal);
    }

    public static void compareTwoNumbers(int a, int b){
        if(a > b){
            System.out.println("First number is bigger than second number.");
        } else if(a == b) {
            System.out.println("Both numbers are equal.");
        } else {
            System.out.println("Second number is bigger than first number.");
        }
    }

    public static void addDigitsOfInteger(int a){
        int sum = 0;
        String integer = Integer.toString(a);
        for (int i = 0; i < integer.length(); i++) {
            int x = Integer.parseInt(String.valueOf(integer.charAt(i)));
            sum = sum + x;

        }
        System.out.println(sum);
    }

    public static void areaOfHexagon(int sideLength){
        double area = (3 * sqrt(3) * pow(sideLength, 2))/2;
        System.out.println(area);
    }

    public static void areaOfPolygon(int numberOfSides, int sideLength){
        double area = (numberOfSides * pow(sideLength, 2))/(4*tan(PI/numberOfSides));
        System.out.println(area);
    }

}
