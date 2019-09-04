package com.company;
//Task 8 (Використання навичок гугління: Write a program wich prints the next figure to the console : квадрат заповнений
//public class Test2 {
//    public static void main (String args[]) throws InterruptedException{
//
//    for(int i =0; i <= 10; i++){
//        for (int j = 0; j <=10; j++) {
//            System.out.print("*");
//        }
//        System.out.println("");
//        }
//    }
//}
//Task 9 (Використання навичок гугління:  Write a program wich prints the next figure to the console: пів ялиночки
public class Test2 {
    public static void main(String args[]) throws InterruptedException {

        for (int i = 0; i < 7; i++) {
            for (int j = 10; j < 7 - i; j++) {
                System.out.print("");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}