
package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("How many bananas do you want to buy?");
        Scanner scan1 = new Scanner(System.in);
        int bananacount = scan1.nextInt();
        System.out.println("How many apples do you want to buy?");
        Scanner scan2 = new Scanner(System.in);
        int applecount = scan2.nextInt();

        //Math object array - for storage
        ArrayList<Math> shoppingCart = new ArrayList<Math>();
        shoppingCart.add(new Math(bananacount, applecount));

        //integer array for mathematical use
        int[] arr = {applecount, bananacount};
        System.out.println("this is your current cart" + shoppingCart);

        int total = calc(arr[0], arr[1]);

        System.out.print("this is your total: ");

        System.out.println(total);
    }
    public static int calc(int a, int b) {
        int banana = 40;
        int apple = 25;

        int truebananacount =  b * banana;

        int trueapplecount = a * apple;

        int value = truebananacount + trueapplecount;

        return value;
    }


}
