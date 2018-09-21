package me.Blen;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter the name of the item");
            String itemName01 = scan.nextLine();

            System.out.println("Please enter the price of the item");
            double itemPrice01 = scan.nextDouble();

            System.out.println("Please enter the whole number quantity of the items");
            int itemQuantity01 = scan.nextInt();
            scan.nextLine();



            System.out.println("Please enter the name of the second item");
            String itemName02 = scan.nextLine();

            System.out.println("Please enter the price of the second  item");
            double itemPrice02 = scan.nextDouble();

            System.out.println("Please enter the whole number quantity of the items");
            int itemQuantity02 = scan.nextInt();



            double itemCost01 = 0;
            itemCost01 = itemPrice01 * itemQuantity01;

            double itemCost02 = 0;
            itemCost02 = itemPrice02 * itemQuantity02;
            int total1 = 0;

            double totalItems = itemQuantity01 + itemQuantity02;


            System.out.println("Item Name" + "\t" + "Price" + "\t" + "Quantity" + "\t" + "Cost");
            System.out.println(itemName01 + "\t" + "\t"  + itemPrice01 + "\t"  + "\t" + itemQuantity01 + "\t" + "\t" + "\t" + itemCost01);
            System.out.println(itemName02 + "\t" + "\t"  + itemPrice02 + "\t"  + "\t" + itemQuantity02 + "\t" + "\t" + "\t" + itemCost02);
            System.out.println("Total purchase Amount = " + totalItems);

        }

    }


