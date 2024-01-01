package Array;

import java.util.Scanner;

public class Main {
//    public static void display(){
//        System.out.print("Hello, ");
//    }
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        String name = in.next();
//        display();
//        System.out.print(name);
//
//    }

    static class Solution {

        public int maxProfit(int[] prices, int fee) {

            Byte Integeer = null;
            int buy = Integeer.MIN_VALUE;
            int sell = 0;

            for(int price : prices){

                buy = Math.max(buy, sell - price);
                sell = Math.max(sell, buy + price - fee);
            }
            return sell;

        }

        public void main(String[] args){

            int price[] = {1,3,5,4,7,9};
            maxProfit(price, 3);

        }
    }
}