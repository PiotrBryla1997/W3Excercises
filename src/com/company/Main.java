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

        //4. Write a Java program to print the result of the following operations.
        //Test Data:
        //a. -5 + 8 * 6
        //b. (55+9) % 9
        //c. 20 + -3*5 / 8
        //d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println(equationA());
        System.out.println(equationB());
        System.out.println(equationC());
        System.out.println(equationD());

        //5. Write a Java program that takes two numbers as input and display the product of two numbers.
        //Test Data:
        //Input first number: 25
        //Input second number: 5

        System.out.println(multiplication(5,9));

        //6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        //Test Data:
        //Input first number: 125
        //Input second number: 24

        addMultiplySubstractDivide(125, 24);

        //7. Write a Java program that takes a number as input and prints its multiplication table upto 10.

        multiplicationTable(9);

        //8. Write a Java program to display the following pattern.
        javaPattern();

        //9. Write a Java program to compute the specified expressions and print the output(with decimals).

        System.out.println(equationE());

        //10. Write a Java program to compute a specified formula.

        System.out.println(equationF());






    }
}
