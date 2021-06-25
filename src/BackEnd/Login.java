package BackEnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String Name, Email, Password;
        double amount = 0;
        ArrayList<Customer> list;

        List<Customer> DataBase = new ArrayList<Customer>();
        while(true) {
            System.out.println("Welcome to the Javafx billing system.\n1. Existing Customer\n2. New Customer\n\nEnter your choice");
            int n = in.nextInt();
            switch (n) {
                case 1: {
                    System.out.print("Enter your credentials\nName :");
                    Name = in.next();
                    System.out.print("Email :");
                    Email = in.next();
                    System.out.print("Password :");
                    Password = in.next();
                    Customer c = new Customer(Name, Email, Password);
                    if(!c.CheckCustomer(c)){
                        while (true) {
                            System.out.println("Please select store\n1. A\n2. B\n3. C\n4. D\n 5. finished shopping enter");
                            ShopOwner sh = new ShopOwner();
                            try{
                                int ch = in.nextInt();
                                amount = sh.orderfood(ch, sh);
                            }catch(Exception e)
                            {
                                System.out.println("total amount to pay is"+amount);
                                break;
                            }

                        }
                    }
                    else
                        System.out.println("Check Your credentials, if you are a new customer create new account");
                    break;
                }
                case 2: {
                    System.out.print("Enter details to create your account\nName :");
                    Name = in.next();
                    System.out.print("Email :");
                    Email = in.next();
                    System.out.print("Create your password\nPassword :");
                    Password = in.next();
                    Customer c = new Customer(Name, Email, Password);
                    list = c.AddCustomer(c);
                    System.out.println("Now use your credential to login");
                    c.ShowCustomer();
                    break;
                }
                default:System.exit(0);
            }
        }

    }


}
