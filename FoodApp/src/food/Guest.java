package food;

public class Guest extends Customers implements Customer{
	double deliveryCharges;
	
	Guest(Name cust_name,String address,String phone_no,double deliveryCharges){
		super(cust_name,address, phone_no);
		this.deliveryCharges = deliveryCharges;
	}
	
	double getDeliveryCharges() {
		return deliveryCharges;
	}
	void setDeliveryCharges(double deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}
	
	public double payBill(Order order) {
		return order.calculateBill() + deliveryCharges;
	}

}
