package Quiz01;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private int phone;
    private static List<Customer> customerList = new ArrayList<>();
    
    public Customer(int customerId, String customerName, String address, int phone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
    }

    public int getCustomerId(){ 
        return customerId; 
    }

    public void setCustomerId(int customerId){ 
        this.customerId = customerId;
    }

    public String getCustomerName(){ 
        return customerName; 
    }

    public void setCustomerName(String customerName){ 
        this.customerName = customerName;
    }

    public String getAddress(){ 
        return address; 
    }

    public void setAddress(String address){ 
        this.address = address; 
    }

    public int getPhone(){ 
        return phone; 
    }
    
    public void setPhone(int phone){ 
        this.phone = phone; 
    }

    public static Customer findById(int customerId){
        for (Customer c : customerList){
            if (c.customerId == customerId) return c;
        }
        return null;
    }

    public static void addCustomer(Customer customer){
        customerList.add(customer);
        System.out.println("Customer Ditambahkan : " + customer.customerName);
    }

    public static void editCustomer(int customerId, String newName, String newAddress, int newPhone){
        Customer c = findById(customerId);
        if (c != null){
            c.setCustomerName(newName);
            c.setCustomerName(newName);
            c.setAddress(newAddress);
            c.setPhone(newPhone);
            System.out.println("ID Customer diubah : " + customerId);
        }
        else{
            System.out.println("Customer dengan ID "+customerId+" tidak ditemukan");
        }
    }

    public static void deleteCustomer(int customerId) {
        boolean removed = customerList.removeIf(c -> c.customerId == customerId);
        System.out.println(removed ? "Customer dengan ID "+customerId+" dihapus": "Customer dengan ID "+customerId+" tidak ditemukan");
    }

    public static List<Customer> getAll() {
        return customerList;
    }

    public void info(){
        System.out.println("ID Customer : "+customerId);
        System.out.println("Nama        : "+customerName);
        System.out.println("Alamat      : "+address);
        System.out.println("Nomor HP    : "+phone);
    }
}
 