package Vesa;

public class Q6 {
 /*
 Write a method that can check if a number is prime or not
  */
    public static boolean isPrime(int num){

        boolean result = true;

        for (int i = 2; i < num ; i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }
        return  result;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(13));
        System.out.println(isPrime(6));
        System.out.println(isPrime(7));
    }
}
