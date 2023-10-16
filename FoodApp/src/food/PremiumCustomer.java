package food;

public class PremiumCustomer extends Customers implements Customer{
	String membershipCardNo;
	boolean freeDelivery;
	double specialDiscount;
	
	PremiumCustomer(Name cust_name,String address,String phone_no,String membershipCardNo){
		super(cust_name,address,phone_no);
		this.membershipCardNo = membershipCardNo;
		this.freeDelivery = true;
		this.specialDiscount = 0.5;
	}
	
	String getMembershipCardNo() {
		return membershipCardNo;
	}
	void setMembershipCardNo(String membershipCardNo) {
		this.membershipCardNo = membershipCardNo;
	}
	
	boolean isFreeDelivery() {
		return freeDelivery;
	}
	
	double getSpecialDiscount() {
		return specialDiscount;
	}
	void applySpecialDiscount(double discountPercentage) {
		specialDiscount = discountPercentage;
	}
	
	public double payBill(Order order) {
		double orderPrice = order.calculateBill();
		double discountedPrice = orderPrice - (orderPrice*specialDiscount);
		return discountedPrice;
	}

}
