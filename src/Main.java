import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int x = 2;
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++)
        {
            myArrayList.add(x);
            System.out.print(myArrayList.get(i) + " ");
            x *=2;
        }

    }
}