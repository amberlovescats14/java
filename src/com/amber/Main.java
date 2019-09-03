package com.amber;

//This is imported to use a reference from a different package
import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
//        byte myAge = 30;
//        long viewCount = 3_123_456_789L;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = true;
//        //reference
//        Date now = new Date();
//        System.out.println(now);
        /////////////////;
        //REFERENCE types do not hold values but addresses
//        Point point1 = new Point(1,2);
//        Point point2 = point1;
//        point1.x = 2;
        //x  and point2 will both print 2

//        String message = new String("Hello World") STRINGS
//          String message = "Hello World!"; // can also escape chars \" NO BACK TICS
//
//          System.out.println(message.endsWith("!")); //true
          //startsWith
         // .length()
         // .indexOf()
        // .replace("!", "*")  this returns a new string // strings are IMMUTABLE
        // toLowerCase() //  toUpperCase() // also returns a new string
        //  .trim()
////////////////////////// ARRAYS
//        int [] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        int [] numbers = { 2, 3, 5, 3, 4};
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));
        // Array.sort(numbers)

        ///////////// MULTI DEMENSIONAL ARRAY
//        int [][] second = new int[2][3]; // Two row and three column
//        second[0][0] = 1;
//        System.out.println(Arrays.deepToString(second));

//        int [][] twoDem = {{1,2,3}, {1,2, 3}};
//        System.out.println(Arrays.deepToString(twoDem));

        // CONSTANT //
//        final float PI = 3.14F;

        // Arithmetic EXPRESSIONS  // CASTING
//        double result = (double)10 / (double)3;
//        int x = 1;
//        x++;
//        //* in order for both to be the incremented value, it has to be like this..
//        int x = 1;
//        int y = ++x; //both with be 2

        // MORE CASTING       IMPLICIT CASTING
        // byte > short > int > long > float > double
//        short x = 1;
//        int y = x + 2; //will print 3
        //EXPLICIT CASTING
//        double x = 1.1;
//        int y = (int)x + 2;
        // STRING TO NUMBER
        // Integer.parseInt()
        // parseShort
        //parseFloat
//        String x = "1";
//        int y = Integer.parseInt(x) + 3;
        // Double.parseDouble()

        //MATHEMATICAL OPERATIONS
        int result = Math.round(1.1F);

        int res = (int)Math.ciel(1.1F); // u have to cast int
        //floor
        //max(1,2) min(1,2)
        //.random









    }
}

