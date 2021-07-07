package task01;

import java.util.ArrayList;
import java.util.List;

public class CustomersList {
    private List<Customer> collection;

    public List<Customer> getCollection() {
        return collection;
    }

    public CustomersList() {
        this.collection = new ArrayList<Customer>();
    }

    public void addCustomer(Customer customer) {
        collection.add(customer);
    }

    private void alphabetize() {
        collection.sort((c1, c2) -> c1.getFirstName().compareToIgnoreCase(c2.getFirstName()));
    }

    public List searchCustomersByFirstName(String criteria) {
        alphabetize();
        List<Customer> foundCustomers = new ArrayList<Customer>();
        collection.forEach(element ->{
            if (element.getFirstName().toLowerCase().contains(criteria))
                foundCustomers.add(element);
        });
        return foundCustomers;
    }

    public List searchCustomersByCardNumber(long firstValue, long secondValue) {
        alphabetize();
        List<Customer> foundCustomers = new ArrayList<Customer>();
        collection.forEach(element ->{
            if (element.getCreditCardNumber()<secondValue&&element.getCreditCardNumber()>firstValue)
                foundCustomers.add(element);
        });
        return foundCustomers;
    }

    public static String stringifyList(List<Customer> list) {
        StringBuffer strBuffer = new StringBuffer("[\n");
        list.forEach(element-> {
            strBuffer.append(element.toString()+"");
        });
        strBuffer.append("]");
        return strBuffer.toString();
    }
}
