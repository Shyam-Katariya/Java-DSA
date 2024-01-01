package Array;

public class ArrayMax {
    public static void main(String[] args) {

        int[] arr = {1,34,64,34,95};
        System.out.print(findmax(arr));
    }
    static int findmax(int[] arr) {

        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
