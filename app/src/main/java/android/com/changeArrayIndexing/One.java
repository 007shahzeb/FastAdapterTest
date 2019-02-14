package android.com.changeArrayIndexing;

public class One {


    public static void main(String... a) {

        int[] array = {10,7,11,5,13,8}; // How do I make it read the value 10 as 1 in the array?
        sum(array.length,array);
    }

    public static int sum(int n, int[] S) {

        int i;
        int result;

        result = 0;
        for(i=1;i<=n;i++)
            result = result + S[i];

        System.out.println(result);
        return result;

    }
}
