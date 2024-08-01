import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print(sumOfDigits(in.nextInt()));
    }

    public static int sumOfDigits(int num){


        int sum = 0;
        int remainder;

        while (num > 0){

            remainder = num % 10;
            sum += remainder;
            num /= 10;

        }

        return sum;
    }
}