package food;

public class RegularCustomers extends Customers implements Customer {
	double discount;
	
	
	RegularCustomers(Name cust_name,String address,String phone_no,double discount){
		super(cust_name,address,phone_no);
		this.discount = discount;
	}
	
	double getDiscount() {
		return discount;
	}
	void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public double payBill(Order order) {
		return order.calculateBill()*(1-discount);
	}
	
}
