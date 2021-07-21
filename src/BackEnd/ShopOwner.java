package BackEnd;
import java.util.Scanner;

interface shop{
    String TypeOfBusiness = null;
    double orderfood(int ch, ShopOwner sh);
}

public class ShopOwner implements shop {

    static double amount = 0;
    Scanner in = new Scanner(System.in);
    String item;
    double price;
    public ShopOwner()
    {
    }
    public ShopOwner(String item, double price) {
        this.price = price;
        this.item = item;
    }
    @Override
    public double orderfood(int ch, ShopOwner sh) {
        return 0;
    }
    public void AddItems(String item, double price) {

    }
    public void GenerateBill() {

    }


    public double showlist() {
        return 0;
    }
}

