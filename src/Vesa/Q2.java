package Vesa;

public class Q2 {
    /*
    Write a method that can divide two numbers without using division operator
     */

    public static int division(int num1, int num2){

        int result = 0;

        while(num1 >= num2){
            num1 = num1 - num2;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(division(20,4));
        System.out.println(division(18,2));
        System.out.println(division(13,2));
    }
}
