
package pointofsale;

import java.util.Scanner;

public class PointOfSale {

public double subTotal;
public static double runningTotal;
private static double itemPrice;
static boolean ordering = true;
static Scanner input = new Scanner(System.in);
public static void menu(){
    
         System.out.println("Hello can i take your order? \n1. Burger (₱50.00)\n2. Fries (₱20.00)\n3. Chicken (₱95.00)\n4. Soda (₱18.00)\n5. Salmon (₱80.00)\n6. Spaghetti (₱50.00)\n7. Steak (₱50.00)\n8. Coffee (₱15.00)\n9. Ice Cream (₱25.00)\n10. Pancake (₱20.00)\n11. Done");
}
public static double itemPrice(int foodItem) {
    if (foodItem == 1) {
        //burger= ₱50.00
        System.out.println("Product #1");
        System.out.println("You've ordered a Burger");
        System.out.println("Price: ₱50.00");
        itemPrice = 50.00;
    }
    if (foodItem == 2) {
        //fries = ₱20.00
        System.out.println("Product #2");
        System.out.println("You've ordered a Fries");
        System.out.println("Price: ₱20.00");
        itemPrice = 20.0;
    }
    if (foodItem == 3) {
        //soda = ₱95.00
        System.out.println("Product #3");
        System.out.println("You've ordered a Chicken");
         System.out.println("Price: ₱95.00");
         itemPrice = 95.00;
    }
    if (foodItem == 4) {
        //soda = ₱18.00
            System.out.println("Product #4");
            System.out.println("You've ordered a soda");
            System.out.println("Price: ₱18.00");
            itemPrice = 18.00;
    }
    if (foodItem == 5) {
        //soda = ₱80.00
        System.out.println("Product #5");
        System.out.println("You've ordered a Salmon");
            System.out.println("Price: ₱80.00");
            itemPrice = 80.00;
    }
    if (foodItem == 6) {
        //soda = ₱50.00
        System.out.println("Product #6"); 
        System.out.println("You've ordered a Spaghetti");
            System.out.println("Price: ₱50.00");
            itemPrice = 50.00;
    }
    if (foodItem == 7) {
        //soda = ₱50.00
        System.out.println("Product #7"); 
        System.out.println("You've ordered a Steak");
            System.out.println("Price: ₱50.00");
            itemPrice = 50.00;
    }
    if (foodItem == 8) {
        //soda = ₱15.00
        System.out.println("Product #8");
        System.out.println("You've ordered a Coffee");
            System.out.println("Price: ₱15.00");
            itemPrice = 15.00;
    }
    if (foodItem == 9) {
        //soda = ₱25.00
       System.out.println("Product #9");   
       System.out.println("You've ordered a Ice Cream");
            System.out.println("Price: ₱25.00");
            itemPrice = 25.00;
    }
    if (foodItem == 10) {
        //soda = ₱20.00
       System.out.println("Product #10");
        System.out.println("You've ordered a Pancake");
            System.out.println("Price: ₱20.00 ");
            itemPrice = 20.00;
    }
    quantity();
    return itemPrice;
}
public static double quantity() {
    System.out.println("Enter Quantity: ");
    double quantity = input.nextDouble();
    subTotal(quantity, itemPrice);
    return quantity;
 }
public static double subTotal(double quantity, double itemPrice) {
    double subTotal = quantity*itemPrice;
    System.out.println("Subtotal: ₱"+ subTotal);
    System.out.println("========================================================");
    runningTotal += subTotal;
    return subTotal;
}
public static void done(){
    ordering = false;
    System.out.println("========================================================");
    System.out.println("Transaction ID: #01");
    System.out.println("Enjoy your meal!");
    System.out.println("Total Amount: ₱" + runningTotal);
    System.out.println("========================================================");
}
public static void main(String[] args) {
    int menuOption;
    int foodItem = 0;
    input = new Scanner(System.in); 
    do{
        double runningTotal=0;
        menu();
        menuOption = input.nextInt();    
        switch(menuOption){
            case 1:
                foodItem = 1;
                itemPrice(foodItem);
                break;
            case 2:
                foodItem = 2;
                itemPrice(foodItem);
                break;
            case 3:
                foodItem = 3;
                itemPrice(foodItem);
                break;
            case 4:
                foodItem = 4;
                itemPrice(foodItem);
                break;
            case 5:
                foodItem = 5;
                itemPrice(foodItem);
                break;
            case 6:
                foodItem = 6;
                itemPrice(foodItem);
                break;
            case 7:
                foodItem = 7;
                itemPrice(foodItem);
                break;
            case 8:
                foodItem = 8;
                itemPrice(foodItem);
                break;
            case 9:
                foodItem = 9;
                itemPrice(foodItem);
                break;
            case 10:
                foodItem = 10;
                itemPrice(foodItem);
                break;    
            case 11:
                done();
                break;      
            default:
                System.out.println("============================================"); 
                System.out.println("Invalid option!.");
                System.out.println("============================================");      
        }

    } while(ordering); {
}
}
}
     
    
