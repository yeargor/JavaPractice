import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1, num2;

        num1 = in.nextInt();
        num2 = in.nextInt();

        String result = num1 > num2 ? "num1 is bigger" : "num2 is bigger";

        System.out.println(result);

    }
}