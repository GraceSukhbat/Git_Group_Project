package Vesa;

public class Q1 {
    /*
    Write  a method which can identifies given number is even or odd
     */

    public static String evenOrOdd(int number){
        String result;
        if(number%2 == 0){
            result = "Even";
        }
        else{
            result = "Odd";
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(evenOrOdd(5));
        System.out.println(evenOrOdd(8));
    }
}
