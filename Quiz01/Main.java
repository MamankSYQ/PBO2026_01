package Quiz01;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 1. Tambah Customer
        Customer c1 = new Customer(1, "Budi Santoso", "Malang", 123);
        Customer.addCustomer(c1);
 
        // 2. Tambah Produk dengan Stock nya
        Product p1 = new Product(101, 15000, "Makanan");
        Product p2 = new Product(102, 25000, "Minuman");
        Product.addProduct(p1);
        Product.addProduct(p2);
        p1.addStock(new Stock(101, 50, 1));
        p1.addStock(new Stock(101, 20, 2));
        p2.addStock(new Stock(102, 30, 1));
 
        // 3. Buat Order
        Order order1 = Order.createOrder(1001, c1, 55000, Arrays.asList(p1, p2));
 
        // 4. Edit data
        Customer.editCustomer(1, "Budi S.", "Lowokwaru", 234);
        Product.modifyProduct(101, 16000, "Makanan Ringan");
        Order.editOrder(1001, 57000, Arrays.asList(p1));
 
        // 5. Cetak hasil akhir
        System.out.println("\nData Customer");
        Customer.findById(1).info();
 
        System.out.println("\nData Product");
        Product.selectProduct(101).info();
 
        System.out.println("\nData Order");
        Order.findById(1001).info();
 
        // 6. Hapus customer
        System.out.println();
        Customer.deleteCustomer(1);
    }
}
