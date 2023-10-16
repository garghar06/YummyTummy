package food;
import java.util.Scanner;

public class Customers {
	private Name cust_name;
	String address,phone_no;
	int cust_id = 0;
	Scanner sc = new Scanner(System.in);
	
	Customers(Name cust_name,String address,String phone_no){
		this.cust_name = cust_name;
		this.address = address;
		this.phone_no = phone_no;
		this.cust_id = custID();
	}
	
	
	public Name getName() {
		return cust_name;
	}
	
	
	String getaddress() {
		return address;
	}
	
	void setaddress(String address) {
		this.address = address;
	}
	
	String getPhoneNo() {
		return phone_no;
	}

	void setPhoneNo(String phone_no) {
		this.phone_no = phone_no;
	}
	
	
	int custID() {
		return ++cust_id;
	}


}
