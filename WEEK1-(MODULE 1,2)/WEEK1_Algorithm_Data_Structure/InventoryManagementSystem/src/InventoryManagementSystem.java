import java.util.*;
class Product{
	private String productid;
	private String productname;
	private int quantity;
	private double price;
	public Product(String productid,String productname,int quantity,double price) {
		this.productid=productid;
		this.productname=productname;
		this.quantity=quantity;
		this.price=price;
	}
	public String getProductId() { return productid; }
    public void setProductId(String productId) { this.productid = productId; }

    public String getProductName() { return productname; }
    public void setProductName(String productName) { this.productname = productName; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
	
	

public class InventoryManagementSystem {
	private Map<String,Product> inventory;
	public InventoryManagementSystem() {
		this.inventory=new HashMap<>();
	}
	public void addProduct(Product p) {
		System.out.println("successfully added");
		inventory.put(p.getProductId(), p);
	}
	public void updateProduct(String productid,int q,double price) {
		Product p=inventory.get(productid);
		if(p!=null) {
			p.setPrice(price);
			p.setQuantity(q);
		}
		System.out.println("successfully updated");
	}
	public void deleteProduct(String productId) {
        inventory.remove(productId);
        System.out.println("successfully removed");
    }

    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InventoryManagementSystem ims = new InventoryManagementSystem();
		ims.addProduct(new Product("P001", "Laptop", 10, 999.99));
        ims.updateProduct("P001", 8, 979.99);
        ims.deleteProduct("P004");


	}

}
