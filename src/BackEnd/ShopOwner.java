package BackEnd;
import java.util.Scanner;

interface shop{
    String TypeOfBusiness = null;
    double orderfood(int ch, ShopOwner sh);
}

public class ShopOwner implements shop {

    static double amount = 0;
    Scanner in = new Scanner(System.in);

    @Override
    public double orderfood(int ch, ShopOwner sh) {
        System.out.println("You have selected shop " + ch);
        System.out.println("Items available here are");

        switch (ch) {
            case 1 -> {
                sh = new shopA();
                ((shopA) sh).show();
            }
            case 2 -> {
                sh = new shopB();
                ((shopB) sh).show();
            }
            case 3 -> {
                sh = new shopC();
                ((shopC) sh).show();
            }
            case 4 -> {
                sh = new shopD();
                ((shopD) sh).show();
            }
            case 5 -> {
                System.out.println("amount is" + amount);
            }
        }
        return amount;
    }
}

    class shopA extends ShopOwner {
        void show() {
            double aprice = 10, bprice = 20, cprice = 30, dprice = 40;
            System.out.println("Please select item to order\n1. A-10rs\n2. B 20rs\n3. C 30rs\n4. D 40rs");
            int ch = in.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("Do you want to buy item for 10rs, if yes print yes, else no");
                    String ans = in.next();
                    if (ans.equals("yes")) amount = amount + aprice;
                    else
                        System.out.println(amount);
                }
                case 2 -> {
                    System.out.println("Do you want to buy item for 20rs, if yes print yes, else no");
                    String ans = in.next();
                    if (ans.equals("yes")) amount = amount + bprice;
                    else
                        System.out.println(ans);
                }
                case 3 -> {
                    System.out.println("Do you want to buy item for 30rs, if yes print yes, else no");
                    String ans = in.next();
                    if (ans.equals("yes")) amount = amount + cprice;
                    else
                        System.out.println(ans);
                }
                case 4 -> {
                    System.out.println("Do you want to buy item for 40rs, if yes print yes, else no");
                    String ans = in.next();
                    if (ans.equals("yes")) amount = amount + dprice;
                    else
                        System.out.println(ans);
                }
                default -> System.exit(0);
            }
        }
    }
class shopB extends ShopOwner {
        void show() {
            int aprice = 10, bprice = 20, cprice = 30, dprice = 40;
            System.out.println("Please select item to order\n1. A-10rs\n2. B 20rs\n3. C 30rs\n4. D 40rs");
            int ch = in.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("Do you want to buy item for 10rs, if yes print yes, else no");
                    String ans = in.next();
                    if (ans.equals("yes")) amount = amount + aprice;
                    else
                        System.out.println(amount);
                }
                case 2 -> {
                    System.out.println("Do you want to buy item for 20rs, if yes print yes, else no");
                    String ans = in.next();
                    if (ans.equals("yes")) amount = amount + bprice;
                    else
                        System.out.println(ans);
                }
                case 3 -> {
                    System.out.println("Do you want to buy item for 30rs, if yes print yes, else no");
                    String ans = in.next();
                    if (ans.equals("yes")) amount = amount + cprice;
                    else
                        System.out.println(ans);
                }
                case 4 -> {
                    System.out.println("Do you want to buy item for 40rs, if yes print yes, else no");
                    String ans = in.next();
                    if (ans.equals("yes")) amount = amount + dprice;
                    else
                        System.out.println(ans);
                }
                default -> System.exit(0);
            }
        }
    }

    class shopC extends ShopOwner {
            void show() {
                int aprice = 10, bprice = 20, cprice = 30, dprice = 40;
                System.out.println("Please select item to order\n1. A-10rs\n2. B 20rs\n3. C 30rs\n4. D 40rs");
                int ch = in.nextInt();
                switch (ch) {
                    case 1 -> {
                        System.out.println("Do you want to buy item for 10rs, if yes print yes, else no");
                        String ans = in.next();
                        if (ans.equals("yes")) amount = amount + aprice;
                        else
                            System.out.println(amount);
                    }
                    case 2 -> {
                        System.out.println("Do you want to buy item for 20rs, if yes print yes, else no");
                        String ans = in.next();
                        if (ans.equals("yes")) amount = amount + bprice;
                        else
                            System.out.println(ans);
                    }
                    case 3 -> {
                        System.out.println("Do you want to buy item for 30rs, if yes print yes, else no");
                        String ans = in.next();
                        if (ans.equals("yes")) amount = amount + cprice;
                        else
                            System.out.println(ans);
                    }
                    case 4 -> {
                        System.out.println("Do you want to buy item for 40rs, if yes print yes, else no");
                        String ans = in.next();
                        if (ans.equals("yes")) amount = amount + dprice;
                        else
                            System.out.println(ans);
                    }
                    default -> System.exit(0);
                }
            }
        }

        class shopD extends ShopOwner {
                void show() {
                    int aprice = 10, bprice = 20, cprice = 30, dprice = 40;
                    System.out.println("Please select item to order\n1. A-10rs\n2. B 20rs\n3. C 30rs\n4. D 40rs");
                    int ch = in.nextInt();
                    switch (ch) {
                        case 1 -> {
                            System.out.println("Do you want to buy item for 10rs, if yes print yes, else no");
                            String ans = in.next();
                            if (ans.equals("yes")) amount = amount + aprice;
                            else
                                System.out.println(amount);
                        }
                        case 2 -> {
                            System.out.println("Do you want to buy item for 20rs, if yes print yes, else no");
                            String ans = in.next();
                            if (ans.equals("yes")) amount = amount + bprice;
                            else
                                System.out.println(ans);
                        }
                        case 3 -> {
                            System.out.println("Do you want to buy item for 30rs, if yes print yes, else no");
                            String ans = in.next();
                            if (ans.equals("yes")) amount = amount + cprice;
                            else
                                System.out.println(ans);
                        }
                        case 4 -> {
                            System.out.println("Do you want to buy item for 40rs, if yes print yes, else no");
                            String ans = in.next();
                            if (ans.equals("yes")) amount = amount + dprice;
                            else
                                System.out.println(ans);
                        }
                        default -> System.exit(0);
                    }
                }
            }




