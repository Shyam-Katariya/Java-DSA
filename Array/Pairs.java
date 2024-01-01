package Array;

public class Pairs {

    static void printPairs(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("(" +curr + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6};
        printPairs(arr);

    }
}
