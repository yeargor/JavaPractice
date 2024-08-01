import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> finalNums = new ArrayList<>();

        for (int i = 1; i < 200; i++)
        {

            String temp = Integer.toString(i);

            if (temp.contains("4") || temp.contains("13")) {
                continue;
            }

            finalNums.add(String.format("%05d", Integer.parseInt(temp)));
        }

        System.out.println(finalNums);

    }
}