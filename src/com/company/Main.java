package com.company;

public class Main {
    public static void main(String[] args) {
        int number = 1;

        //printNumbers(number);
        printNumbers2(number);
    }
    public static void printNumbers2(int num) {
        if (num <= 255) {
            String output = "";
            if (num % 3 == 0) {
                output = output + "Fizz";
            }

            if (num % 5 == 0) {
                output = output +"Buzz";
            }

            if (output.equals("")){
                output =  Integer.toString(num);
            }
            System.out.println(output);
            printNumbers2(num + 1);
            }
    }
    public static void printNumbers(int num) {
        if (num <= 255) {

            if (num % 11 == 0) {
                System.out.print("Bong");
            } else if (num % 17 == 0 && num % 5 == 0 && num % 3 == 0 ) {
                System.out.print("BuzzFizz");
            } else if (num % 13 == 0 && num %3==0 && num%5==0) {
                System.out.print("FizzFezzBuzz");
            } else if (num % 13 == 0 && num %5==0) {
                System.out.print("FezzBuzz");
            } else if (num % 13 == 0 && num %7==0) {
                System.out.print("FezzBang");
            } else if (num % 3 == 0 && num%7 ==0) {
                System.out.print("FizzBang");
            } else if (num % 5 == 0 && num%7 ==0) {
                System.out.print("BuzzBang");
            } else if (num % 3 == 0 && num % 5 == 0) {
                System.out.print("FizzBuzz");
            } else if (num % 5 == 0) {
                System.out.print("Buzz");
            } else if (num % 3 == 0) {
                System.out.print("Fizz");
            } else if (num % 7 == 0) {
                System.out.print("Bang");
            } else {
                System.out.print(num + " ");


            }

            System.out.println();
            printNumbers(num + 1);


        }

    }

}


