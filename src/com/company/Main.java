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

        System.out.println(multiplication(5, 9));

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

        //11. Write a Java program to print the area and perimeter of a circle.

        perimeterAndAreaOfCircle(7.5);

        //12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

        System.out.println(averageOfThreeNumbers(1, 5, 7));

        //13. Write a Java program to print the area and perimeter of a rectangle.

        areaAndPerimeterOfRectangle(5.6, 8.5);

        //14. Write a Java program to print an American flag on the screen.

        americanFlag();

        //15. Write a Java program to swap two variables.

        variablesSwap(5, 0);

        //16. Write a Java program to print a face.

        face();

        //17. Write a Java program to add two binary numbers.

        addTwoBinaryNumbers(0b10, 0b11);

        //18. Write a Java program to multiply two binary numbers.

        multiplyTwoBinaryNumbers(0b10, 0b11);

        //19. Write a Java program to convert a decimal number to binary number.

        decimalNumberToBinaryNumber(5);

        //20. Write a Java program to convert a decimal number to hexadecimal number.

        decimalNumberToHexadecimalNumber(1445);

        //21. Write a Java program to convert a decimal number to octal number.

        decimalNumberToOctalNumber(15);

        //22. Write a Java program to convert a binary number to decimal number.

        System.out.println(binaryNumberToDecimalNumber("100"));

        //23. Write a Java program to convert a binary number to hexadecimal number.

        binaryNumberToHexadecimalNumber("1101");

        //24. Write a Java program to convert a binary number to a Octal number.

        binaryNumberToOctalNumber("111");

        //25. Write a Java program to convert a octal number to a decimal number.

        octalNumberToDecimalNumber("10");

        //26. Write a Java program to convert a octal number to a binary number.

        octalNumberToBinaryNumber("7");

        //27. Write a Java program to convert a octal number to a hexadecimal number.

        octalNumberToHexadecimalNumber("100");

        //28. Write a Java program to convert a hexadecimal to a decimal number.

        hexadecimalNumberToDecimalNumber("25");

        //29. Write a Java program to convert a hexadecimal to a binary number.

        hexadecimalNumberToBinaryNumber("37");

        //30. Write a Java program to convert a hexadecimal to a octal number.

        hexadecimalNumberToOctalNumber("40");

        //31. Write a Java program to check whether Java is installed on your computer.


        //32. Write a Java program to compare two numbers.


        //33. Write a Java program and compute the sum of the digits of an integer.


        //34. Write a Java program to compute the area of a hexagon.


        //35. Write a Java program to compute the area of a polygon.





    }
}
