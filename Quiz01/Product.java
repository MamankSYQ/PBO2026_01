package Quiz01;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private int productId;
    private float productPrice;
    private String productType;
    private List<Stock> stockList = new ArrayList<>();
    private static List<Product> productList = new ArrayList<>();

    public Product(int productId, float productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public int getProductId(){ 
        return productId; 
    }

    public void setProductId(int productId){ 
        this.productId = productId; 
    }

    public float getProductPrice(){ 
        return productPrice; 
    }

    public void setProductPrice(float productPrice){ 
        this.productPrice = productPrice; 
    }

    public String getProductType(){ 
        return productType; 
    }

    public void setProductType(String productType){ 
        this.productType = productType; 
    }

    public List<Stock> getStockList(){ 
        return stockList; 
    }

    public void addStock(Stock stock){
        stockList.add(stock);
        System.out.println();
    }

    public static void addProduct(Product product){
        productList.add(product);
        System.out.println("Product Ditambahkan : " + product.productId);
    }

    public static Product selectProduct(int productId){
        for (Product p : productList) {
            if (p.productId == productId) return p;
        }
        return null;
    }

    public static void modifyProduct(int productId, float newPrice, String newType){
        Product p = selectProduct(productId);
        if (p != null) {
            p.setProductPrice(newPrice);
            p.setProductType(newType);
            System.out.println("ID Product diubah : " + productId);
        } 
        else {
            System.out.println("Product dengan ID "+productId+" tidak ditemukan");
        }
    }

    public static List<Product> getAll() {
        return productList;
    }

    public void info(){
        System.out.println("ID Product      : "+productId);
        System.out.println("Harga           : "+productPrice);
        System.out.println("Tipe            : "+productType);
    }
}