package BackEnd;

import java.util.ArrayList;
import java.util.List;

public class shopC extends ShopOwner {

    List<shopB> list = new ArrayList<>();
    double amount;
    public static double rating = 9.0;
    public shopC(String item, double price) {
        super(item, price);
    }

    public shopC()
    {

    }
    @Override
    public void AddItems(String item, double price) {
        shopB sh = new shopB(item,price);
        list.add(sh);
    }

    @Override
    public double showlist()
    {
        amount = 0;
        for (shopB item : list) {
            amount += item.price;
        }
        return amount;
    }

    @Override
    public void GenerateBill() {
        System.out.println("Your Bill is Generated");
        System.out.println("ITEM\tPRICE (RS)");
        for(shopB item:list)
            System.out.println(item.item+"\t"+item.price);
        System.out.println("----------------------");
        System.out.println("Amount to pay is "+amount);
        list.clear();
    }
    public static void ratingupdate(double value)
    {
        rating = rating*0.9 + value*0.1;
    }
}
