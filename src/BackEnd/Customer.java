package BackEnd;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String Name, Email, Password;

    private final List<Customer> DataBase = new ArrayList<Customer>();

    Customer(String name, String email, String password)
    {
        this.Name = name;
        this.Email = email;
        this.Password = password;
    }

    ArrayList<Customer> AddCustomer(Customer customer)
    {
        DataBase.add(customer);
        return (ArrayList<Customer>) DataBase;
    }

    boolean CheckCustomer (Customer customer)
    {
        System.out.println(customer.Email);
        for(Customer c: DataBase)
        {
            System.out.println("customer.Email");
            System.out.println(c.Email+" "+customer.Email);
            if(c.equals(customer.Email))
            {
                if(c.Password.equals(customer.Password))
                    return true;
            }
        }
        return false;
    }
    void ShowCustomer()
    {
        for(Customer c: DataBase)
        {
            System.out.println(c.Name+c.Email+c.Password);
        }
    }

}
