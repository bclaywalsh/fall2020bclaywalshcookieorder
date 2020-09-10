import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class OrderApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        MasterOrder myOrder = new MasterOrder();
        myOrder.addOrder(new CookieOrder("tagalongs",1));
        myOrder.addOrder(new CookieOrder("thin mints",1));
        myOrder.addOrder(new CookieOrder("samoas",1));
        myOrder.addOrder(new CookieOrder("tagalongs",3));

        System.out.println("Current Order");
        myOrder.showOrder();
        System.out.println("");
        System.out.println("You Have Ordered " + myOrder.getTotalBoxes() + " boxes");
        System.out.println("What would you like to remove? (specify a variety or none)");

        String varietyToRemove = input.nextLine();

        System.out.println("You are removing " + myOrder.getVarietyBoxes(varietyToRemove) + " " + varietyToRemove);

    }



}
