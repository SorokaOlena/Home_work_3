//package com.company;
//import java.util.stream.*;
//
//class Test {
////Task 1 ( Print numbers from 10 to 20 using all known cycles.)
//    public static void main(String[] args){
//
////Цикл while
//        int a=10;
//        while (a<20) {
//            System.out.println("It is cycle while and number a:"+a);
//            a++;
//        }
////Цикл do…while
//        int b=9;
//        do{
//            b++;
//            System.out.println("It is cycle do...while and number b:"+b);
//        }
//        while (b<19);
//
////Цикл for
//        for (int c = 10; c < 20; c++) {
//            System.out.println ("It is cycle for and number c:"+c);
//        }
////Цикл for each
//        int nums[]={10,11,12,13,14,15,16,17,18,19};
//        for (Integer d:nums) {
//            System.out.println("It is cycle for each and number d:"+d);
//        }
//
//
//
//
//        //Task 2 (. Print all the numbers from 1 to 100, which are divided by 3 without a remainder.)
//
//        for (int a=1; a<100;) {
//            if (a % 3 == 0) {
//                System.out.println("Number a:" + a);
//
//            }
//            a++;
//        }
//
//        //Task 3 (Fill the array with numbers from 100 to 0)
//
//        int[] array = new int[100];
//
//        int a = 0;
//        int b = 100;
//
//        while (b > 0) {
//            array[a] = b;
//            System.out.println(array[a]);
//            a++;
//            b--;
//        }
//
//        //Task 4 ( Given an array of 10 integers. To display the sum of all its elements except the first and last.)
//        int[] array = new int[100];
//
//        int a = 0;
//        int b = 1;
//
//        while (b < 11) {
//            array[a] = b;
//            System.out.println(array[a]);
//            a++;
//            b++;
//        }
//        int sumAll = IntStream.of(array).sum();
//        int sum=sumAll-array[0]-array[9];
//        System.out.println("This is sum:"+sum);
//
//        //Task 5 ( Write a function which calculates and returns the minimum of 4 arguments)
//
//
//package com.company;
////import java.util.ArrayList;
//import java.util.stream.*;
//
//        class Test {
//
//
//            public static void main(String[] args) {
//                int a=1;
//                int b=2;
//                int c=3;
//                int d=4;
//                // Test myData = new Test() {}
//
//                // System.out.println(result);
//
//                min( a,b);
//                int result1 = Math.min(a, b);
//                return  min(a, b);
//
//                System.out.println( min( a,b));
//                min(a, b, c,d);
//                System.out.println( min( a,b,c,d));
//            }
//
//            public static int min(int a, int b, int c, int d) {
//                min( a,b);
//                int result2 = Math.min(c,d)+ Math.min(a,b);
//                return  result2;
//            }
//
//            public static int min(int a, int b) {
//                int result1 = Math.min(a, b);
//                return  result1;
//
//
//            }
//
//        }
//
//
//*******************************
//
////Task 6 (Write a method named getEvenDigitSum with one parameter of the type "int". The method should return the sum of even digits within the number. If the number is negative, method should return -1;)
//
//
//        public static void main(String[] args) {
//            System.out.println(getEvenDigitSum(234));
//        }
//
//        public static int getEvenDigitSum(int number){
//            if (number <0 ){
//                return -1;
//            }
//            else {
//                int count = 0;
//                int even = 0;
//                while(number > 0){
//                    even = number % 10;
//                    number = number / 10;
//                    if(even % 2 == 0){
//                        count += even;
//                    }
//                }
//                return count;
//            }
//        }
//
////Task 7 ( Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.If one of the parameters is < 10, method should return -1 to indicate an invalid value. The method should return the greatest common divisor of two numbers.)
//
//**********************package com.company;
//import java.util.Scanner;
//
//        class Test {
//
//            public static void main (String[] args)
//            {
//                //Get values from user.
//                Scanner userInput = new Scanner(System.in);
//                System.out.print("Enter value for first :");
//                int first  = userInput.nextInt();
//                System.out.print("Enter value for second:");
//                int second = userInput.nextInt();
//
//                //Get Greatest Common Divisor.
//                System.out.println("\nIf one of the parameters is < 10");
//                int gcd = GCD_NoMod(first, second);
//                System.out.println("GCD: "+gcd);
//
//                //Get Greatest Common Divisor using modulo.
//                System.out.println("\nReturning the greatest common divisor of two numbers:\n");
//                gcd = getGreatestCommonDivisor(first, second);
//                System.out.println("Divisor : "+gcd);
//            }
//            public static int GCD_NoMod(int first, int second)
//            {
//                int firstt= first-1;
//                print(first,second);
//                if (first<10)
//                    return firstt;
////        else if (second<10)
////            return second;;
//                System.out.println(firstt);
//            }
//            public static int getGreatestCommonDivisor (int first, int second)
//            {
//                print(first,second);
//                if (second == 0)
//                    return first;
//                else
//                    return getGreatestCommonDivisor (second,first % second);
//            }
//            public static void print(int first, int second)
//            {
//                System.out.println("("+first+","+second+")");
//            }
//        }
//
