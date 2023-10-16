package food;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Order {
	int order_id;
	Customers customer;
	List<Menu> orderedItems;
	
	Order(int order_id, Customers customer){
		this.order_id = order_id;
		this.customer = customer;
		this.orderedItems = new ArrayList<>();
	}
	
	int getOrderId() {
		return order_id;
	}
	void setOrderId(int order_id) {
		this.order_id = order_id;
	}
	
	Customers getCustomer() {
		return customer;
	}
	void setCustomer(Customers customer) {
		this.customer = customer;
	}
	
	void addItemToOrder(Menu item) {
		orderedItems.add(item);
	}
	void removeItem(Menu item) {
		orderedItems.remove(item);
	}
	List<Menu> getOrderItems(){
		return orderedItems;
	}
	
	double calculateBill() {
		double total = 0.0;
		for(Menu item : orderedItems) {
			total += item.getPrice();
		}
		return total;
	}
	
	void getbill() {
		
		
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(date);
        
        System.out.println("Order Date and Time: " + formattedDate);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items Ordered:");
        for (Menu item : orderedItems) {
            System.out.println("- " + item.getItemName() + ": rupee" + item.getPrice());
        }
        
		
	}
	
	
}
