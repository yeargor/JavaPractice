import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        while(true)
        {
            int size = 0;

            while (size <= 3) {
                try {
                    size = in.nextInt();
                } catch (Exception ex) {
                    System.out.println("bro, this is not a number even!");
                    in.next();
                }
            }
            System.out.println("done " + size);

            int[] arr = new int[rd.nextInt(size)];
            ArrayList<Integer> positiveArr = new ArrayList<Integer>();

            for (int i = 0; i < arr.length; i++) {
                arr[i] = rd.nextInt(size);
                if (arr[i] % 2 == 0) positiveArr.add(arr[i]);
                System.out.print(arr[i] + " ");
            }

            System.out.println("\n");
            System.out.println(Arrays.toString(positiveArr.toArray()));

            System.out.println("do you wanna try again? (y/n)");
            String response = in.next().trim().toLowerCase();
            if (response.equals("n")) { break; }
        }

        in.close();
    }
}