import yeagor.Timer;

public class Main {

    public static void main(String[] args) {

        int[] vals = new int[100000000];
        int valToFind = 99999999;

        for (int i = 0; i < vals.length; i++) {
            vals[i] = i + 1;
        }

        Timer.timerStart();

        System.out.println(binarySearch(vals, valToFind, 0, vals.length-1));

        System.out.println("Time with binarySearch: " + Timer.timerEnd() + "ns");

        Timer.timerStart();

        System.out.println(simpleSearch(vals,valToFind));

        System.out.println("Time with simpleSearch: " + Timer.timerEnd() + "ns");

    }

    private static int simpleSearch(int[] vals, int valToFind)
    {

        for (int val : vals) {
            if (val == valToFind) return val;
        }

        return -1;
    }

    private static int binarySearch(int[] vals, int valToFind, int left, int right)
    {

        int middle = left + (right - left) /  2;

        if(left == right) return valToFind == vals[middle] ? vals[middle] : -1;

        if (vals[middle] > valToFind)
        {
            return binarySearch(vals, valToFind, left, middle -1);
        }
        else if(vals[middle] < valToFind)
        {
            return binarySearch(vals, valToFind, middle +1, right);
        }

        return vals[middle];

    }
}