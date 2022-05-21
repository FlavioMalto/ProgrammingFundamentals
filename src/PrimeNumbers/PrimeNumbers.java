package PrimeNumbers;

import java.util.Scanner;

public class PrimeNumbers {
    //
    public static boolean isPrime(int number){
        if(number == 1) return false;
        if(number == 2) return true;
        if(number % 2 == 0) return false;
        for(int i=3; i <= number/2; i+=2){
            if(number % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sNumber = null;

        System.out.println("Type a number");
        sNumber = scanner.next();

        int number = Integer.parseInt(sNumber);

        String output;

        if(isPrime(number)){
            output = String.format("the number %s is prime!", number);
        }else{
            output = String.format("the number %s is not prime", number);
        }
        System.out.println(output);

    }
}
