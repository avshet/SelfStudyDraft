package BackEnd;

import java.util.ArrayList;
import java.util.List;

public class shopA extends ShopOwner {

    List<shopA> list = new ArrayList<>();
    double amount;
    public static double rating = 9.0;
    public shopA()
    {

    }

    public shopA(String item, double price) {
        super(item, price);
    }

    @Override
    public void AddItems(String item, double price) {
        shopA sh = new shopA(item, price);
        list.add(sh);
    }


    @Override
    public double showlist() {
        amount = 0;
        for (shopA item : list) {
            amount += item.price;
        }
        return amount;
    }

   /* static shop<Double, String> lambda = (str) -> {
        return switch (str) {
            case "itemA" -> 10.0;
            case "itemB" -> 20.0;
            case "itemC" -> 30.0;
            case "itemD" -> 40.0;
            default -> 0.0;
        };
    };*/
    public void GenerateBill()
    {
        System.out.println("Your Bill is Generated");
        System.out.println("ITEM\tPRICE (RS)");
        for(shopA item:list)
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



