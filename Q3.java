import java.util.Arrays;

public class Main {

    public static int[] uniao(int[] v1, int[] v2) {
        int[] v3 = new int[v1.length + v2.length];
        for (int i = 0; i < v1.length; i++) {
            v3[i] = v1[i];
        }
        
        for (int i = 0; i < v2.length; i++) {
            v3[v1.length + i] = v2[i];
        }
        return v3;
    }


    public static void main(String[] args) {
        int[] v1 = {11, 13, 45, 7};
        int[] v2 = {24, 4, 16, 81, 10, 12};

        int[] v3 = uniao(v1, v2);

        System.out.println("União dos arrays: " + Arrays.toString(v3));
    }
}
