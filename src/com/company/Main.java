package com.company;

import static com.company.Maths.*;

public class Main {

    public static void main(String[] args) {
        //1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
        System.out.println("Hello");
        System.out.println("Piotr");

        //2. Write a Java program to print the sum of two numbers.
        int sum = sum(1, 2);
        System.out.println(sum);

        //3. Write a Java program to divide two numbers and print on the screen.
        int divide = divide(50, 3);
        System.out.println(divide);

        //4. Write a Java program to print the result of the following operations. Go to the editor
        //Test Data:
        //a. -5 + 8 * 6
        //b. (55+9) % 9
        //c. 20 + -3*5 / 8
        //d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println(equationA());
        System.out.println(equationB());
        System.out.println(equationC());
        System.out.println(equationD());


    }


}
