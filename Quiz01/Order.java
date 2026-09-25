package Quiz01;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private float amount;
    private LocalDateTime orderDate;
    private List<Product> products = new ArrayList<>();
    private static List<Order> orderList = new ArrayList<>();

    public Order(int orderId, Customer customer, float amount) {
        this.orderId = orderId;
        this.customer = customer;
        this.amount = amount;
        this.orderDate = LocalDateTime.now();
    }

    public int getOrderId(){ 
        return orderId; 
    }

    public Customer getCustomer(){ 
        return customer; 
    }

    public List<Product> getProducts(){
        return products; 
    }

    public float getAmount(){ 
        return amount; 
    }

    public void setAmount(float amount){ 
        this.amount = amount; 
    }

    public LocalDateTime getOrderDate(){
        return orderDate; 
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public static Order findById(int orderId) {
        for (Order o : orderList) {
            if (o.orderId == orderId) return o;
        }
        return null;
    }

    public static Order createOrder(int orderId, Customer customer, float amount, List<Product> products) {
        Order order = new Order(orderId, customer, amount);
        order.products.addAll(products);
        orderList.add(order);
        System.out.println("Order dengan ID : " + orderId + ", dibuat oleh "+customer.getCustomerName());
        return order;
    }

    public static void editOrder(int orderId, float newAmount, List<Product> newProducts) {
        Order o = findById(orderId);
        if (o != null) {
            o.setAmount(newAmount);
            o.products.clear();
            o.products.addAll(newProducts);
            System.out.println("ID Order diubh : "+orderId);
        } else {
            System.out.println("Order dengan ID "+orderId+" tidak ditemukan");
        }
    }

    public void info(){
        System.out.println("ID Order            : "+orderId);
        System.out.println("Customer            : "+customer.getCustomerName());
        System.out.println("Jumlah              : "+amount);
        System.out.println("Tanggal             : "+orderDate);
        System.out.println("Produk              : "+products);
    }
}
