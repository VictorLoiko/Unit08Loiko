package task01;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        CustomersList dataset = new CustomersList();
        dataset.addCustomer(new Customer(1,"Matthews","Sydney","Kaitlin","4733 Stonecoal Road",
                4556184791206008L,57250266L));
        dataset.addCustomer(new Customer(2,"Hoover","Sally","Conrad","2405 Shadowmar Drive",
                4485977677903762L,62763229L));
        dataset.addCustomer(new Customer(3,"Moreno","Katie","Madisen","2088 Harron Drive",
                4929425385206874L,22978165L));
        dataset.addCustomer(new Customer(4,"Navarro","Chloe","Marcella","934 University Street",
                5347470071108886L,47389973L));
        dataset.addCustomer(new Customer(5,"Hendrix","Zoe","Miriam","3308 Station Street",
                5582167479861496L,26906064L));
        dataset.addCustomer(new Customer(6,"Gray","Rufus","Dex","2132 Bingamon Road",
                6011704999896997L,74120043L));

        System.out.println("Before sort:");
        System.out.println(CustomersList.stringifyList(dataset.getCollection()));
        System.out.println("After sort by First name: ");
        System.out.println(CustomersList.stringifyList(dataset.searchCustomersByFirstName("")));
        System.out.println("Findind customers with Visa cards:");
        System.out.println(CustomersList.stringifyList(dataset.searchCustomersByCardNumber(4000000000000000L,5000000000000000L)));

    }
}
