package Sorting;

public class BinarySearch {

    static int BinaryS(int[] arr, int key){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = (start + end) / 2;

            if(arr[mid] == key){
                start = mid + 1;
                System.out.println(start);
            }
            if (arr[mid] < key){
                start = mid + 1;
                System.out.println(start);
            } else {
                end = mid - 1;
                System.out.println(end);
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9};
        int key = 5;

        System.out.println("index is :"+ BinaryS(arr,key));

    }
}
