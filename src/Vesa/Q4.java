package Vesa;

public class Q4 {
    /*
    Swap two variable' values without using a third variable
     */

    public static void swapNumbers(int num1, int num2){

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swap num1: " + num1);
        System.out.println("After swap num2: " + num2);
    }

    public static void main(String[] args) {

        swapNumbers(1,3);
        swapNumbers(3,5);
    }
}
