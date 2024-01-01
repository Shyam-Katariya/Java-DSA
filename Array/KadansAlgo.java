package Array;

public class KadansAlgo {
    public static void kadanes(int arr[]){

        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++) {
            cs = cs+arr[i];
            if (cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Max SubArray sum is : " + ms);
    }
    public static void main(String[] args) {

        int[] arr = {-2,-4,1,8,-5,9,-2};
        kadanes(arr);

    }
}