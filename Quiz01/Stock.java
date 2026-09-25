package Quiz01;

public class Stock {
    private int productId;
    private int quantity;
    private int shopNo;

    public Stock(int productId, int quantity, int shopNo) {
        this.productId = productId;
        this.quantity = quantity;
        this.shopNo = shopNo;
    }

    public int getProductId(){ 
        return productId; 
    }

    public int getQuantity(){ 
        return quantity; 
    }

    public void setQuantity(int quantity){ 
        this.quantity = quantity; 
    }

    public int getShopNo(){ 
        return shopNo; 
    }

    public void setShopNo(int shopNo){ 
        this.shopNo = shopNo; 
    }

    public void modifyStock(int newQuantity) {
        this.quantity = newQuantity;
        System.out.println("Stok dengan ProductId " +productId+ " di toko " +shopNo+" diubah menjadi : "+newQuantity);
    }

    public void info(){
        System.out.println("Stock ProductID     : "+productId);
        System.out.println("Stok yang ada       : "+quantity);
        System.out.println("Toko                : "+shopNo);
    }   
}
