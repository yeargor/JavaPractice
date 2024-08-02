import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sum = 0;

        System.out.println("Please, enter the number: ");

        while (in.hasNextInt()){

            int num = in.nextInt();

            if (num == 0) break;

            sum += num;

            System.out.println("Current sum: " + sum);
        }

        System.out.println("Total: " + sum);
    }
}